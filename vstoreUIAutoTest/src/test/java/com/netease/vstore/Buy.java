package com.netease.vstore;

import org.openqa.selenium.By;
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
public class Buy implements LogBase{
	
	//购买商品,默认网易宝支付
	public static void buy(WebDriver driver){
		
		By buyLocator = By.xpath("//span[text()='提交订单']");
		By buyCheckLocator = By.xpath("//title[text()='网易宝收银台']");
		
		driver.findElement(buyLocator).click(); 

		//获取新窗口的句柄
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, buyCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//购买商品,默认网易宝支付
	public static void buyAlibaba(WebDriver driver){
		
		By buyLocator = By.xpath("//span[text()='提交订单']");
		By buyCheckLocator = By.xpath("//title[text()='支付宝 - 网上支付 安全快速！']");
		
		driver.findElement(buyLocator).click(); 

		//获取新窗口的句柄
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, buyCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//付款
	public static void pay(WebDriver driver){
		
		By bankCardLocator = By.xpath("//li[text()='储蓄卡']");

		By bankPayPageLocator = By.xpath("//button[@id='bankCardSumbit']");
		
		By payLocator = By.xpath("//input[@value='模拟工行充值']");
		By payCheckLocator = By.xpath("//span[text()='浙江省杭州市滨江区网商路599号']");
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,bankCardLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,bankPayPageLocator);
		
		//获取新窗口的句柄
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		UIAutoVstoreUtil.sleep(1000);
		UIAutoVstoreUtil.click(driver,payLocator);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, payCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	public static void pay1(WebDriver driver){
		
		By bankCardLocator = By.xpath("//li[text()='储蓄卡']");
		By selectbankLocator = By.xpath("//*[@id='selectOtherBtn']");
		By gongshangbankLocator = By.xpath("//*[@id='otherWebBankList']/li[16]/em");
		By bankPayPageLocator = By.xpath("//button[@id='bankCardSumbit']");
		
		By payLocator = By.xpath("//input[@value='模拟工行充值']");
		By payCheckLocator = By.xpath("//span[text()='浙江省杭州市滨江区网商路599号']");
		
		UIAutoVstoreUtil.sleep(500);
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(bankCardLocator)).click().perform();
		actions.moveToElement(driver.findElement(By.name("选择其他银行"))).click().perform();
		actions.moveToElement(driver.findElement(gongshangbankLocator)).click().perform();
		actions.moveToElement(driver.findElement(bankPayPageLocator)).click().perform();
//		driver.findElement(bankCardLocator).click(); 
//		driver.findElement(selectbankLocator).click();
//		driver.findElement(gongshangbankLocator).click();
//		UIAutoVstoreUtil.sleep(500);
//		driver.findElement(bankPayPageLocator).click();
		
		//获取新窗口的句柄
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		UIAutoVstoreUtil.sleep(1000);
		driver.findElement(payLocator).click();

		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, payCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//重新付款
	public static void rePay(WebDriver driver){
		
		By rePayLocator = By.xpath("//a[text()='重新付款']");
		By rePayCheckLocator = By.xpath("//title[text()='我的订单列表-秀品-有态度的时尚精品购物网站：网易旗下电商']");
		
		UIAutoVstoreUtil.sleep(1000);
		UIAutoVstoreUtil.click(driver, rePayLocator);
	
		//获取新窗口的句柄
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, rePayCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	

	
	
	public static double getPrdctTotolPriceInEpay(WebDriver driver){
		
		By totolPrice = By.xpath("//span[@class='ammountText']");
		
		
		double totol = 0;
		UIAutoVstoreUtil.sleep(2000);
		
		
		
		totol= Double.parseDouble(driver.findElement(totolPrice).getText());
		
		logger.info("总费用： "+totol);
		
		return totol;
	}
	

}
