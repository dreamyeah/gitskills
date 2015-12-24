package com.netease.vstore.test.channel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.channel.Channel;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class ChannelTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                               ChannelTest                             |");
		System.out.println("|                          测试场景：          访问主页各个频道专栏                                                                 |");
		System.out.println("+-----------------------------------------------------------------------+");

	}
	
	
	@Parameters({"emailname","password"})
	@Test(priority = 1)
	public  void xiupinLoginTest(String emailname,String password) throws InterruptedException {
				
		Login.xiupinLogin(driver,emailname,password);
		
	}
		
	@Test(priority = 2)
	public  void ChangeProvince()  {
		
		
		Province.ChangeProvince(driver);   
	}
	
	@Test(priority = 3)
	public  void womenTest(){
		
		Channel.women(driver);
		
	}
	
	@Test(priority = 4)
	public void gentlemenTest(){
		
		Channel.gentlemen(driver);
		
	}
	
//	@Test(priority = 5)
//	public  void sportTest(){
//		
//		Channel.sport(driver);
//		
//	}
	

	
	@Test(priority = 6)
	public  void cosmeticTest(){
		
		Channel.cosmetic(driver);
		
	}
	
	@Test(priority = 7)
	public  void kidswearTest(){
		
		Channel.kidswear(driver);
		
	}
	@Test(priority = 8)
	public  void houseTest(){
		
		Channel.house(driver);
		
	}
	
//	@Test(priority = 9)
//	public  void accessoryTest(){
//		
//		Channel.accessory(driver);
//		
//	}
	
	@Test(priority = 10)
	public  void xiupinLogout() throws InterruptedException {
		
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

}
