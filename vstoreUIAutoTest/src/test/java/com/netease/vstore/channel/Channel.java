package com.netease.vstore.channel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

/**
 * 访问各个频道
 * @author hzgeqingyang
 * 
 */
public class Channel implements LogBase{
	
	//进入女装频道
	public static void women(WebDriver driver){
		
		By womanLocator = By.xpath("//a[@href='/women']");
		By womanCheckLocator = By.xpath("//title[text()='女士-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, womanLocator, womanCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入男装频道
	public static void gentlemen(WebDriver driver){
		
		By gentlemenLocator = By.xpath("//a[@href='/gentlemen']");
		By gentlemenCheckLocator = By.xpath("//title[text()='男士-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, gentlemenLocator, gentlemenCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入运动频道
	public static void sport(WebDriver driver){
		
		By sportLocator = By.xpath("//a[@href='/sport']");
		By sportCheckLocator = By.xpath("//title[text()='运动-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, sportLocator, sportCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入母婴频道
	public static void kidswear(WebDriver driver){
		
		By kidswearLocator = By.xpath("//a[@href='/kidswear']");
		By kidswearCheckLocator = By.xpath("//title[text()='母婴-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, kidswearLocator, kidswearCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入美妆频道
	public static void cosmetic(WebDriver driver){
		
		By cosmeticLocator = By.xpath("//a[@href='/cosmetic']");
		By cosmeticCheckLocator = By.xpath("//title[text()='美妆-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, cosmeticLocator, cosmeticCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入家纺频道
	public static void house(WebDriver driver){
		
		By houseLocator = By.xpath("//a[@href='/house']");
		By houseCheckLocator = By.xpath("//title[text()='家居-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, houseLocator, houseCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入鞋包配饰频道
	public static void accessory(WebDriver driver){
		
		By accessoryLocator = By.xpath("//a[@href='/accessory']");
		By accessoryCheckLocator = By.xpath("//title[text()='鞋包配饰-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, accessoryLocator, accessoryCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	

}
