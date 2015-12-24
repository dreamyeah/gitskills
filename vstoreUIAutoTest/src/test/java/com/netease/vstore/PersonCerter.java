package com.netease.vstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
/**
 * 访问个人中心各个页面
 * @author hzgeqingyang
 * 
 */

public class PersonCerter implements LogBase{
	
	//进入我的秀品
	public static void pofileIndex(WebDriver driver){
		
		By pofileIndexLocator = By.xpath("//a[text()='个人中心']");
		
		By pofileIndexCheckLocator = By.xpath("//title[text()='秀品-个人中心-我的秀品-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.pofileIndexClickLinkNoSwitchWindow(driver, pofileIndexLocator, pofileIndexCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入我的订单
	public static void myOrder(WebDriver driver){
		
		By myOrderLocator = By.xpath("//a[@href='/myorder/']");
		
		By myOrderCheckLocator = By.xpath("//title[text()='我的订单列表-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, myOrderLocator, myOrderCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入基本信息
	public static void basicInfo(WebDriver driver){
		
		By basicInfoLocator = By.xpath("//a[@href='/profile/basicinfo']");
		
		By basicInfoCheckLocator = By.xpath("//title[text()='秀品-个人中心-基本信息-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, basicInfoLocator, basicInfoCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入收货地址
	public static void address(WebDriver driver){
		
		By addressLocator = By.xpath("//a[@href='/profile/address']");
		
		By addressCheckLocator = By.xpath("//title[text()='秀品-个人中心-我的地址-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, addressLocator, addressCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入优惠券/红包
	public static void coupon(WebDriver driver){
		
		By couponLocator = By.xpath("//li/a[@href='/coupon']");
		
		By couponCheckLocator = By.xpath("//title[text()='秀品-个人中心-我的优惠券-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, couponLocator, couponCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//红包
	public static void redbag(WebDriver driver){
		
		By redbagLocator = By.xpath("//a[text()='我的红包']");
		
		By redbagCheckLocator = By.xpath("//li[@class='item active']");
		
		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, redbagLocator, redbagCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入我的收藏
	public static void focus(WebDriver driver){
		
		By focusLocator = By.xpath("//li[@class='item secd ']/a[@href='/profile/focus']");
		
		By focusCheckLocator = By.xpath("//title[text()='秀品-个人中心-我的收藏-"+com.netease.vstore.test.Util.GlobalSetting.xiupinTitle+"']");

		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, focusLocator, focusCheckLocator)){
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	
	//进入我收藏的品牌
	public static void focusBrand(WebDriver driver){

		By focusBrandLocator = By.xpath("//a[text()='收藏的品牌']");
			
		By focusBrandCheckLocator = By.xpath("//li[@class='item active']");

		if(UIAutoVstoreUtil.ClickLinkNoSwitchWindow(driver, focusBrandLocator, focusBrandCheckLocator)){
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
		}
	}
	//添加地址
	public static void addAddress(WebDriver driver){
		
		String name = "葛庆阳";
		String address = "网商路599号（网易大厦）";
		String zipcode = "310052";
		String phoneNumber = "15050527361";
		By addAddressLocator = By.xpath("//span[text()='新增地址']");
		By consigneeNameLocator = By.xpath("//input[@name='consigneeName']");
		By selectCityLocator = By.xpath("//input[@placeholder='请选择城市']");
		By provinceLocator = By.xpath("//a[text()='浙江省']");
		By cityLocator = By.xpath("//a[text()='杭州市']");
		By districtsAndCountiesLocator = By.xpath("//a[text()='滨江区']");
		By streetLocator = By.xpath("//a[text()='我不知道']");
		By addressLocator = By.xpath("//input[@name='address']");
		By zipcodeLocator = By.xpath("//input[@name='zipcode']");
		By consigneeMobileLocator = By.xpath("//input[@name='consigneeMobile']");
		//By defaultAddressLocator = By.xpath("//label[text()='设为默认地址']");	
		By saveLocator = By.xpath("//a[text()='保 存']");	
		By Checklocator = By.xpath("//td[text()='网商路599号（网易大厦）']");
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,addAddressLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.input(driver,consigneeNameLocator,name);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,selectCityLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,provinceLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,cityLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,districtsAndCountiesLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,streetLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.input(driver,addressLocator,address);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.input(driver,zipcodeLocator,zipcode);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.input(driver,consigneeMobileLocator,phoneNumber);
		
		//UIAutoVstoreUtil.click(driver,defaultAddressLocator);
		
		UIAutoVstoreUtil.sleep(500);
		//保存
		UIAutoVstoreUtil.click(driver,saveLocator);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, Checklocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
			
	}
	//修改地址
	public static void modifyAddress(WebDriver driver){
		
		String name = "葛大爷";
		String address = "网易大厦";
		String zipcode = "310053";
		String phoneNumber = "15050527362";
		By modifyAddress = By.xpath("//td/a[text()='设为默认']/..//a[text()='修改']");
		By consigneeNameLocator = By.xpath("//input[@name='consigneeName']");
		By selectCityLocator = By.xpath("//input[@placeholder='请选择城市']");
		By provinceLocator = By.xpath("//a[text()='浙江省']");
		By cityLocator = By.xpath("//a[text()='杭州市']");
		By districtsAndCountiesLocator = By.xpath("//a[text()='上城区']");
		By streetLocator = By.xpath("//a[text()='我不知道']");
		By addressLocator = By.xpath("//input[@name='address']");
		By zipcodeLocator = By.xpath("//input[@name='zipcode']");
		By consigneeMobileLocator = By.xpath("//input[@name='consigneeMobile']");
	//	By defaultAddressLocator = By.xpath("//label[text()='设为默认地址']");	
		By saveLocator = By.xpath("//a[text()='保 存']");	
		By Checklocator = By.xpath("//span[text()='15050527362']");
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,modifyAddress);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.clear(driver,consigneeNameLocator);
		UIAutoVstoreUtil.input(driver,consigneeNameLocator,name);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,selectCityLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,provinceLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,cityLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,districtsAndCountiesLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.click(driver,streetLocator);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.clear(driver,addressLocator);
		UIAutoVstoreUtil.input(driver,addressLocator,address);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.clear(driver,zipcodeLocator);
		UIAutoVstoreUtil.input(driver,zipcodeLocator,zipcode);
		
		UIAutoVstoreUtil.sleep(500);
		UIAutoVstoreUtil.clear(driver,consigneeMobileLocator);
		UIAutoVstoreUtil.input(driver,consigneeMobileLocator,phoneNumber);
		
		//UIAutoVstoreUtil.click(driver,defaultAddressLocator);
		
		UIAutoVstoreUtil.sleep(500);
		//保存
		UIAutoVstoreUtil.click(driver,saveLocator);
		
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, Checklocator,true);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
			
	}
	
	//删除地址
	public static void deleteAddress(WebDriver driver){
		
		By modifyAddress = By.xpath("//td/a[text()='设为默认']/..//a[text()='删除']");
		
		By confirm = By.xpath("//a[text()='确 定']");
		
		By Checklocator = By.xpath("//span[text()='15050527362']");
		
		UIAutoVstoreUtil.click(driver,modifyAddress);
		UIAutoVstoreUtil.click(driver,confirm);
		Boolean flag = UIAutoVstoreUtil.ElementExist(driver, Checklocator,false);
		if(flag){
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			Assert.assertTrue(flag);
			
		}else{
			
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
			Assert.assertTrue(flag);
		}
	}
	
	

		
	

		
}
