
package com.netease.vstore.test.scene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.*;
import com.netease.vstore.test.Util.*;
/**
 * 
 * @author hzgeqingyang
 * 
 */

public class BuyOnePrdctWithAlibabaPaymethod{
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	

	//选择支付方式
	String paymentMethod="zhifubao";
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                      BuyOnePrdctWithAlibabaPaymethod                  |");
		System.out.println("|                     测试场景：          买一家商铺中的一件商品,支付宝支付                                                     |");
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
	public  void scheduleTest() throws Exception {
		
		
		Schedule.schedule(driver);    
	}
	
	@Test(priority = 5)
	public  void detailTest() throws InterruptedException {
				
		Detail.detail(driver);    
	}
	
	@Test(priority = 6)
	public  void addToCartTest() throws InterruptedException {
				
		Cart.addToCart(driver);
		
	}
	
	@Test(priority = 7)
	public  void CartTest() throws InterruptedException {
				
		Cart.cart(driver);
		
	}
	
	@Test(priority = 8)
	public  void purchaseIndex() throws Exception {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 9)
	public  void PaymentMethod() throws InterruptedException {
		
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 10)
	public  void buy() throws InterruptedException {
		
		Buy.buyAlibaba(driver);   
	}
	

	@Test(priority = 11)
	public  void xiupinLogout() throws InterruptedException {
		
		
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

	 
	
}
