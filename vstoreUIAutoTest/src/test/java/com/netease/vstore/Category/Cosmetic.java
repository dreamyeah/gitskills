package com.netease.vstore.Category;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;

public class Cosmetic implements LogBase {
	
	public static void SkinCare(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq护肤']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='珠宝']");
		
		By locator2=By.xpath("//div/p[text()='yxq护肤']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='唇部狐狸']");
		
		By locator3=By.xpath("//div/p[text()='yxq护肤']/../div/a[3]/p");
		By Checklocator3=By.xpath("//a[text()='脸部护理']");
		
		By locator4=By.xpath("//div/p[text()='yxq护肤']/../div/a[4]/p");
		By Checklocator4=By.xpath("//a[text()='精华乳液']");
		
		
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
	
	public static void cosmetics(WebDriver driver){
		
		By locator1=By.xpath("//div/p[text()='yxq彩妆']/../div/a[1]/p");
		By Checklocator1=By.xpath("//a[text()='美妆多个类目']");
		
		By locator2=By.xpath("//div/p[text()='yxq彩妆']/../div/a[2]/p");
		By Checklocator2=By.xpath("//a[text()='指甲油']");
		
	
		
		String winHandleBefore = driver.getWindowHandle();
		
		LinkedHashMap<By,By> map = new LinkedHashMap<By,By>();
		map.put(locator1,Checklocator1);
		map.put(locator2,Checklocator2);


		
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
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");	
		
	}

}
