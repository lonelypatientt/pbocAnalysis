/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-6-5 下午03:55:15
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提取webservice的公共方法
 * 
 * @author lq
 * @version $Revision: 1.0$
 */
public class ComWebServiceUtil {

	/**
	 * 检查集合，确保非空
	 * 
	 * @param list 	需要验证的集合
	 * @param o		集合中的对象类型
	 * @param size	集合的大小
	 */
	public static List checkList(List list, Object o, int size) {

		//如果传入集合为空，则新建
		if (list == null) {
			list = new ArrayList();
		}

		//如果传入集合(或者刚新建的集合)大小小于规定大小，则补齐
		if (list.size() < size) {
			int lSize = size - list.size();

			for (int i = 0; i < lSize; i++) {
				list.add(o);
			}
		}
		//如果传入集合(或者刚新建的集合)大小大于规定大小，则去尾
		else if (list.size() > size) {
			int rSize = list.size() - size;

			for (int i = rSize - 1; i >= 0; i--) {
				list.remove(size + i);
			}
		}
		
		//如果集合中有为空的对象，则将默认对象补入
		for (int i = 0; i<list.size(); i++) {
			if(list.get(i) == null){
				list.set(i, o);
			}
		}

		return list;
	}

	/**
	 * 将决策输出获得的结果数组转化成字符串
	 * 
	 * @param resMap	决策输出结果map
	 * @param size		结果数组大小
	 * @param key		结果数组key值
	 * @return
	 */
	public static String resultArrToString(Map<String, Object> resMap, int size, String key) {
		StringBuffer rs = new StringBuffer();
		for (int i = 1; i <= size; i++) {
			Object o = resMap.get(key + "[" + i + "]");
			if (o != null && !o.toString().trim().equals("")) {
				rs.append(o).append(",");
			}
		}

		//去掉最后一个","
		if (rs.length() != 0) {
			String rsStr = rs.substring(0, rs.length() - 1);
			return rsStr;
		} else {
			return rs.toString();
		}

	}

	/**
	 * 将数组转化成字符串
	 * 
	 * @param strList	需要转化的集合
	 * @return
	 */
	public static String resultArrToString(List<String> strList) {
		StringBuffer rs = new StringBuffer();

		if (strList != null) {
			for (String str : strList) {
				rs.append(StringUtil.safeNotNull(str)).append(",");
			}
		}

		//去掉最后一个","
		if (rs.length() != 0) {
			String rsStr = rs.substring(0, rs.length() - 1);
			return rsStr;
		} else {
			return rs.toString();
		}

	}

	/**
	 * 确保日期字符串非空，如果为空，给到默认值
	 * 
	 * @param dateStr	日期字符串
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal dateStrNullToBig(String dateStr) throws ParseException, Exception {
		//若传入空值，则赋默认值
		if (dateStr == null || dateStr.trim().length() <= 0) {
			dateStr = Parameters_Default.DATE_VALUE;
		}

		return new BigDecimal(dateStr);
	}

	/**
	 * 确保日期数据非空(数据型)，如果为空，给指定默认值
	 * 
	 * @param big			数据型日期数据
	 * @param defaultValue 	默认值
	 * @return
	 */
	public static BigDecimal dateStrNullToBig(BigDecimal big, String defaultValue) {
		if (big != null) {
			return big;
		} else {
			return new BigDecimal(defaultValue);
		}
	}

	/**
	 * 确保日期非空，如果为空，给到默认值
	 * 
	 * @param date		日期
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal dateNullToBig(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (date == null) {
			date = sdf.parse(Parameters_Default.DATE_VALUE);
		}

		return new BigDecimal(sdf.format(date));
	}

	/**
	 * 确保输出值非null，如果为空，给到默认值
	 * 
	 * @param o		输出对象
	 * @return
	 */
	public static String objectNullToStr(Object o) {
		if (o != null) {
			return String.valueOf(o);
		} else {
			return "";
		}
	}

	/**
	 * 检查string类型集合(只适用于房贷)
	 * 
	 * @param strList		字符串类型集合
	 * @param listName_en	数组英文标示(用于检查字段)
	 * @param v				用于检查的对象
	 * @return
	 */
	public static ValidityMessage checkStrList(List<String> strList, String listName_en, ValidityMessage v) {
		// 先检查验证结果，如果结果中已经有错误信息，则直接返回
		if (!v.getResult()) {
			return v;
		}

		if (strList != null){
			for (String str : strList) {

				if (!v.getResult()) {
					break;
				}

				Map<String, Object> m = new HashMap<String, Object>();
				m.put(listName_en, str);
				//v = ValidityCheck.check(ConstField.DATAAREAS_HOUSELOANAPP, m);
			}
		}
		return v;
	}
	
	public static void main(String[] args) throws Exception {
		
		String dateStr2 = "20141201";
		
		System.out.println(new BigDecimal(dateStr2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(dateStr2);
		System.out.println(date);
		System.out.println(new BigDecimal(sdf.format(date)));
		System.out.println(dateStrNullToBig("20141201"));
	}
}
