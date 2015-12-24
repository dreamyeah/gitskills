package com.netease.vstore.test.order;

import org.openqa.selenium.By;
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
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class CancelUnshipedOrderTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}

	//选择取消订单原因，不同值代表不同原因，详情追踪代码
	int SelectReason = 2;
	
	By cancelUnpaidOrderLocator = By.xpath("//a[text()='取消订单']");
	By cancelUnpaidOrderCheckLocator = By.xpath("//a[text()='取消订单']");
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                           CancelUnshipedOrderTest                       |");
		System.out.println("|                        测试场景：          取消待代发货中的所有未付款订单                                                       |");
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
	public void ToBeShippedOrder(){
		
		Order.ToBeShippedOrder(driver);
		
	}
	
	@Test(priority = 6)
	public void CancelUnshipedOrderTestTest(){
		
		UIAutoVstoreUtil.sleep(3000);
		Order.cancelUnshipedOrder(driver,SelectReason);
		
	}
	@Test(priority = 7)
	public  void LogoutTest(){
		
		Logout.xiupinLogout(driver);
		
	}
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}


}