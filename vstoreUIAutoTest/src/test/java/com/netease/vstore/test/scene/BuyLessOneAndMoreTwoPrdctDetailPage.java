package com.netease.vstore.test.scene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Cart;
import com.netease.vstore.Detail;
import com.netease.vstore.Schedule;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
import com.netease.vstore.test.Util.changePrdtCount;

/**
 * @author hzgeqingyang
 *
 */
public class BuyLessOneAndMoreTwoPrdctDetailPage {
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
		System.out.println("|                  BuyLessOneAndMoreTwoPrdctDetailPage                  |");
		System.out.println("|                测试场景：       在DetailPage购买同一商品 少于一件和多于两件                                           |");
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
	public void buyLessThanOneTest(){
		//num此时购买商品数量
		int num=1;
		changePrdtCount.decrPrdtCountDetailPage(driver,num);
		
	}
	
	@Test(priority = 7)
	public void buyMoreThanTwoTest(){
		//num此时购买商品数量
		int num=1;
		UIAutoVstoreUtil.sleep(3000);	
		changePrdtCount.incrPrdtCountDetailPage(driver,num);
		UIAutoVstoreUtil.sleep(1000);
		changePrdtCount.incrPrdtCountDetailPage(driver,num+1);
		
	}
	
	
	@Test(priority = 8)
	public  void xiupinLogout() throws InterruptedException {
		
		
		Logout.xiupinLogout(driver);    
	}
	

	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
}
