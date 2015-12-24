package com.netease.vstore.test.scene;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.*;
import com.netease.vstore.test.Util.*;

/**
 * 依次浏览Schedule中的每个商品并购买一件
 * @author hzgeqingyang
 * 
 */
public class BuyEachPrdctFromSchedule {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	
	WebDriver driver;


	String winHandleBefore;
	String detailwinHandle;
	String purchasewinHandle;
	String paymentMethod="wangyibao";
	
	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                         BuyEachPrdctFromSchedule                      |");
		System.out.println("|                   测试场景：   依次浏览Schedule中的每个商品并购买一件                                                 |");
		System.out.println("+-----------------------------------------------------------------------+");
	}
	
	@Parameters({"emailname","password"})
	@Test(priority = 1)
	public  void xiupinLogin(String emailname,String password) throws InterruptedException {
		
		
		Login.xiupinLogin(driver,emailname,password);
		
	}
		
	
	@Test(priority = 2)
	public  void ChangeProvince() throws InterruptedException {
		
		
		Province.ChangeProvince(driver);   
	}
	
	@Test(priority = 3)
	public void cleanCart(){
		
		Cart.cleanCart(driver);
		
	}
	@Test(priority = 4)
	public  void schedule() throws InterruptedException {
		
		
		Schedule.schedule(driver);    
		//保存此时的窗口句柄
		winHandleBefore = driver.getWindowHandle();
	}
	
	@Test(dataProvider = "dataProvider",priority = 5)
	public  void BrowseGoodsAndBuy(String i) throws InterruptedException {
		
			driver.switchTo().window(winHandleBefore);
			By GoodsLocator = By.xpath("//div[@class='zlist f-cb j-flag']/div["+i+"]/div/a/img[2]");
			
			Detail.detailSpecial(driver,GoodsLocator);
			detailwinHandle = driver.getWindowHandle(); 
			
			Cart.addToCart(driver);

			Cart.cart(driver);

			Purchase.purchaseIndex(driver);
			purchasewinHandle = driver.getWindowHandle();
			UIAutoVstoreUtil.sleep(1000);
			PaymentMethod.selectPaymentMethod(driver,paymentMethod);   

			Buy.buy(driver); 	
			driver.close();
			
			driver.switchTo().window(purchasewinHandle);
			driver.close();
			
			driver.switchTo().window(detailwinHandle);
			driver.close();
			
	    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
	
	
	@DataProvider
	public Object[][] dataProvider(){
		
		Object[][] data = {
				//可以更多
				{"1"},
				{"2"},
				{"3"},
				{"4"},
				{"5"},
				{"6"},
				{"7"},
				{"8"},

		};

		return data;
	}

}