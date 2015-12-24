package com.netease.vstore.test.promotionActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Buy;
import com.netease.vstore.Cart;
import com.netease.vstore.Detail;
import com.netease.vstore.Purchase;
import com.netease.vstore.Schedule;
import com.netease.vstore.test.Util.Coupon;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.NewAssert;
import com.netease.vstore.test.Util.PaymentMethod;
import com.netease.vstore.test.Util.Province;

public class CouponTest {
	
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
		System.out.println("|                                  CouponTest                           |");
		System.out.println("|                     测试场景：          买一家商铺中的一件商品并用测试优惠券                                                |");
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
	
	@Test(dataProvider = "dataProvider",priority = 4)
	public  void SelectCouponTest(String CouponCode , double couponValue) throws InterruptedException {
		
		
		Schedule.schedule(driver);    
				
		Detail.detail(driver);
		
				
		Cart.addToCart(driver);

				
		Cart.cart(driver);

				
		Purchase.purchaseIndex(driver);


		double PuchasePrice = 0;
		double afterUseCoupon = 0;
		PuchasePrice = Purchase.getPrdctPriceInPuchasePage(driver);
		
		Coupon.SelectCoupon(driver,CouponCode);
		
		afterUseCoupon = Purchase.getPrdctPriceInPuchasePage(driver);
		
		NewAssert.assertEqual((PuchasePrice-afterUseCoupon),couponValue);

		PaymentMethod.selectPaymentMethod(driver,paymentMethod);
		
		Buy.buy(driver);   

				
		Buy.pay(driver);
		
		Cart.cleanCart(driver);
		
	}

	
	@Test(priority = 5)
	public  void xiupinLogout() throws InterruptedException {
				
		Logout.xiupinLogout(driver);    
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] dataProvider(){
		
		Object[][] data = {
				//优惠券码                   优惠金额
				{"hzgeqingyang",0.0},//不存在的优惠券
				{"hzgeqingyang0603",0.0},//过期的优惠券
				{"hzgqy0703",1.0},//正常的优惠券

		};

		return data;
	}

}
