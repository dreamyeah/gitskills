package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class KidSwear implements LogBase {
	
	public static void GirlClothes(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq女童服装']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='女童背心吊带']");
		
		By locator2=By.xpath("//div/p[text()='yxq女童服装']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='女童T恤衬衫']");
		
		By locator3=By.xpath("//div/p[text()='yxq女童服装']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='女童鞋子']");
		
		By locator4=By.xpath("//div/p[text()='yxq女童服装']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='女童裤']");
		
		By locator5=By.xpath("//div/p[text()='yxq女童服装']/../div/a[5]/p");
		By Checklocator5=By.xpath("//a[text()='女童外套夹克']");
		

		
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
	
	public static void BoyClothes(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq男童服装']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='男童衬衫']");
		
		
		
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
	
	public static void kids(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='母婴多个类目']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='尿裤湿巾']");
		
		By locator2=By.xpath("//div/p[text()='母婴多个类目']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='车床出行多个类目']");
		
		By locator3=By.xpath("//div/p[text()='母婴多个类目']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='玩具图书']");
		
		By locator4=By.xpath("//div/p[text()='母婴多个类目']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='奶粉辅食']");

		

		
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


}
