package com.jason.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.jason.service.GetXiaoShuoService;
import com.jason.utils.HtmlUtil;

@Service
public class GetXiaoShuoServiceImpl implements GetXiaoShuoService {
	
	String prefix="http://www.biquge.com";

	public void getXiaoshuo(String name){
		
	}

	@Override
	public void getXiaoShuoByUrl(String url) {
		
		String html="";
		try {
			html = HtmlUtil.getHtml(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Document doc = Jsoup.parse(html);
		Element ename=doc.getElementById("info");
		String name=ename.getElementsByTag("h1").first().text();
		Element elist=doc.getElementById("list");
		Elements eles=elist.getElementsByTag("dd");
		List<String> urls=new ArrayList<String>();
		for(Element e:eles){
			String u=e.getElementsByTag("a").first().attr("href");
//			/3_3802/3246943.html
//			String u1=u.substring(8, 15);
//			if(Integer.parseInt(u1)>3246942){
//				
//			}
			urls.add(u);
		}
		
		Collections.sort(urls,Collator.getInstance(java.util.Locale.CHINA));
		for(String s:urls){
			try {
				this.addToTxt(s,name);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		
		System.out.println(urls.size());
	}
	
	public void addToTxt(String url,String filename){
		FileWriter fw;
		try {
			fw=new FileWriter(new File(filename+".txt"),true);
			String html=HtmlUtil.getHtml(prefix+url);
			Document doc = Jsoup.parse(html);
			String name=doc.getElementsByClass("bookname").first().getElementsByTag("h1").text();
			String content=doc.getElementById("content").html();
			content=content.replace("&nbsp;", "");
			content=content.replace("<br>", "");
			content=content.replace("<script>readx();</script>", "");
			fw.write(name);
			fw.write("\r\n");
			fw.write(content);
			fw.write("\r\n");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
