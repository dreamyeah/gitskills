package com.netease.vstore.test.Util;

import java.io.IOException;

import org.testng.Assert;

public class GlobalSetting implements LogBase {
	
	public static String xiupinTitle = "秀品-有态度的时尚精品购物网站：网易旗下电商";
	
	public static String mainsiteUrl = "http://www.xiupin.com/";
	
	//设置chromedriver和测试环境
	public static void setEnviroment(){
		//test 环境
		String batName = "test";
		setChromeProperty();
		ChangeTestEnviroment(batName);
	}
	
	
	
	//设置chromedriver.exe的环境变量
	public static void setChromeProperty(){
		
		String dir = System.getProperty("user.dir");
		try{
			
			System.setProperty("webdriver.chrome.driver", dir+"/src/test/resources/chromedriver.exe");
			logger.info("setChromeProperty Success!");
			
		}catch(SecurityException e1){
			
			logger.info("setChromeProperty Failed!");
			Assert.fail();
			
		}catch(NullPointerException e2){
			
			logger.info("setChromeProperty Failed!");
			Assert.fail();
			
		}catch(IllegalArgumentException e3){
			
			logger.info("setChromeProperty Failed!");
			Assert.fail();
			
		}
		
		
	}
	
	//设置测试环境
	public static void ChangeTestEnviroment(String batName) {
		
		String dir = System.getProperty("user.dir");
		//test.bat 放到项目\\src\\test\\resource\\下
		String cmd = dir+"\\src\\test\\resources\\"+batName + ".bat";
		//System.out.println(cmd);
		try {
			Process ps = Runtime.getRuntime().exec(cmd);
			ps.waitFor();
			logger.info("Change Test Enviroment Success!");
			
		} catch (IOException ioe) {
			
			logger.info("Change Test Enviroment Failed!");
			
			ioe.printStackTrace();
			Assert.fail();
		}
		catch (InterruptedException e) {
			
			logger.info("Change Test Enviroment Failed!");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	
	




}
