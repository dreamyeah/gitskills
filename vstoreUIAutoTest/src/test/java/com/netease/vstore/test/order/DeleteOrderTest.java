package com.netease.vstore.test.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Order;
import com.netease.vstore.PersonCerter;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class DeleteOrderTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                              CancelOrderTest                          |");
		System.out.println("|                          测试场景：          删除所有取消后的订单                                                                 |");
		System.out.println("+-----------------------------------------------------------------------+");
	}
	
	@Parameters({"emailname","password"})
	@Test(priority = 1)
	public  void xiupinLoginTest(String emailname,String password) throws InterruptedException {
				
		Login.xiupinLogin(driver,emailname,password);
		
	}
		
	
	@Test(priority = 2)
	public  void ChangeProvince() throws InterruptedException {
		
		
		Province.ChangeProvince(driver);   
	}
	
	@Test(priority = 3)
	public  void pofileIndexTest(){
		
		PersonCerter.pofileIndex(driver);
		
	}
	
	@Test(priority = 4)
	public  void myOrderTest(){
		
		PersonCerter.myOrder(driver);
		
	}
	@Test(priority = 5)
	public void deleteOrderTest(){
		
		Order.deleteOrder(driver);
		
	}
	
	@Test(priority = 6)
	public  void LogoutTest(){
		
		Logout.xiupinLogout(driver);
		
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}


}
