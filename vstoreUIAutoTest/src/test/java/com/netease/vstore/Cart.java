package com.netease.vstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.netease.vstore.test.Util.GlobalSetting;
import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Cart implements LogBase{
	
	//加入购物车
	public static void addToCart(WebDriver driver){
		
		By addToCartLocator = By.xpath("//span[text()='加入购物袋']");
		By addToCartCheckLocator = By.xpath("//div/span[text()='分']");
		
		if(UIAutoVstoreUtil.addToCartClickLinkNoSwitchWindow(driver, addToCartLocator, addToCartCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入购物车
	public static void cart(WebDriver driver){
		
		By CartLocator = By.xpath("//span[text()='购物袋']");
		By CartCheckLocator = By.xpath("//span[text()='内提交订单，超时您的商品就被别人抢走啦']");
		if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver, CartLocator, CartCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
		
	}
	
	//从schedule加入商品到购物车，默认一件
	public static void addToCartFromSchedule(WebDriver driver){
		
		By addToCartFromScheduleLocator = By.xpath("//p[@title='自动化测试商品2']");
		By addToCartFromScheduleCheckLocator = By.xpath("//div/span[text()='分']");
		
		Actions builder = new Actions(driver); 
		//从Locator左上角开始，向左(x)移动70个像素，向上(y)移动60个像素；(Locator,x,y)
		builder.moveToElement(driver.findElement(addToCartFromScheduleLocator),70,-60).perform();
		
		UIAutoVstoreUtil.sleep(1000);
		UIAutoVstoreUtil.click(driver,By.xpath("//div/a[text()='M']"));
		UIAutoVstoreUtil.click(driver,By.xpath("//span[text()='加入购物袋']"));


		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, addToCartFromScheduleCheckLocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
			
	}
	
	//清空购物车
	public static void cleanCart(WebDriver driver){
		
		String cart = "http://www.xiupin.com/cart";
		By cartLocator = By.xpath("//span[text()='删除']");
		
		driver.get(cart);
		UIAutoVstoreUtil.sleep(1000);
		try{
			driver.findElement(cartLocator);
			logger.info("Found "+cartLocator+" success!");
			UIAutoVstoreUtil.click(driver,cartLocator);
		}catch(org.openqa.selenium.NoSuchElementException ex){
			;
		}
		
		driver.get(GlobalSetting.mainsiteUrl);
		
	}

	
}
