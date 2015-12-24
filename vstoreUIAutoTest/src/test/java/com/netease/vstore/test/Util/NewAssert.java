package com.netease.vstore.test.Util;

import org.testng.Assert;

public class NewAssert implements LogBase{
	
	public static void assertEqual(double actual,double expect){
		
		if(actual != expect){
			logger.info(actual+" not equal "+expect+" failed!");
			Assert.assertEquals(actual,expect);
		}else{
			logger.info(actual+" equal "+expect+" success!");
		}
		
	}

}
