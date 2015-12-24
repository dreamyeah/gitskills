package com.netease.vstore.test.channel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.channel.WomenChannel;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class WomenChannelTest {
	
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
		System.out.println("|                         WomenChannelTest                              |");
		System.out.println("|                  测试场景：      鼠标放到主页女士频道，进入各个子频道                                                             |");
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
	public  void womenChannelTopClothesTest() throws InterruptedException {
	
		
		WomenChannel.womenChannelTopClothes(driver);    
	}
	
	@Test(priority = 4)
	public  void womenChannelBottomClothesTest() throws InterruptedException {
	
		
		WomenChannel.womenChannelBottomClothes(driver);    
	}
	
	@Test(priority = 5)
	public  void womenChannelAccessoryTest() throws InterruptedException {
	
		
		WomenChannel.womenChannelAccessory(driver);    
	}
	
	
	@Test(priority = 6)
	public  void womenChannelUnderWearTest() throws InterruptedException {
	
		
		WomenChannel.womenChannelUnderWear(driver);    
	}
	
	@Test(priority = 7)
	public  void xiupinLogout() throws InterruptedException {
			
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
	

}
