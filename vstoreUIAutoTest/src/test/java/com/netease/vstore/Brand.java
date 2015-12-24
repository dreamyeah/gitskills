package com.netease.vstore;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class Brand implements LogBase{
	
	
	public static void intoBrand(WebDriver driver){
		
		
		String brand = "http://www.xiupin.com/brand/settle";
		By Checklocator=By.xpath("//title[text()='品牌入驻页-秀品-有态度的时尚精品购物网站：网易旗下电商']");
	
		driver.get(brand);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, Checklocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
		
	}
	
	//http://www.xiupin.com/brand/settle页面查看品牌
	public static void checkBrand(WebDriver driver){
		
	
	
				
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
	
		//把以字母A到D开头的品牌加入map
		for(int i=3;i<29;i++){
			By locator=By.xpath("//ul[@class='f-cb']/li["+i+"]");
			By Checklocator=By.xpath("//ul[@class='f-cb']/li["+i+"][@class='itm active']");
			map.put(locator,Checklocator);
			
		}
		
		Set<By> set = map.keySet();
		  
		for(Iterator<By> iter = set.iterator(); iter.hasNext();)
		{
			
			
			By key = iter.next();
			By value = map.get(key);
			//System.out.println(key.toString());
			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,key,value)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" "+key+" success!");	
			}

		}
		
		
	}
	
	//主页查看品牌
	public static void checkIndexBrand(WebDriver driver){
		
		By locator1=By.xpath("//div[@class='markIcon']/div[1]/a/img");
		By Checklocator1=By.xpath("//title[text()='秀品-404-秀品-有态度的时尚精品购物网站：网易旗下电商']");
		
		By locator2=By.xpath("//div[@class='markIcon']/div[2]/a/img");
		By Checklocator2=By.xpath("//title[text()='秀品-404-秀品-有态度的时尚精品购物网站：网易旗下电商']");		

		By locator3=By.xpath("//div[@class='markIcon']/div[3]/a/img");
		By Checklocator3=By.xpath("//span[text()='ZARA']");	
		
		By locator4=By.xpath("//div[@class='markIcon']/div[4]/a/img");
		By Checklocator4=By.xpath("//title[text()='秀品-404-秀品-有态度的时尚精品购物网站：网易旗下电商']");	
		
		By locator5=By.xpath("//div[@class='markIcon']/div[5]/a/img");
		By Checklocator5=By.xpath("//title[text()='秀品-404-秀品-有态度的时尚精品购物网站：网易旗下电商']");	
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);
		map.put(locator4,Checklocator4);
		map.put(locator5,Checklocator5);
		
		Set<By> set = map.keySet();
		  
		for(Iterator<By> iter = set.iterator(); iter.hasNext();)
		{
			
			
			By key = iter.next();
			By value = map.get(key);
			System.out.println(key.toString());
			

			//下翻页面，否则挡住点击元素       
			//new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();

			WebElement element = driver.findElement(key);

			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().perform();
			
			//UIAutoVstoreUtil.sleep(2000);
			//窗口跳转
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, value,true);
			if(flag){
				
				logger.info("Click "+key+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info("Click "+key+" failed!");
				Assert.assertTrue(flag);
			}
			
			driver.close();
			
			driver.switchTo().window(winHandleBefore);
			//上翻翻页面，否则挡住点击元素 
			//new Actions(driver).sendKeys(Keys.PAGE_UP).perform();
		}
				
	}
	


}
