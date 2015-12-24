package com.netease.vstore.test.allcategory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Category.allCategory;
import com.netease.vstore.Category.UnderClothes;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class UnderClothesTest {
	
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
		System.out.println("|                           UnderClothesTest                            |");
		System.out.println("|                       测试场景：      所有分类中女装内衣的商品                                                                      |");
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
	public void intoCategoryTest(){
		
		allCategory.intoCategory(driver);
	}
	
	@Test(priority = 4)
	public void intoUnderClothesTest(){
		
		allCategory.underClothes(driver);
	}
	 
	@Test(priority = 5)
	public void WomentopclothTest(){
		
		UnderClothes.Womentopcloth(driver);
		
	}
	
	@Test(priority = 6)
	public void WomenAccessoryTest(){
			
		UnderClothes.WomenAccessory(driver);
			
	}
	
	@Test(priority = 7)
	public void WomenBottomClothesTest(){
			
		UnderClothes.WomenBottomClothes(driver);
			
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
