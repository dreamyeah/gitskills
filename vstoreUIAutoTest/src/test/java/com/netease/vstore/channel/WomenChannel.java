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
public class WomenChannel implements LogBase{
	
	public static void womenChannelTopClothes(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By women=By.xpath("//a[@href='/women']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(women)).perform();
		
		for(int iter = 1; iter<10;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq女上衣-频道']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(women)).perform();
			
		}
		
	}
	
	public static void womenChannelBottomClothes(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By women=By.xpath("//a[@href='/women']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(women)).perform();
		
	
		By locator=By.xpath("//li[@class='sub']/div[text()='yxq女下装-频道']/../a[1]");
		UIAutoVstoreUtil.sleep(1000);
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,locator,Checklocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" success!");
		}
		else{
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" failed!");
		}
		driver.close();	
			
		driver.switchTo().window(winHandleBefore);
		
	
		
	}

	public static void womenChannelAccessory(WebDriver driver){
	
	
	
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By women=By.xpath("//a[@href='/women']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(women)).perform();
		int sumOfAccessory = 4;
		for(int iter = 1; iter<sumOfAccessory;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq女配件-频道']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(women)).perform();
		
		}
	
	}
	
	public static void womenChannelUnderWear(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By women=By.xpath("//a[@href='/women']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(women)).perform();
		int sumOfUnderWear = 4;
		for(int iter = 1; iter<sumOfUnderWear;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq女内衣-频道']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(women)).perform();
		
		}
		
	}

}
