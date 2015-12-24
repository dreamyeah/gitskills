package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Province implements LogBase{
	
	
	//切换到云南省
	public static void ChangeProvince(WebDriver driver){
		
		
		String province = "云南省";
		String prefixProvince = GlobalSetting.mainsiteUrl+"province/s?p=";
		
		driver.get(prefixProvince+province);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, By.xpath("//body[text()='{\"result\":true}']"),true);
	
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
		
		//切换到主页
		driver.get(GlobalSetting.mainsiteUrl);
		
		
		
	}
}
