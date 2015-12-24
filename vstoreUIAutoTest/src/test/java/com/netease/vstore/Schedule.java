package com.netease.vstore;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Schedule implements LogBase{
	
	//进入schedule页面
	public static void schedule(WebDriver driver){
		
		By scheduleLocator = By.xpath("//div/a[@href='/schedule?scheduleId=1033019']/img");
		By scheduleCheckLocator = By.xpath("//title[text()='UI自动化测试商品-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
				
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, scheduleLocator, scheduleCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//另一个schedule
	public static void schedule2(WebDriver driver){
		
		By scheduleLocator2 = By.xpath("//div/a[@href='/schedule?scheduleId=1022095']/img");
		By scheduleCheckLocator2 = By.xpath("//title[text()='title=zhaiyao六一po-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
				
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, scheduleLocator2, scheduleCheckLocator2)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//通过价格搜索商品
	public static void SearchPrdctByPrice(WebDriver driver){
		
		String From = "39";
		String To = "41";
		By priceFrom = By.xpath("//input[@name='priceFrom']");
	
		By priceTo = By.xpath("//input[@name='priceTo']");
		
		By Enter = By.xpath("//a[@class='b j-flag']");
		
		//TAB键
		UIAutoVstoreUtil.input(driver,priceFrom,From + Keys.TAB);
		UIAutoVstoreUtil.input(driver,priceTo,To);

		try{
	
			Actions actions = new Actions(driver);

			actions.moveToElement(driver.findElement(Enter)).click().perform();
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			
		}catch(NoSuchElementException ex){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.fail();
			
		}catch(ElementNotVisibleException er){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.fail();
			
		}
		

	}
	
	

}
