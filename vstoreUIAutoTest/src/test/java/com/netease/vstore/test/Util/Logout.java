package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Logout implements LogBase {
	
	//退出秀品
	public static void xiupinLogout(WebDriver driver){
		
				
		driver.get(GlobalSetting.mainsiteUrl);
		
		By quit = By.xpath("//a[text()='退出登录']");		
		Actions builder = new Actions(driver); 
		
		builder.moveToElement(driver.findElement(By.xpath("//li[@class='item login-f']"))).perform();
		
		UIAutoVstoreUtil.click(driver,quit);
		
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, By.xpath("//a[text()='登录']"),true);
	
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		

	}

}
