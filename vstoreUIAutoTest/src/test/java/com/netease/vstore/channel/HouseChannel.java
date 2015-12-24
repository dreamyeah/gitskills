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
public class HouseChannel implements LogBase{
	
	public static void houseChannelFurniture(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By house=By.xpath("//a[@href='/house']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(house)).perform();
		int sumOfFurniture = 5;
		for(int iter = 1; iter<=sumOfFurniture;iter++)
		{	
			
			By locator=By.xpath("//li[@class='sub']/div[text()='家居布艺yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(house)).perform();
			
		}
		
	}
	
	public static void houseChannelUmbrellas(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By house=By.xpath("//a[@href='/house']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(house)).perform();
		int sumOfUmbrellas = 2;
		for(int iter = 1; iter<=sumOfUmbrellas;iter++)
		{	
			
			By locator=By.xpath("//li[@class='sub']/div[text()='雨伞雨具yxq']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(house)).perform();
			
		}
		
	}

}
