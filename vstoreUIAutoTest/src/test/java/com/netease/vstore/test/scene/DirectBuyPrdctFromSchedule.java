package com.netease.vstore.test.scene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Buy;
import com.netease.vstore.Cart;
import com.netease.vstore.Purchase;
import com.netease.vstore.Schedule;
import com.netease.vstore.test.Util.*;
/**
 * 从Schedule中的直接购买商品
 * @author hzgeqingyang
 * 
 */
public class DirectBuyPrdctFromSchedule {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	

	String paymentMethod="wangyibao";
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                       DirectBuyPrdctFromSchedule                      |");
		System.out.println("|                     测试场景：         从Schedule中的直接购买商品                                                             |");
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
	public void cleanCart(){
		
		Cart.cleanCart(driver);
		
	}
	
	@Test(priority = 4)
	public  void scheduleTest() throws InterruptedException {
		
		
		Schedule.schedule(driver);    
	}
	
	@Test(priority = 5)
	public  void addToCartFromScheduleTest() throws InterruptedException {
		UIAutoVstoreUtil.sleep(2000);
		Cart.addToCartFromSchedule(driver);    
	}

	@Test(priority = 6)
	public  void CartTest() throws InterruptedException {
				
		Cart.cart(driver);
		
	}
	
	@Test(priority = 7)
	public  void purchaseIndex() throws InterruptedException {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 8)
	public  void PaymentMethod() throws InterruptedException {
		
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 9)
	public  void buy() throws InterruptedException {
		
		Buy.buy(driver);   
	}
	
	@Test(priority = 10)
	public  void xiupinLogout() throws InterruptedException {
		
		
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

}
