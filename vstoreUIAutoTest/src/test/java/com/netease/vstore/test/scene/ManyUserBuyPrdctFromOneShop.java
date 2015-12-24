package com.netease.vstore.test.scene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.netease.vstore.*;
import com.netease.vstore.test.Util.*;
/**
 * 所有用户买一家商铺中的一件商品
 * @author hzgeqingyang
 * 
 */

public class ManyUserBuyPrdctFromOneShop
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
		System.out.println("|                       ManyUserBuyPrdctFromOneShop                     |");
		System.out.println("|                     测试场景：         所有用户 买一家商铺中的一件商品                                                            |");
		System.out.println("+-----------------------------------------------------------------------+");
	}
	

	@Test(dataProvider = "dataProvider")
	public void LoginAndBuyForEachUser(String emailname,String password){
		
					
		Login.xiupinLogin(driver,emailname,password);
				
		Province.ChangeProvince(driver);   

		Cart.cleanCart(driver);

		Schedule.schedule(driver);    
	
		Detail.detail(driver);    
		
		Cart.addToCart(driver);
				
		Cart.cart(driver);
				
		Purchase.purchaseIndex(driver);
			
		PaymentMethod.selectPaymentMethod(driver,paymentMethod);   
		
		Buy.buy(driver); 
		

		Cart.cleanCart(driver);

		Logout.xiupinLogout(driver);
	}
	
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] dataProvider(){
		
		Object[][] data = {
				
//				{"cktest1050@126.com","qa1234"},
//				{"cktest1051@126.com","qa1234"},
//				{"cktest1052@126.com","qa1234"},
//				{"cktest1053@126.com","qa1234"},
//				{"cktest1054@126.com","qa1234"},
//				{"cktest1055@126.com","qa1234"},
//				{"cktest1056@126.com","qa1234"},
//				{"cktest1057@126.com","qa1234"},
//				{"cktest1058@126.com","qa1234"},
//				{"cktest1059@126.com","qa1234"},
//				{"cktest1060@126.com","qa1234"},
//				{"cktest1061@126.com","qa1234"},
//				{"cktest1062@126.com","qa1234"},
//				{"cktest1063@126.com","qa1234"},
//				{"cktest1064@126.com","qa1234"},
//				{"cktest1065@126.com","qa1234"},
//				{"cktest1066@126.com","qa1234"},
//				{"cktest1067@126.com","qa1234"},
//				{"cktest1068@126.com","qa1234"},
//				{"cktest1069@126.com","qa1234"},
//				{"cktest1070@126.com","qa1234"},
//				{"cktest1071@126.com","qa1234"},
//				{"cktest1072@126.com","qa1234"},
//				{"cktest1073@126.com","qa1234"},
//				{"cktest1074@126.com","qa1234"},
//				{"cktest1075@126.com","qa1234"},
//				{"cktest1076@126.com","qa1234"},
//				{"cktest1077@126.com","qa1234"},
//				{"cktest1078@126.com","qa1234"},
//				{"cktest1079@126.com","qa1234"},
//				{"cktest1080@126.com","qa1234"},
				{"cktest1050@163.com","qa1234"},
				{"cktest1051@163.com","qa1234"},
				{"cktest1052@163.com","qa1234"},
				{"cktest1053@163.com","qa1234"},
				{"cktest1054@163.com","qa1234"},
				{"cktest1055@163.com","qa1234"},
//				{"cktest1056@163.com","qa1234"},
//				{"cktest1057@163.com","qa1234"},
//				{"cktest1058@163.com","qa1234"},
//				{"cktest1059@163.com","qa1234"},
//				{"cktest1060@163.com","qa1234"},
//				{"cktest1061@163.com","qa1234"},
//				{"cktest1062@163.com","qa1234"},
//				{"cktest1063@163.com","qa1234"},
//				{"cktest1064@163.com","qa1234"},
//				{"cktest1065@163.com","qa1234"},
//				{"cktest1066@163.com","qa1234"},
//				{"cktest1067@163.com","qa1234"},
//				{"cktest1068@163.com","qa1234"},
//				{"cktest1069@163.com","qa1234"},
//				{"cktest1070@163.com","qa1234"},
//				{"cktest1071@163.com","qa1234"},
//				{"cktest1072@163.com","qa1234"},
//				{"cktest1073@163.com","qa1234"},
//				{"cktest1074@163.com","qa1234"},
//				{"cktest1075@163.com","qa1234"},
//				{"cktest1076@163.com","qa1234"},
//				{"cktest1077@163.com","qa1234"},
//				{"cktest1078@163.com","qa1234"},
//				{"cktest1079@163.com","qa1234"},
//				{"cktest1080@163.com","qa1234"}

		};

		return data;
	}
	 
	
}
