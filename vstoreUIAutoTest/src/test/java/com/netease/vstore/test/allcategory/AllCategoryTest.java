package com.netease.vstore.test.allcategory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.Category.*;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class AllCategoryTest {
	
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
	
	WebDriver driver;	
	
	
	@BeforeTest
	public void startChromePrintSceneMessage(){
		driver = new ChromeDriver();
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("|                              AllCategoryTest                          |");
		System.out.println("|                         测试场景：         查看 AllCategory中的商品                                                   |");
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
	public void underClothesTest(){
		
		allCategory.underClothes(driver);
	}
	
	@Test(priority = 5)
	public void cosmeticTest(){
		
		allCategory.cosmetic(driver);
	}
	
	@Test(priority = 6)
	public void gentlemenTest(){
		
		allCategory.gentlemen(driver);
	}
	
	@Test(priority = 7)
	public void shoesBagTest(){
		
		allCategory.shoesBag(driver);
	}
	
	@Test(priority = 8)
	public void sportOutdoorsTest(){
		
		allCategory.sportOutdoors(driver);
	}
	
	@Test(priority = 9)
	public void kidswearTest(){
		
		allCategory.kidswear(driver);
	}
	
	
	@Test(priority = 10)
	public void houseTest(){
		
		allCategory.house(driver);
	}
	
	@Test(priority = 11)
	public void 	jewelryAccessoriesTest(){
		
		allCategory.jewelryAccessories(driver);
	}
	

	@Test(priority = 12)
	public  void LogoutTest(){
		
		Logout.xiupinLogout(driver);
		
	}
	@AfterClass
	public void driverQuit(){
		
		driver.quit();
		
	}
}
