package com.jason.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HtmlUtil {


	public static String getHtml(String url) throws Exception  {
		System.out.println("访问的URL:" + url);
		String html = new String();
		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httpget
		HttpGet httpget = new HttpGet(url);
		try {
			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					html = EntityUtils.toString(entity, "UTF-8");
				}
			} finally {
				response.close();
			}
		} finally {
//			 关闭连接,释放资源
			 try {
			 httpclient.close();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		}
		if(html==null||html.equals("")){
			html=getHtml(url);
		}
		return html;
	}
	
	
	@SuppressWarnings("deprecation")
	public static String getHtmlByPost(String url,Map<String, String> params) throws Exception  {
		System.out.println("访问的URL:" + url);
		String html = new String();
		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httpget
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList <NameValuePair>();  
        
        Set<String> keySet = params.keySet();  
        for(String key : keySet) {  
            nvps.add(new BasicNameValuePair(key, params.get(key)));  
        }  
          
        try {  
        	httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } 
		try {
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					html = EntityUtils.toString(entity, "UTF-8");
				}
			} finally {
				response.close();
			}
		} finally {
//			 关闭连接,释放资源
			 try {
			 httpclient.close();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		}
		if(html==null||html.equals("")){
			html=getHtmlByPost(url,params);
		}
		return html;
	}
}
