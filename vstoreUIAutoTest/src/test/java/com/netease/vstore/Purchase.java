package com.netease.vstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Purchase implements LogBase{
	
	//进入purchase index页面
	public static void purchaseIndex(WebDriver driver) {
		
		By purchaseIndexLocator = By.xpath("//span[@class='w-btn4 pay f-fl f-cp ']");
		By purchaseIndexCheckLocator = By.xpath("//div[text()='15050527361']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, purchaseIndexLocator, purchaseIndexCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//从detail页面直接购买
	public static void purchaseFromDetail(WebDriver driver){
		
		By purchaseFromDetailLocator = By.xpath("//a[@class='u-btn5 j-directbuy ']/span[text()='立即购买']");
		By purchaseFromDetailCheckLocator = By.xpath("//div[text()='15050527361']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, purchaseFromDetailLocator, purchaseFromDetailCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	public static double getPrdctPriceInPuchasePage(WebDriver driver){
		By productPrice = By.xpath("//div[@class='s-fc5']");
		//By postage = By.xpath("//span[text()='运费：']");
		//By discountPrice = By.xpath("//div[@class='s-fc3 f-fs0']");
		
		//double SumActualPrice=0;
		double prdctActualPrice = 0;
		//double ActualPostagel= 0;
		//double discount = 0;
		UIAutoVstoreUtil.sleep(2000);
		
		prdctActualPrice = Double.parseDouble(driver.findElement(productPrice).getText().split("¥")[1]);
		
		//ActualPostagel = Double.parseDouble(driver.findElement(postage).getText().split("¥")[1]);
		
		//discount= Double.parseDouble(driver.findElement(discountPrice).getText().split("¥")[1]);
		
		//SumActualPrice = prdctActualPrice + ActualPostagel;
		
		logger.info("商品价格： "+prdctActualPrice);
//		logger.info("已优惠： "+discount);
//		logger.info("邮费： "+ActualPostagel);
//		logger.info("商品价格+邮费 = "+SumActualPrice);
		return prdctActualPrice;
	}
	
	public static double getPrdctDiscountPriceInPuchasePage(WebDriver driver){
		
		By discountPrice = By.xpath("//div[@class='s-fc3 f-fs0']");
		
		
		double discount = 0;
		UIAutoVstoreUtil.sleep(2000);
		
		
		
		discount= Double.parseDouble(driver.findElement(discountPrice).getText().split("¥")[1]);
		
		logger.info("已优惠： "+discount);
		
		return discount;
	}
	
	public static double getPrdctPostagelInPuchasePage(WebDriver driver){
		
		By postage = By.xpath("//span[text()='运费：']");
		
		
		double discount = 0;
		UIAutoVstoreUtil.sleep(2000);
		
		discount= Double.parseDouble(driver.findElement(postage).getText().split("¥")[1]);
		
		logger.info("运费： "+discount);
		
		return discount;
	}
}
