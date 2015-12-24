package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class House implements LogBase {
	
	public static void Furnishings(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq家纺布衣']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='凉席蚊帐']");
		
		By locator2=By.xpath("//div/p[text()='yxq家纺布衣']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='毛巾毯子']");
		
		By locator3=By.xpath("//div/p[text()='yxq家纺布衣']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='床上用品']");
		
	

		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);


		
		Set<By> set = map.keySet();
		  
		for(Iterator<By> iter = set.iterator(); iter.hasNext();)
		{
			
			
			By key = iter.next();
			By value = map.get(key);
			//System.out.println(key.toString());
			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,key,value)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+key+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+key+" failed!");
			}
			driver.close();
			driver.switchTo().window(winHandleBefore);
		}
		
		
	}
	
	public static void RainGear(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq雨伞雨具']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='雨伞']");
		
		By locator2=By.xpath("//div/p[text()='yxq雨伞雨具']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='雨衣']");		

		By locator3=By.xpath("//div/p[text()='yxq雨伞雨具']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='雨鞋']");	
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);
		
		Set<By> set = map.keySet();
		  
		for(Iterator<By> iter = set.iterator(); iter.hasNext();)
		{
			
			
			By key = iter.next();
			By value = map.get(key);
			//System.out.println(key.toString());
			if(UIAutoVstoreUtil.ClickLinkWithSwitchWindow(driver,key,value)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+key+" success!");
			}
			else{
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+"Click "+key+" failed!");
			}
			driver.close();
			driver.switchTo().window(winHandleBefore);
		}
		
		
	}

}
