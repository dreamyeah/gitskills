package com.netease.vstore.Category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class allCategory implements LogBase {
	
	public static void intoCategory(WebDriver driver){
		
		By CategoryLocator = By.xpath("//a[@href='/allCategory']");
		By CategoryCheckLocator = By.xpath("//title[text()='全部分类-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, CategoryLocator, CategoryCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}	
	
	
	
	public static void underClothes(WebDriver driver){
		
		By underClothesLocator = By.xpath("//div[text()='女装内衣']");
		By underClothesCheckLocator = By.xpath("//a[@class='active']/div[text()='女装内衣']");
				
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, underClothesLocator, underClothesCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void cosmetic(WebDriver driver){
		
		By cosmeticLocator = By.xpath("//div[text()='美妆']");
		By cosmeticCheckLocator = By.xpath("//a[@class='active']/div[text()='美妆']");
				
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, cosmeticLocator, cosmeticCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void gentlemen(WebDriver driver){
		
		By gentlemenLocator = By.xpath("//div[text()='男装']");
		By gentlemenCheckLocator = By.xpath("//a[@class='active']/div[text()='男装']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, gentlemenLocator, gentlemenCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	

	
	public static void shoesBag(WebDriver driver){
		
		By shoesBagLocator = By.xpath("//div[text()='鞋包']");
		By shoesBagCheckLocator = By.xpath("//a[@class='active']/div[text()='鞋包']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, shoesBagLocator, shoesBagCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void sportOutdoors(WebDriver driver){
		
		By sportOutdoorsLocator = By.xpath("//div[text()='运动户外']");
		By sportOutdoorsCheckLocator = By.xpath("//a[@class='active']/div[text()='运动户外']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, sportOutdoorsLocator, sportOutdoorsCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void kidswear(WebDriver driver){
		
		By kidswearLocator = By.xpath("//div[text()='母婴']");
		By kidswearCheckLocator = By.xpath("//a[@class='active']/div[text()='母婴']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, kidswearLocator, kidswearCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void house(WebDriver driver){
		
		By houseLocator = By.xpath("//div[text()='家居家纺']");
		By houseCheckLocator = By.xpath("//a[@class='active']/div[text()='家居家纺']");
				
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, houseLocator, houseCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void jewelryAccessories(WebDriver driver){
		
		By jewelryAccessoriesLocator = By.xpath("//div[text()='珠宝饰品']");
		By jewelryAccessoriesCheckLocator = By.xpath("//a[@class='active']/div[text()='珠宝饰品']");
				
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, jewelryAccessoriesLocator, jewelryAccessoriesCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	

	
	

}
