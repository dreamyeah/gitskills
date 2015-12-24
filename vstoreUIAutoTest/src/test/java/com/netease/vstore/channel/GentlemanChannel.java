package com.netease.vstore.channel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;








import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class GentlemanChannel implements LogBase{
	
	public static void gentlemanChannelTopClothes(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By gentleman=By.xpath("//a[@href='/gentlemen']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(gentleman)).perform();
		int sumOfTopClothes = 4;
		for(int iter = 1; iter<=sumOfTopClothes;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq男上衣-频道']/../a["+iter+"]");
			UIAutoVstoreUtil.sleep(1000);
			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,locator,Checklocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" failed!");
			}
			
			driver.close();	
			
			driver.switchTo().window(winHandleBefore);
			
			builder = new Actions(driver); 
			builder.moveToElement(driver.findElement(gentleman)).perform();
			
		}
		
	}
	



	
	public static void gentlemanChannelUnderWear(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By gentleman=By.xpath("//a[@href='/gentlemen']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(gentleman)).perform();
		int sumOfUnderWear = 2;
		for(int iter = 1; iter<=sumOfUnderWear;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq男内衣']/../a["+iter+"]");
			UIAutoVstoreUtil.sleep(1000);
			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,locator,Checklocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" failed!");
			}
		
			driver.close();	
		
			driver.switchTo().window(winHandleBefore);
		
			builder = new Actions(driver); 
			builder.moveToElement(driver.findElement(gentleman)).perform();
		
		}
		
	}

}
