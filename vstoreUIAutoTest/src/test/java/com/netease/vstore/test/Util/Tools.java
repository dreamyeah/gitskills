package com.netease.vstore.test.Util;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import org.testng.Assert;

public class Tools {
	/**
	 * 
	 * @param username  需要清除各类 限制的用户的用户名，如果不是163域的需要加上域信息。163域的可以不加.,这项不能为空，一定要传一个值
	 * @param ip  如果要清除ip限制那么请传被限制的ip
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static void clearTimesLimit(String username,String ip){
		String url = "http://reg.163.com/tools/timesLimit/change.do?";
		String para= "CHG_PASS_SERVICE=0&CHG_PASS_PAGE=0&TAK_PASS_PIN=0&TAK_PASS_QUS=0&ACC_LOCK_PIN=0&OTP_UNBIND_PIN=0&PHONE_UNBIND_PIN=0&REALNAME_ADMIN_QUERY=0&OTP_BIND=0&OTP_ADD=0&OTP_UNBIND=0&I_HASH_IP_TIMES=0&I_REG_LIMIT_MAP=0&I_IP_SUCCESS_MAP=0&I_LOG_LIMIT_MAP=0&I_IP_SUCCESS_LOGIN_MAP=7&I_GENERATE_NEW_E_CARD_IP=0&I_VERIFYPINMASERVLET=0&I_YIXIN_BIND=0&UI_HASH_USER_IP_FAIL_TIMES=0&UI_HASH_CHG_INFO=0&UI_HASH_VIEW_INFO=0&UI_HASH_CHG_SEC_INFO=0&UI_HASH_CHG_QA=0&UI_HASH_CHG_MAIL=0&UI_HASH_RETAKE_BY_QA=0&UI_HASH_RETAKE_BY_MOB=0&UI_HASH_RETAKE_BY_PINGMA=0&UI_HASH_RETAKE_BY_MAIL=0&UI_HASH_LOCK=0&UI_HASH_CHG_PASS=0&UI_HASH_BIND_MOB=0&UI_HASH_UNBIND_BY_PIN_OTP=0&UI_HASH_UNBIND_BY_PIN_PHONE=0&UI_HASH_UNBIND_BY_PIN_PPC=0&UI_HASH_UNBIND_BY_PIN_MPP=0&UI_HASH_GUA_SHI_ACCOUNT=0&UI_BIND_MOB=0&UI_HASH_UNBIND_MOBILE_BY_PIN=0&UI_HASH_UNBIND_WAIT_TIMES=0&UI_HASH_SSN_COORS=0&UI_YIXIN_CHG=0&U_LOGIN_FAIL_SSN=0&U_GENERATE_RANDOM_CODE_MAP=0&U_GENERATE_NEW_E_CARD_MAP=0&U_UNBIND_PHONE_ERR_TIMES_MAP=0&U_ADD_PHONE_ERR_TIMES_MAP=0&U_IS_PASS_PEOTECTED_USER=0&U_GENERATE_NEW_E_CARD_IP=0&U_SUCCESS_LOGIN_MAP=0&U_OTP_USERNAME_FAIL_TIMES=0&U_RECORD_HASHMAP=0&U_ACCTS_MONITOR_MAP=0&U_USERNAME_SUCCESS_MAP=0&U_OTP_LOGIN_SUCCESS_TIMES=0&U_USERNAME_CONTAINER=0&U_CHECK_ANSWER_MAP=0&U_QUERY_ACCOUNT_BY_MOBILE=0&U_BIND_MOB=0&U_SUSPICIOUS_MAP=0&U_DIGITALPWD_ERR=0&U_CHG_PWD_BY_MOBILE_ERR=0&U_LOGIN_REMINDER_VIP=0&U_MOB_ACTIVATE_REMINDER_REG=0&U_MBK_UNBIND=0&U_APP_MODIFY=0&U_REPLACE_MOBILE=0&U_UPSMS_VERIFY=0&U_RECOMMEND_BINDMOB=0&U_YIXIN_BIND=0&U_RESETPWD_SENDMAIL=0&U_COMMON_ACT_QUERY=0&U_DYNAMIC_PASS=0";
		String other= "&type=&username="+username+"&ip="+ip+"&alias=false";
		HttpGet request = new HttpGet(url+para+other);
		String DEFAULT_USER="Admin";
		String DEFAULT_PASS="Urs@qhkjy";
		String auth = DEFAULT_USER + ":" + DEFAULT_PASS;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
		 
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response;
		try {
			response = client.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			Assert.assertEquals(statusCode, 200);
			System.out.println(statusCode);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
	
	public static void main(String[] args) throws ClientProtocolException, IOException{
//		Tools.clearTimesLimit("urstest_jc01@163.com","");
		Tools.clearTimesLimit("urstestaccount002@163.com","");
	}
}
