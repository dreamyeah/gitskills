package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class UnderClothes implements LogBase {
	
	public static void Womentopcloth(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq女上衣']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='女款-属性筛选']");
		
		By locator2=By.xpath("//div/p[text()='yxq女上衣']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='女款背心']");
		
		By locator3=By.xpath("//div/p[text()='yxq女上衣']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[@href='/plist2?chlId=2&categoryId=9']");
		
		By locator4=By.xpath("//div/p[text()='yxq女上衣']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='女款羽绒服/棉服']");
		
		By locator5=By.xpath("//div/p[text()='yxq女上衣']/../div/a[5]/p");
		By Checklocator5=By.xpath("//a[text()='女款毛衣']");
		
		By locator6=By.xpath("//div/p[text()='yxq女上衣']/../div/a[6]/p");
		By Checklocator6=By.xpath("//a[@href='/plist2?chlId=2&categoryId=12']");
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);
		map.put(locator4,Checklocator4);
		map.put(locator5,Checklocator5);
		map.put(locator6,Checklocator6);
		
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
	
	public static void WomenAccessory(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq女配件']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='女款皮带腰带']");
		
		By locator2=By.xpath("//div/p[text()='yxq女配件']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='女款手套']");
		
		By locator3=By.xpath("//div/p[text()='yxq女配件']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='女款袜子']");
		
		By locator4=By.xpath("//div/p[text()='yxq女配件']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='女款帽子']");
		
		By locator5=By.xpath("//div/p[text()='yxq女配件']/../div/a[5]/p");
		By Checklocator5=By.xpath("//a[text()='女款围巾披肩']");
		
		By locator6=By.xpath("//div/p[text()='yxq女配件']/../div/a[6]/p");
		By Checklocator6=By.xpath("//a[text()='女款丝巾方巾']");
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);
		map.put(locator4,Checklocator4);
		map.put(locator5,Checklocator5);
		map.put(locator6,Checklocator6);
		
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
	
	public static void WomenBottomClothes(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq女下装']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='女款休闲裤']");
		
		By locator2=By.xpath("//div/p[text()='yxq女下装']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='女款连衣裙']");
		
		By locator3=By.xpath("//div/p[text()='yxq女下装']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='女款打底裤']");
		
		By locator4=By.xpath("//div/p[text()='yxq女下装']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='女款运动裤']");
		
		By locator5=By.xpath("//div/p[text()='yxq女下装']/../div/a[5]/p");
		By Checklocator5=By.xpath("//a[text()='女款牛仔裤']");
		
		By locator6=By.xpath("//div/p[text()='yxq女下装']/../div/a[6]/p");
		By Checklocator6=By.xpath("//a[text()='女款西装裤']");
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);
		map.put(locator3,Checklocator3);
		map.put(locator4,Checklocator4);
		map.put(locator5,Checklocator5);
		map.put(locator6,Checklocator6);
		
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
