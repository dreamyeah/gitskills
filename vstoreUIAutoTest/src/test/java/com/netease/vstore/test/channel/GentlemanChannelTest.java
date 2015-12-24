package com.netease.vstore.test.channel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.channel.GentlemanChannel;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class GentlemanChannelTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}

	String winHandleBefore;
	String paymentMethod="wangyibao";
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                        GentlemanChannelTest                           |");
		System.out.println("|                  测试场景：      鼠标放到主页男士频道，进入各个子频道                                                             |");
		System.out.println("+-----------------------------------------------------------------------+");
	}
	
	@Parameters({"emailname","password"})
	@Test(priority = 1)
	public  void xiupinLoginTest(String emailname,String password) throws InterruptedException {
				
		Login.xiupinLogin(driver,emailname,password);
		
	}
		
	
	@Test(priority = 2)
	public  void ChangeProvinceTest() throws InterruptedException {
				
		Province.ChangeProvince(driver);
		
	}
	
	@Test(priority = 3)
	public  void gentlemanChannelTopClothesTest() throws InterruptedException {
	
		
		GentlemanChannel.gentlemanChannelTopClothes(driver);    
	}
	
	@Test(priority = 4)
	public  void gentlemanChannelUnderWearTest() throws InterruptedException {
	
		
		GentlemanChannel.gentlemanChannelUnderWear(driver);    
	}
	

	
	@Test(priority = 5)
	public  void xiupinLogout() throws InterruptedException {
			
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

}
