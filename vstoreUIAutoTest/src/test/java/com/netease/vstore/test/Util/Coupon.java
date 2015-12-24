package com.netease.vstore.test.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Coupon implements LogBase{
	
	public static void SelectCoupon(WebDriver driver,String CouponCode){
		
		By CouponLocator = By.xpath("//span[text()='输入优惠码']");
		By InputCouponCodeLocator = By.xpath("//div[@class='row']/input[@type='text']");
		By EnterCodeLocator = By.xpath("//a[text()='激活并使用']");
		By cancelCodeLocator = By.xpath("//a[text()='取 消']");

		UIAutoVstoreUtil.click(driver,CouponLocator);
		UIAutoVstoreUtil.input(driver,InputCouponCodeLocator,CouponCode);
		UIAutoVstoreUtil.click(driver,EnterCodeLocator);	
		
		UIAutoVstoreUtil.sleep(1000);
		if(ElementExist(driver, By.xpath("//span[text()='该优惠券不存在']"))){
			
			logger.info("该优惠券不存在，点击取消");
			UIAutoVstoreUtil.click(driver,cancelCodeLocator);
			
			
		}else if(ElementExist(driver, By.xpath("//span[text()='该优惠券已过期']"))){
			
			logger.info("该优惠券已过期，点击取消");
			UIAutoVstoreUtil.click(driver,cancelCodeLocator);
			
		}else{
			
			logger.info("优惠券使用成功");
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			
		}
		
	}
	
	
	public static boolean ElementExist (WebDriver driver,By Locator)
	{
		try{
			driver.findElement( Locator );
			
			return true;
		
			
			
		}catch(org.openqa.selenium.NoSuchElementException ex){

			return false;
			
		}
		
	}
	

}
