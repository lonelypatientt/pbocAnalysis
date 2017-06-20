/*
 * Copyright (c) 2012 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: sagittarius
 * create: 2012-5-29 下午2:08:36
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * TODO 解析HTML工具类.
 * 
 * @author xihn
 * @version $Revision:$
 */
public class HtmlAnalysisUtil {
	public static String UTF = "UTF-8";

	public static String GB2312 = "gb2312";

	/**
	 * @param file 文件
	 * @param codeType 文件编码类型，如(gb2312)
	 * @param url(可选)
	 * @return Document
	 * @throws IOException
	 */
	public static Document parseHtml(File file, String codeType, String url) throws IOException {
		Document doc = Jsoup.parse(file, codeType, url);
		return doc;
	}

	/**
	 * 返回指定元素类型的元素组,如:table,br,div
	 * 
	 * @param Document doc
	 * @param String tag
	 * @return Elements
	 */
	public static Elements getElementsByTagForDoc(Document doc, String tag) {
		Elements els = doc.getElementsByTag(tag);
		return els;
	}

	/**
	 * 返回指定ID的元素
	 * 
	 * @param Document doc
	 * @param String eId
	 * @return Element
	 */
	public static Element getElementById(Document doc, String eId) {
		Element el = doc.getElementById(eId);
		return el;
	}

	/**
	 * 返回指定元素类型(如:table,br,div)内,指定下标元素内的内容,并放入list内
	 * 
	 * @param doc
	 * @param tag 指定的父元素类型
	 * @param index 指定元素索引下标(由0开始，如是第2个元素，则下标为1)
	 * @param tag2 指定的子元素类型
	 * @return
	 */
	public static List<String> getElementText(Document doc, String tag, int index, String tag2) {
		List<String> list = new ArrayList<String>();
		Elements els = doc.getElementsByTag(tag);
		Elements els2 = els.get(index).getElementsByTag(tag2);
		for (int i = 0; i < els2.size(); i++) {
			String s = els2.get(i).text();
			list.add(s);
		}
		return list;
	}

	/**
	 * 返回元素组内指定下标的元素
	 * 
	 * @param Elements els
	 * @param index 指定元素索引下标(由0开始，如是第2个元素，则下标为1)
	 * @return Element
	 */
	public static Element getElementsByIndex(Elements els, int index) {
		Element e = els.get(index);
		return e;
	}

	/**
	 * 返回元素内指定类型的元素组
	 * 
	 * @param Element el
	 * @param String tag
	 * @return Elements
	 */
	public static Elements getElementsByTagForElement(Element el, String tag) {
		Elements els = el.getElementsByTag(tag);
		return els;
	}

//	/**
//	 * 获得指定元素类型及下标的元素内容，并放入list中 
//	 * 例：要取得第5个table中第2个tr中所有td的内容，则tags[] = {"table","tr","td"} index[]={4,1}
//	 * 
//	 * @param doc
//	 * @param String[] tags
//	 * @param int[] index
//	 * @return
//	 */
//	public static List<String> getElementTextForDoc(Document doc, String[] tags, int[] index) {
//		List<String> list = new ArrayList<String>();
//		for (int i = 0; i < tags.length; i++) {
//			Elements els = doc.getElementsByTag(tags[i]);
//			Element e = els.get(index[i]);
//		}
//		Elements els = doc.getElementsByTag(tag);
//		Elements els2 = els.get(index).getElementsByTag(tag2);
//		for (int i = 0; i < els2.size(); i++) {
//			String s = els2.get(i).text();
//			list.add(s);
//		}
//		return list;
//	}
}
