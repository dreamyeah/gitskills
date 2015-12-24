package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class PaymentMethod implements LogBase{
	
		//支付方式选择
		//网易宝  == "wangyibao"
		//支付宝  =="zhifubao"
		//货到付款  == "cashOnDelivery"
	public static void selectPaymentMethod(WebDriver driver,String PaymentMethod){
		
		By Paylocator = null;
		By PayChecklocator=null;
		if(PaymentMethod=="wangyibao"){
				
			Paylocator =By.xpath("//input[@id='payforget0']");
			PayChecklocator = By.xpath("//td[text()='使用' and text()='网易宝']");
			
		}
		if(PaymentMethod=="zhifubao"){
				
			Paylocator =By.xpath("//input[@id='payforget2']");
			PayChecklocator = By.xpath("//td[text()='使用' and text()='支付宝']");
		}
		if(PaymentMethod=="cashOnDelivery"){
				
			Paylocator =By.xpath("//input[@id='payforget1']");
		
		}
			
		UIAutoVstoreUtil.click(driver,Paylocator);
		UIAutoVstoreUtil.sleep(500);
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, PayChecklocator,true);
		
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}

	} 
}
