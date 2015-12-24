package com.netease.vstore.test.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.thoughtworks.selenium.Wait;

/**
 * 
 * @author hzgeqingyang
 * 
 */
public class UIAutoVstoreUtil implements LogBase{
	

	//点击新开启窗口	
	public static Boolean ClickLinkWithSwitchWindow(WebDriver driver,By locator,By Checklocator){
		
		try{
			Actions actions = new Actions(driver);

			actions.moveToElement(driver.findElement(locator)).click().perform();
		
		}catch(NoSuchElementException ex){	
		
			logger.info("Click "+locator+ " failed!");
			Assert.fail();
	
		}catch(ElementNotVisibleException er){
	
			logger.info("Click "+locator+ " failed!");
			Assert.fail();
	
		}
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
        return ElementExist(driver, Checklocator,true);

	}
	
	
	
	//点击不开启新窗口
	public static Boolean ClickLinkNoSwitchWindow(WebDriver driver,By locator,By Checklocator){
			
		UIAutoVstoreUtil.click(driver,locator);
		
		return ElementExist(driver, Checklocator,true);
	
	}
	
	//进入profile index 我的秀品
	public static Boolean pofileIndexClickLinkNoSwitchWindow(WebDriver driver,By locator,By Checklocator){
		
			
		Actions builder = new Actions(driver); 
		
		builder.moveToElement(driver.findElement(By.xpath("//li[@class='item login-f']"))).perform();  

		UIAutoVstoreUtil.click(driver,locator);
		
		return ElementExist(driver, Checklocator,true);

	}
	
	//加入购物袋
	public static Boolean addToCartClickLinkNoSwitchWindow(WebDriver driver,By locator,By Checklocator){
			
		UIAutoVstoreUtil.click(driver,locator);
		
		Actions builder = new Actions(driver); 
		
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='btn f-cb']"))).perform();
		
		return ElementExist(driver, Checklocator,true);

	}
	
 
	
	//判断元素是否存在
	public static boolean ElementExist (WebDriver driver,By locator ,Boolean Expect)
	{
		//expectElementExistOrNot(driver,true,locator,30000);
		
		sleep(500);
		try{
			
			driver.findElement( locator );
			if(Expect){
				
				logger.info("Found "+locator+ " success!");
				return true;
			}else{
				
				logger.info("Not Found "+locator+ " failed!");
				Assert.fail();
				return false;
			}
			
			
		}catch(org.openqa.selenium.NoSuchElementException ex){
			
			
			if(!Expect){
				
				logger.info("Not Found "+locator+ " success!");
				return true;
			}else{
				
				logger.info("Found "+locator+ " failed!");
				Assert.fail();
				return false;
			}

		}
		
	}
	
	
	//单位毫秒
	public static void sleep(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		logger.info("Sleep "+time+ " ms");
		
	}
	
	public static void wait(WebDriver driver,int time){
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		
	}
	
	//获取邮箱的用户名部分
	public static String GetUsername(String emailaddress){
		String username="";
		int tempNum =emailaddress.indexOf("@");
		username = emailaddress.substring(0, tempNum);
		return username;
	}
	
	//点击元素
	public static void click(WebDriver driver,By Locator){
		//expectElementExistOrNot(driver,true,Locator,5000);
		try{
			
			driver.findElement(Locator).click();
			logger.info("Click "+Locator+" success!");
			
		}catch(NoSuchElementException ex){
		
			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}catch(ElementNotVisibleException er){

			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}
		
	}
	//向输入框输入文本
	public static void input(WebDriver driver,By Locator, String text){
		try{

			driver.findElement(Locator).sendKeys(text);
			logger.info("Click "+Locator+" success!");
			
		}catch(NoSuchElementException ex){
		
			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}catch(ElementNotVisibleException er){

			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}
		
	}
	//清除输入框中的内容
	public static void clear(WebDriver driver,By Locator){
		try{
			
			driver.findElement(Locator).clear();
			logger.info("Click "+Locator+" success!");
			
		}catch(NoSuchElementException ex){
		
			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}catch(ElementNotVisibleException er){

			logger.info("Click "+Locator+" failed!");
			Assert.fail();

		}
		
	}

	
	@SuppressWarnings("deprecation")
	public static void expectElementExistOrNot(final WebDriver driver,boolean expectExist, final By xpath, int timeout) {
		if (expectExist) {
			try {
				new Wait() {
					public boolean until() {
						return isElementPresent(driver,xpath);
					}
				}.wait("Failed to find element " + xpath, timeout);
			} catch (Exception e) {
				//e.printStackTrace();
				logger.info("Failed to find element " + xpath);
			}
			logger.info("Found desired element " + xpath);
		} else {
			pause(timeout);
			if (isElementPresent(driver,xpath)) {
				logger.info("Found undesired element " + xpath);
			} else {
				logger.info("Not found undesired element " + xpath);
			}
		}
	}
	public static boolean isElementPresent(WebDriver driver,By Locator) {
		boolean isPresent = driver.findElement(Locator).isDisplayed();
		if (isPresent) {
			logger.info("Found element " + Locator);
			return true;
		} else {
			logger.info("Not found element" + Locator);
			return false;
		}
	}
	
	/**
	 * Pause
	 * @param time in millisecond
	 */
	private static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
