/*
 * Copyright (c) 2012 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: sagittarius
 * create: 2012-5-29 上午9:17:07
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.htmlAnalysis;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.caafc.pbocAnalysis.util.HtmlAnalysisUtil;

/**
 * TODO 请填写注释.
 * 
 * @author xihn
 * @version $Revision:$
 */
public class HtmlAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File input = new File("G:/个人信用报告.htm");
		try {
			Document doc = Jsoup.parse(input, "gb2312", "http://www.njcb.com.cn/");
			// Element content = doc.getElementById("content");
			Elements tables = doc.getElementsByTag("table");
			System.out.println(tables.size());
			Element table = tables.get(4);
			Elements tr = table.getElementsByTag("tr");
			System.out.println(tr.size());
			Elements span = tr.get(1).getElementsByTag("td");
			for (int i = 0; i < span.size(); i++) {
				String string = span.get(i).text();
				System.out.println(string+" >>>"+i);
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			Document doc = HtmlAnalysisUtil.parseHtml(input, HtmlAnalysisUtil.GB2312, "");
//			//Elements tables = HtmlAnalysisUtil.getElementsByTag(doc, "table");
//			//Element table = tables.get(4);
//			List<String> list = HtmlAnalysisUtil.getElementText(doc, "table", 4, "tr");
//			for (int i = 0; i < list.size(); i++) {
//				String s = (String) list.get(i);
//				System.out.println(s);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
