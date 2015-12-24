package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.UIAutoVstoreUtil;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class changePrdtCount implements LogBase{
	
	
	
	
	//Detail Page 增加商品数量，同一件商品限制为最多两件
	public static void incrPrdtCountDetailPage(WebDriver driver,int num){
		if(num<2){
			By increaseLocator = By.xpath("//span[@class='more ']");
			By increaseCheckLocator = By.xpath("//span[@class='more z-dis']");		
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,increaseLocator,increaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}else{
			By increaseLocator = By.xpath("//span[@class='more z-dis']");
			By increaseCheckLocator = By.xpath("//p[text()='每款商品同尺码限购2件']");		
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,increaseLocator,increaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}
	}
	
	//Detail Page 减少商品数量
	public static void decrPrdtCountDetailPage(WebDriver driver,int num){
		if(num>1){
			By decreaseLocator = By.xpath("//span[@class='less ']");
			By decreaseCheckLocator = By.xpath("//span[@class='less z-dis']");
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,decreaseLocator,decreaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}else{
			By decreaseLocator = By.xpath("//span[@class='less z-dis']");
			By decreaseCheckLocator = By.xpath("//p[text()='本商品1件起售']");
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,decreaseLocator,decreaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}			
		}
	}
	
	//CartPage 增加商品数量，同一件商品限制为最多两件
	public static void incrPrdtCountCartPage(WebDriver driver,int num){
		if(num<2){
			By increaseLocator = By.xpath("//b[@class='plus']");
			By increaseCheckLocator = By.xpath("//b[@class='no-plus']");		
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,increaseLocator,increaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}else{
			By increaseLocator = By.xpath("//b[@class='no-plus']");
			By increaseCheckLocator = By.xpath("//div[text()='每款商品同尺码限购2件']");		
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,increaseLocator,increaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}
	}
	
	//CartPage 减少商品数量
	public static void decrPrdtCountCartPage(WebDriver driver,int num){
		if(num>1){
			By decreaseLocator = By.xpath("//b[@class='minus']");
			By decreaseCheckLocator = By.xpath("//b[@class='no-minus']");
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,decreaseLocator,decreaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}
		}else{
			By decreaseLocator = By.xpath("//b[@class='no-minus']");
			By decreaseCheckLocator = By.xpath("//b[@class='no-minus' and @id]");
			if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver,decreaseLocator,decreaseCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}			
		}
	}
				
}
