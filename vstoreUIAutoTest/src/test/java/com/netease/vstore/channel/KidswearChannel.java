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
public class KidswearChannel implements LogBase{
	
	
	public static void kidswearChannelClothes(WebDriver driver){
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By kidswear=By.xpath("//a[@href='/kidswear']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(kidswear)).perform();
		int sumOfClothes = 3;
		for(int iter = 1; iter<=sumOfClothes;iter++)
		{	
			
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq男女童服装']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(kidswear)).perform();
			
		}
		
	}
	
	public static void kidswearChannelBook(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By kidswear=By.xpath("//a[@href='/kidswear']");
		String winHandleBefore = driver.getWindowHandle();
		
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(kidswear)).perform();
		
		int sumOfBook = 2;
		for(int iter = 1; iter<=sumOfBook;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq玩具图书']/../a["+iter+"]");

			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,locator,Checklocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" failed!");
			}
			
			driver.close();	
			
			driver.switchTo().window(winHandleBefore);
			
			builder = new Actions(driver); 
			builder.moveToElement(driver.findElement(kidswear)).perform();
			
		}
		
		
	}

	public static void kidswearChannelShoes(WebDriver driver){
	
	
	
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By kidswear=By.xpath("//a[@href='/kidswear']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(kidswear)).perform();
		int sumOfShoes = 0;
		for(int iter = 1; iter<=sumOfShoes;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq男女童鞋']/../a["+iter+"]");

			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,locator,Checklocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+locator+" failed!");
			}
		
			driver.close();	
		
			driver.switchTo().window(winHandleBefore);
		
			builder = new Actions(driver); 
			builder.moveToElement(driver.findElement(kidswear)).perform();
		
		}
		
	}
	
	public static void kidswearChannelPregnant(WebDriver driver){
		
		
		
		By Checklocator=By.xpath("//title[text()='列表页-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		By kidswear=By.xpath("//a[@href='/kidswear']");
		String winHandleBefore = driver.getWindowHandle();
	
	
		Actions builder = new Actions(driver); 
		builder.moveToElement(driver.findElement(kidswear)).perform();
		int sumOfPregnant = 3;
		for(int iter = 1; iter<=sumOfPregnant;iter++)
		{	
			By locator=By.xpath("//li[@class='sub']/div[text()='yxq孕产用品']/../a["+iter+"]");
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
			builder.moveToElement(driver.findElement(kidswear)).perform();
		
		}
		
	}

}
