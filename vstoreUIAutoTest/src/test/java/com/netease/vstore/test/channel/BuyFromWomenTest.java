package com.netease.vstore.test.channel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.*;
import com.netease.vstore.channel.Channel;
import com.netease.vstore.test.Util.*;

/**
 * 
 * @author hzgeqingyang
 * 
 */

public class BuyFromWomenTest
{
	
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
		System.out.println("|                               BuyFromWomenTest                        |");
		System.out.println("|                      测试场景：          在女士专栏买一家商铺中的一件商品                                                     |");
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
	public  void womanTest(){
		
		Channel.women(driver);
		
	}
	
	@Test(priority = 5)
	public  void scheduleTest() throws InterruptedException {
		
		
		Schedule.schedule(driver);    
	}
	
	@Test(priority = 6)
	public  void detailTest() throws InterruptedException {
			
		Detail.detail(driver);    
	}
	
	@Test(priority = 7)
	public  void addToCartTest() throws InterruptedException {
				
		Cart.addToCart(driver);
		
	}
	
	@Test(priority = 8)
	public  void CartTest() throws InterruptedException {
				
		Cart.cart(driver);
		
	}
	
	@Test(priority = 9)
	public  void purchaseIndex() throws InterruptedException {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 10)
	public  void PaymentMethod() throws InterruptedException {
		
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 11)
	public  void buy() throws InterruptedException {
		
		Buy.buy(driver);   
	}
	
	
	@Test(priority = 12)
	public  void xiupinLogout() throws InterruptedException {
				
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

	 
	
}
