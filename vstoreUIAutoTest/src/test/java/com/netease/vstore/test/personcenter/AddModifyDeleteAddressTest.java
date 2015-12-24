package com.netease.vstore.test.personcenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.netease.vstore.PersonCerter;
import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.Login;
import com.netease.vstore.test.Util.Logout;
import com.netease.vstore.test.Util.Province;

public class AddModifyDeleteAddressTest {
			
	@BeforeSuite
	public void setEnviroment(){
		GlobalSetting.setEnviroment();
	}
		
		WebDriver driver;	
		
		
		@BeforeTest
		public void startChromePrintSceneMessage(){
			driver = new ChromeDriver();
			System.out.println("+-----------------------------------------------------------------------+");
			System.out.println("|                         PersonCerterTest                              |");
			System.out.println("|                     测试场景：     访问个人中心中的各个专栏                                                                             |");
			System.out.println("+-----------------------------------------------------------------------+");
		}
		
		@Parameters({"emailname","password"})
		@Test(priority = 1)
		public  void xiupinLoginTest(String emailname,String password) throws InterruptedException {
					
			Login.xiupinLogin(driver,emailname,password);
			
		}
			
		@Test(priority = 2)
		public  void ChangeProvince()  {
			
			
			Province.ChangeProvince(driver);   
		}
		
		@Test(priority = 3)
		public  void pofileIndexTest(){
			
			PersonCerter.pofileIndex(driver);
			
		}
		

		@Test(priority = 4)
		public  void addressTest(){
			
			PersonCerter.address(driver);
			
		}
		
		@Test(priority = 5)
		public  void AddAddressTest(){
			
			PersonCerter.addAddress(driver);
			
		}
		
		@Test(priority = 6)
		public  void ModifyAddressTest(){
			
			PersonCerter.modifyAddress(driver);
			
		}
		
		@Test(priority = 7)
		public  void deleteAddressTest(){
			
			PersonCerter.deleteAddress(driver);
			
		}

		@Test(priority = 8)
		public  void LogoutTest(){
			
			Logout.xiupinLogout(driver);
			
		}
		
		@AfterClass
		public void driverQuit(){
			
			driver.quit();
			
		}



}
