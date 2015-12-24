package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class JewelryAccessories implements LogBase {
	
	public static void Jewelry(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq珠宝钻石']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='属性筛选']");
		
		By locator2=By.xpath("//div/p[text()='yxq珠宝钻石']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='黄金翡翠']");
		
		By locator3=By.xpath("//div/p[text()='yxq珠宝钻石']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='珍珠琥珀']");
		
	

		
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
	
	public static void HeadGear(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq首饰饰品']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='项链挂坠']");
		
		By locator2=By.xpath("//div/p[text()='yxq首饰饰品']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='手链手镯']");
		
		By locator3=By.xpath("//div/p[text()='yxq首饰饰品']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='戒指']");	
		
		By locator4=By.xpath("//div/p[text()='yxq首饰饰品']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='耳饰']");	
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);	
		map.put(locator4,Checklocator4);
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
	
	public static void Watch(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq手表']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='品牌流行手表']");
		

		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);



		
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
