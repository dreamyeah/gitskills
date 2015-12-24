package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class Gentlemen implements LogBase {
	
	public static void MenTopClothes(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq男上衣']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='男装-属性筛选']");
		
		By locator2=By.xpath("//div/p[text()='yxq男上衣']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='珠宝预售档期']");
		
		By locator3=By.xpath("//div/p[text()='yxq男上衣']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='男款衬衫']");
		
		By locator4=By.xpath("//div/p[text()='yxq男上衣']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='男款背心马甲']");
		
		By locator5=By.xpath("//div/p[text()='yxq男上衣']/../div/a[5]/p");
		By Checklocator5=By.xpath("//a[text()='男款T恤']");
		
		By locator6=By.xpath("//div/p[text()='yxq男上衣']/../div/a[6]/p");
		By Checklocator6=By.xpath("//a[text()='男款毛衣']");
		
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
	
	public static void MenTrousers (WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq男裤']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='男款牛仔裤']");
		
		
		
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
