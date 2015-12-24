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
public class CosmeticChannel implements LogBase{
	
	public static void cosmeticChannelSkinCare(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By cosmetic=By.xpath("//a[@href='/cosmetic']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(cosmetic)).perform();
		int sumOfSkinCare = 4;
		for(int iter = 1; iter<=sumOfSkinCare;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='护肤yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(cosmetic)).perform();
			
		}
		
	}
	
	public static void cosmeticChannelCaiZhuang(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By cosmetic=By.xpath("//a[@href='/cosmetic']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(cosmetic)).perform();
		
		int sumOfCaiZhuang = 1;
		for(int iter = 1; iter<=sumOfCaiZhuang;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='彩妆yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(cosmetic)).perform();
			
		}
		
		
	}

	public static void cosmeticChannelPersonalCare(WebDriver driver){
	
	
	
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By cosmetic=By.xpath("//a[@href='/cosmetic']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(cosmetic)).perform();
		int sumOfPersonalCare = 0;
		for(int iter = 1; iter<=sumOfPersonalCare;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='个人护理yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(cosmetic)).perform();
		
		}
		
	}
	
	public static void cosmeticChannelTool(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By cosmetic=By.xpath("//a[@href='/cosmetic']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(cosmetic)).perform();
		int sumOfTool = 3;
		for(int iter = 1; iter<=sumOfTool;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='工具yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(cosmetic)).perform();
		
		}
		
	}

}
