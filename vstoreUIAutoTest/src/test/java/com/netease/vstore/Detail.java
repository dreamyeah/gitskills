package com.netease.vstore;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Detail implements LogBase{
	
	//进入商品详情页面
	public static void detail(WebDriver driver){
		
		By detailLocator = By.xpath("//div[@class='zlist f-cb j-flag']/div[1]");
		By detailCheckLocator = By.xpath("//span[@class='value']");
		
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, detailLocator, detailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	
	}
	
	public static void detail2(WebDriver driver){
		
		By detailLocator = By.xpath("//div[@class='zlist f-cb j-flag']/div[2]");
		By detailCheckLocator = By.xpath("//span[@class='value']");
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, detailLocator, detailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void detailSpecial(WebDriver driver,By detailLocator){
		
		By detailCheckLocator = By.xpath("//span[text()='商品名称：']");
		
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, detailLocator, detailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static void detail3(WebDriver driver){
		
		By detailLocator = By.xpath("//div[@class='zlist f-cb j-flag']/div[3]");
		By detailCheckLocator = By.xpath("//span[@class='value']");
		
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, detailLocator, detailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//选择商品颜色
	public static void SelectColor(WebDriver driver){
		
		By detailLocator = By.xpath("//a[@title='红色']/img");
		By detailCheckLocator = By.xpath("//div/a[@class='u-sel u-sel-color u-sel-color-selected']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, detailLocator, detailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//商品选择尺码
	public static void SelectSize(WebDriver driver){
		UIAutoVstoreUtil.sleep(2000);
		By detailLocator = By.xpath("//div[text()='M']");
		By detailCheckLocator = By.xpath("//div/div[2][@class='u-sel u-sel-size u-sel-size-selected']");
		
		try{
			WebElement element = driver.findElement(detailLocator);
			Actions actions = new Actions(driver);
			actions.moveToElement(element,5,2).click().perform();
			
		}catch(NoSuchElementException ex){
		
			logger.info("Click "+detailLocator+" failed!");
			Assert.fail();
		
		}catch(ElementNotVisibleException er){
		
			logger.info("Click "+detailLocator+" failed!");
			Assert.fail();
		
		}
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, detailCheckLocator,true);
		
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");;
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//购买未开售的商品
	public static void buyNotStartedProduct(WebDriver driver){
		
		By activityNotStarteLocator = By.xpath("//span[text()='活动未开始']");
		
		By activityNotStarteCheckLocator = By.xpath("//a[@class='u-btn3 j-cart u-btn-dis ']");

		UIAutoVstoreUtil.click(driver,activityNotStarteLocator);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, activityNotStarteCheckLocator,true);
		
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//网易补贴价
	public static double getPrdctOriginalPrice(WebDriver driver){
		By Original = By.xpath("//span[@class='j-subsidyPrice']");

		double OriginalPrice = 0;

		String PriceProduct =driver.findElement(Original).getText();
	
		OriginalPrice = Double.parseDouble(PriceProduct);
	
		
		logger.info("商品网易补贴价： "+PriceProduct);

		return OriginalPrice;
	}
	
	
	
}
