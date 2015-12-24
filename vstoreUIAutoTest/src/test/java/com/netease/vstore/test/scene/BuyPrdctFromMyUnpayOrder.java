package com.netease.vstore.test.scene;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.*;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.PaymentMethod;
import com.netease.vstore.test.Util.Province;

/**
 * 完成MyOrder中的未付款订单，完成付款
 * @author hzgeqingyang
 * 
 */
public class BuyPrdctFromMyUnpayOrder {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	
	String xiupinUrl = "http://xiupin.com/";
	//选择支付方式
	String paymentMethod="wangyibao";
	
	
	
	
	By payFromMyOrderCheckLocator0 = By.xpath("//title[text()='网易宝收银台']");
	By payFromMyOrderCheckLocator2 = By.xpath("//title[text()='支付宝收银台']");
	
	By payMethodLocator0 = By.xpath("//img[@src='/res/images/paymethod/0.png']");
	By payMethodLocator2 = By.xpath("//img[@src='/res/images/paymethod/2.png']");
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                       BuyPrdctFromMyUnpayOrder                        |");
		System.out.println("|                    测试场景：  完成MyOrder中的未付款订单，完成付款                                                      |");
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
	public  void purchaseIndex() throws InterruptedException {
				
		Purchase.purchaseIndex(driver);
		
	}
	
	@Test(priority = 9)
	public  void PaymentMethod() throws InterruptedException {
		
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
	}
	
	@Test(priority = 10)
	public  void buy() throws InterruptedException {
		
		Buy.buy(driver);   
	}
	
	@Test(priority = 11)
	public  void pofileIndexTest(){
		driver.get(xiupinUrl);
		PersonCerter.pofileIndex(driver);
		
	}
	
	@Test(priority = 12)
	public  void myOrderTest(){
		
		PersonCerter.myOrder(driver);
		
	}
	
	//网易宝支付
	@Test(priority = 13)
	public void payFromMyOrder(){
		Order.payFromMyOrder(driver, payMethodLocator0,payFromMyOrderCheckLocator0);
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
