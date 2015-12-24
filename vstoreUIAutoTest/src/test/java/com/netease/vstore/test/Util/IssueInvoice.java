package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class IssueInvoice implements LogBase{
	
	/**
	 * 
	 * @param method /person or company
	 * 
	 */
	public static void selectIssueInvoicePerson(WebDriver driver){
		

		UIAutoVstoreUtil.click(driver,By.xpath("//label[text()='开发票']"));
		
		//By methodlocator =By.xpath("//label[text()='个人']");
			
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, By.xpath("//tr[@style='display: none;']"),false);
			
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
			
		

	} 
	
	/**
	 * 
	 * @param method /person or company
	 * 
	 */
	public static void selectIssueInvoiceCompany(WebDriver driver,String companyName){

			
			By methodlocator =By.xpath("//label[text()='公司']");
			
			UIAutoVstoreUtil.click(driver,methodlocator);
			UIAutoVstoreUtil.input(driver,By.xpath("//input[@class='w-ipt ipt f-fl']"),companyName);
			UIAutoVstoreUtil.click(driver,By.xpath("//a/span[text()='确定']"));
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, By.xpath("//span[text()='"+companyName+"']"),true);
			
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
	}
	
}
