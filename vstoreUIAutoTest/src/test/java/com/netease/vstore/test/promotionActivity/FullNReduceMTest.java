package com.netease.vstore.test.promotionActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Buy;
import com.netease.vstore.Cart;
import com.netease.vstore.Detail;
import com.netease.vstore.Purchase;
import com.netease.vstore.Schedule;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.NewAssert;
import com.netease.vstore.test.Util.PaymentMethod;
import com.netease.vstore.test.Util.Province;

public class FullNReduceMTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	

	//选择支付方式
	String paymentMethod="wangyibao";
	String CouponCode = "hzgeqingyang0603";
	WebDriver driver;
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                                  FullReduceTest                       |");
		System.out.println("|                         测试场景：         测试购买商品，满N元减M元的场景                                               |");
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
	public  void FullReduce() throws InterruptedException {
		
		
		Schedule.schedule(driver);    
				
		Detail.detail3(driver);
		
		double OriginalPrice = 0;
		OriginalPrice = Detail.getPrdctOriginalPrice(driver);

				
		Cart.addToCart(driver);

				
		Cart.cart(driver);

				
		Purchase.purchaseIndex(driver);


		double PuchasePrice = 0;
		PuchasePrice = Purchase.getPrdctPriceInPuchasePage(driver);
		
		double discount=0;
		discount = Purchase.getPrdctDiscountPriceInPuchasePage(driver);

		//断言 优惠是否生效
		NewAssert.assertEqual((OriginalPrice-PuchasePrice),discount);
		
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);
		
		Buy.buy(driver);   

				
		Buy.pay(driver);
		
			
	}

	
	@Test(priority = 5)
	public  void xiupinLogout() throws InterruptedException {
				
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
	

}
