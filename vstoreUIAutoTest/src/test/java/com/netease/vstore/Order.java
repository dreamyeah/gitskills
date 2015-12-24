package com.netease.vstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.netease.vstore.test.Util.LogBase;
import com.netease.vstore.test.Util.UIAutoVstoreUtil;
/**
 * 
 * @author hzgeqingyang
 * 
 */
public class Order implements LogBase{
	
	//取消未付款的订单
		public static void cancelOrder(WebDriver driver, int value){
			
			By cancelOrderLocator = By.xpath("//a[text()='取消订单']");
			By cancelOrderCheckLocator = By.xpath("//a[text()='取消订单']");
			
			int count=0;
			Boolean flag = whetherToloop(driver, cancelOrderCheckLocator);
			while(flag){
				
				//点击取消订单
				try{
					
					driver.findElement(cancelOrderLocator).click();
					
				}catch(NoSuchElementException ex){
				
					logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
					Assert.fail();
				
				}catch(ElementNotVisibleException er){
				
					logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
					Assert.fail();
				
				}
				
				//选择取消订单原因并点击确定
				SelectReason(driver,value);
				
				UIAutoVstoreUtil.sleep(1000);
				
				//判断是否还有待取消的订单
				flag = whetherToloop(driver, cancelOrderCheckLocator);

				count++;
			}
			
			System.out.println("Canceled:   "+count+"   Order(s)");
			
			flag = UIAutoVstoreUtil.ElementExist(driver, cancelOrderCheckLocator,false);

			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
			
		}
		
		//选择取消订单原因
		public static void SelectReason(WebDriver driver,int value){
			
			
			String valueToSelect = "";
			
			switch(value){
				case 1:
					valueToSelect = "请选择取消理由";
					break;
				case 2:
					valueToSelect = "买错商品了";
					break;
				case 3:
					valueToSelect = "订单信息填写错误";
					break;
				case 4:
					valueToSelect = "红包/优惠券使用问题";
					break;
				case 5:
					valueToSelect = "支付遇到问题";
					break;
				case 6:
					valueToSelect = "不想买了";
					break;
				default:
					valueToSelect = "其他原因";
					break;
			}
			
			
			WebElement select = driver.findElement(By.xpath("//select[@name='reason']"));
			Select dropDown = new Select(select);           

			List<WebElement> Options = dropDown.getOptions();
			for(WebElement option:Options){
			    if(option.getText().equals(valueToSelect)) {
			      option.click(); //select option here;       
			    }               
			}
			
			//确定
			try{
				driver.findElement(By.xpath("//span[text()='确 定']")).click();
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
			}catch(NoSuchElementException ex){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.fail();
				
			}catch(ElementNotVisibleException er){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.fail();
				
			}
			//取消
			//driver.findElement(By.xpath("//span[text()='取 消']")).click();

			
		}
		
		//删除订单
		public static void deleteOrder(WebDriver driver){
			
			By deleteOrderLocator = By.xpath("//a[text()='删除']");
			By deleteOrderCheckLocator = By.xpath("//a[text()='删除']");
			
			By  dltLocator = By.xpath("//a[text()='确 定']");
			//By  cancelLocator = By.xpath("//a[text()='取 消']");
			//第几页
			int page=1;
			By pageLocator = By.xpath("//a[text()='上一页']/../ul/li["+page+"]");
			UIAutoVstoreUtil.click(driver,pageLocator);
			int count=0;
			
			//判断是否有待删除的订单
			Boolean flag = whetherToloop(driver, deleteOrderCheckLocator);
			while(flag){
				
				//点击删除
				UIAutoVstoreUtil.click(driver,deleteOrderLocator);
				
				UIAutoVstoreUtil.sleep(500);
				//点击确定
				UIAutoVstoreUtil.click(driver,dltLocator);
				
				//判断是否还有待删除的订单
				flag = whetherToloop(driver, deleteOrderCheckLocator);
								
				count++;
			}
			
			logger.info("Deleted: "+count+" Order(s)");
			
			flag = UIAutoVstoreUtil.ElementExist(driver, deleteOrderCheckLocator,false);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
		
		//所有订单
		public static void allOrder(WebDriver driver){
			
			By  allOrderLocator = By.xpath("//div[text()='全部订单']");
			By  allOrderCheckLocator = By.xpath("//div[@class='nav']/div[1][@class='tab selected']");

			UIAutoVstoreUtil.click(driver,allOrderLocator);
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, allOrderCheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
		
		//待付款
		public static void UnpaidOrder(WebDriver driver){
			
			By  pendingChargesOrderLocator = By.xpath("//div[text()='待付款(']");
			By  pendingChargesOrderCheckLocator = By.xpath("//div[@class='nav']/div[2][@class='tab selected']");
			
			UIAutoVstoreUtil.click(driver,pendingChargesOrderLocator);
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, pendingChargesOrderCheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
		
		
		//待发货
		public static void ToBeShippedOrder(WebDriver driver){
			
			By  ToBeShippedOrderLocator = By.xpath("//div[text()='待发货(']");
			By  ToBeShippedOrderCheckLocator = By.xpath("//div[@class='nav']/div[3][@class='tab selected']");

			UIAutoVstoreUtil.click(driver,ToBeShippedOrderLocator);
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, ToBeShippedOrderCheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
		
		
		//已发货
		public static void ShippedOrder(WebDriver driver){
			
			By  ShippedOrderLocator = By.xpath("//div[text()='已发货(']");
			By  ShippedOrderCheckLocator = By.xpath("//div[@class='nav']/div[4][@class='tab selected']");

			UIAutoVstoreUtil.click(driver,ShippedOrderLocator);
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, ShippedOrderCheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
		
		
		//取消未付款的订单
		public static void cancelUnpaidOrder(WebDriver driver, int value){
			
			By cancelUnpaidOrderLocator = By.xpath("//a[text()='取消订单']");
			By cancelUnpaidOrderCheckLocator = By.xpath("//a[text()='取消订单']");
			int count=0;
			Boolean flag = whetherToloop(driver, cancelUnpaidOrderCheckLocator);
			while(flag){
				
				//点击取消订单
				
				UIAutoVstoreUtil.click(driver,cancelUnpaidOrderLocator);			
				//选择取消订单原因并点击确定
				SelectReason(driver,value);
				//判断是否还有待取消的订单
				flag = whetherToloop(driver, cancelUnpaidOrderCheckLocator);
				
				count++;
			}
			
			logger.info("Canceled: "+count+" Order(s)");
			
			flag = UIAutoVstoreUtil.ElementExist(driver, cancelUnpaidOrderCheckLocator,false);

			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
			
		}
		
		//取消未付款的订单
		public static void cancelUnshipedOrder(WebDriver driver, int value){
			
			By cancelUnpaidOrderLocator = By.xpath("//a[text()='取消订单']");
			By cancelUnpaidOrderCheckLocator = By.xpath("//a[text()='取消订单']");
			By drawbackMethodLocator0 = By.xpath("//input[@value='0']");
			By drawbackMethodLocator1 = By.xpath("//input[@value='1']");
			int count=0;
			Boolean flag = whetherToloop(driver, cancelUnpaidOrderCheckLocator);
			while(flag){
				
				//点击取消订单
				UIAutoVstoreUtil.click(driver,cancelUnpaidOrderLocator);
				
				//选择退款方式
				UIAutoVstoreUtil.click(driver,drawbackMethodLocator1);
				UIAutoVstoreUtil.click(driver,drawbackMethodLocator0);
				
				//选择取消订单原因并点击确定
				SelectReason(driver,value);
				
				//判断是否还有待取消的订单
				flag = whetherToloop(driver, cancelUnpaidOrderCheckLocator);
				
				count++;
			}
			
			logger.info("Canceled: "+count+" Order(s)");
			
			flag = UIAutoVstoreUtil.ElementExist(driver, cancelUnpaidOrderCheckLocator,false);

			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
			
		}

		//搜索订单
		public  static void searchOrder(WebDriver driver){
			By Locator = By.xpath("//input[@class='ipt f-fl']");
			
			By search = By.xpath("//div[text()='搜索']");
			
			By order = By.xpath("//span[@class='pleft']");
			//动态获取订单号 
			String orderCode =driver.findElement(order).getText();
			
			By CheckLocator = By.xpath("//span[text()='"+orderCode+"']");

			UIAutoVstoreUtil.input(driver,Locator, orderCode);
			UIAutoVstoreUtil.click(driver,search);
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, CheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
			
		}
		
		//从我的订单中付款
		public static void payFromMyOrder(WebDriver driver,By payMethod,By CheckLocator){
			
			By payFromMyOrderLocator = By.xpath("//div[text()='去付款']");

			UIAutoVstoreUtil.click(driver,payFromMyOrderLocator);
			UIAutoVstoreUtil.click(driver,payMethod);
			UIAutoVstoreUtil.click(driver,By.xpath("//span[text()='确 定']"));
			
			Boolean flag = UIAutoVstoreUtil.ElementExist(driver, CheckLocator,true);
			if(flag){
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" success!");
				Assert.assertTrue(flag);
				
			}else{
				
				logger.info(Thread.currentThread().getStackTrace()[1].getMethodName()+" failed!");
				Assert.assertTrue(flag);
			}
		}
				

		//判断元素是否存在
		public static boolean whetherToloop (WebDriver driver,By locator )
		{
			
			UIAutoVstoreUtil.sleep(500);
			try{
				driver.findElement(locator);
				
				return true;

			}catch(org.openqa.selenium.NoSuchElementException ex){
				
				return false;
			}
		}

}
