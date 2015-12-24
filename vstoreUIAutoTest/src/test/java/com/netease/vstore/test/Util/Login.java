package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.netease.vstore.test.Util.UIAutoVstoreUtil;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Login implements LogBase{
	
	
	//登录秀品
	public static void xiupinLogin(WebDriver driver,String email,String password){
		
		By login = By.xpath("//a[text()='登录']");
		By username = By.xpath("//input[@name='username']");
		By passwd = By.xpath("//input[@name='password']");
		By commit = By.xpath("//a[@class='btn commit']");
		driver.get(GlobalSetting.mainsiteUrl);
		
		driver.manage().window().maximize();
				
		UIAutoVstoreUtil.click(driver,login);
		UIAutoVstoreUtil.input(driver,username,email);
		UIAutoVstoreUtil.input(driver,passwd,password);
		UIAutoVstoreUtil.click(driver,commit);
			
		String name = UIAutoVstoreUtil.GetUsername(email);
		
		By checkName = By.xpath("//span[text()='"+name+"']");
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, checkName, true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
		
		
	}

}
