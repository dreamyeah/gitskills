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
 * 买两家商铺中的两件不同商品，每个商铺一件
 * @author hzgeqingyang
 * 
 */

public class BuyTwoPrdctFromTwoShop
{
	@BeforeSuite
	public void Message(){
		GlobalSetting.setEnviroment();
	}

	
	String xiupinUrl = "http://xiupin.com/";

	String winHandleBefore;
	String winHandleschedule;
	String paymentMethod="wangyibao";
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                         BuyTwoPrdctFromTwoShop                        |");
		System.out.println("|                   测试场景：   买两家商铺中的两件不同商品，每个商铺一件                                                     |");
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
		winHandleBefore=driver.getWindowHandle();
	}
	
	@Test(priority = 3)
	public void cleanCart(){
		
		Cart.cleanCart(driver);
		
	}
	
	@Test(priority = 4)
	public  void scheduleTest1() throws InterruptedException {
		UIAutoVstoreUtil.sleep(2000);
		Schedule.schedule(driver);
		winHandleschedule=driver.getWindowHandle();	
	}
	
	@Test(priority = 5)
	public  void detailTest1() throws InterruptedException {
				
		Detail.detail(driver);
		
	}
	
	
	
	@Test(priority = 6)
	public  void addToCartTest1() throws InterruptedException {
				
		Cart.addToCart(driver);
		driver.close();
		driver.switchTo().window(winHandleschedule);
		driver.close();
		
	}
	
	@Test(priority = 7)
	public  void scheduleTest2() throws InterruptedException {

		driver.switchTo().window(winHandleBefore);
		driver.get(xiupinUrl);
		UIAutoVstoreUtil.sleep(2000);	
		Schedule.schedule2(driver);

			
	}
	
	@Test(priority = 8)
	public  void detailTest2() throws InterruptedException {
			
		Detail.detail(driver);
	}
	
	@Test(priority = 9)
	public  void addToCartTest2() throws InterruptedException {
				
		Cart.addToCart(driver);
		
	}
	
	@Test(priority = 10)
	public  void CartTest() throws InterruptedException {
				
		Cart.cart(driver);
		
	}
			
	@Test(priority = 11)
	public  void purchaseIndex() throws InterruptedException {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 12)
	public  void PaymentMethod() throws InterruptedException {
		UIAutoVstoreUtil.sleep(1000);
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 13)
	public  void buy() throws InterruptedException {
		
		Buy.buy(driver);   
	}
	
	
	@Test(priority = 14)
	public  void xiupinLogout() throws InterruptedException {
		
		
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

	 
	
}
