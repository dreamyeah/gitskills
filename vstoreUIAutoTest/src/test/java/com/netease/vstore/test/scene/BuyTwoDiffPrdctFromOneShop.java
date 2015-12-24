

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
 *  买一家商铺中的两件不同商品
 * @author hzgeqingyang
 * 
 */

public class BuyTwoDiffPrdctFromOneShop
{
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
		System.out.println("|                      BuyTwoDiffPrdctFromOneShop                       |");
		System.out.println("|                      测试场景：      买一家商铺中的两件不同商品                                                                     |");
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
		winHandleBefore=driver.getWindowHandle();
		
	}
	
	@Test(priority = 5)
	public  void detailTest1() throws InterruptedException {
			
		Detail.detail(driver);
		
	}
	
	
	
	@Test(priority = 6)
	public  void addToCartTest1() throws InterruptedException {
				
		Cart.addToCart(driver);
		driver.close();
	}
	
	@Test(priority = 7)
	public  void detailTest2() throws InterruptedException {
		driver.switchTo().window(winHandleBefore);	
		
		Detail.detail2(driver);
	}
	
	@Test(priority = 8)
	public  void addToCartTest2() throws InterruptedException {
		UIAutoVstoreUtil.sleep(1000);		
		Cart.addToCart(driver);
		
	}
	
	@Test(priority = 9)
	public  void CartTest() throws InterruptedException {
				
		Cart.cart(driver);
		
	}
			
	@Test(priority = 10)
	public  void purchaseIndex() throws InterruptedException {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 11)
	public  void PaymentMethod() throws InterruptedException {
		UIAutoVstoreUtil.sleep(1000);
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 12)
	public  void buy() throws InterruptedException {
		
		Buy.buy(driver);   
	}
	
	
	@Test(priority = 13)
	public  void xiupinLogout() throws InterruptedException {
	
		
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}

	 
	
}
