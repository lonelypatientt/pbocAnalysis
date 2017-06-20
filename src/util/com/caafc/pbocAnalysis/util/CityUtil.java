/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-28 下午03:24:08
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import org.apache.commons.lang.StringUtils;

/**
 * 城市信息处理工具
 * @author zl 
 * @version $Revision:$
 */
public  class  CityUtil {
	
	/**
	 * 根据传过来的省市2级信息获取市级名称
	 * @param str 
	 * @return 市级名称
	 */
	public static String getCityName(String str){ 
		if(StringUtils.isNotEmpty(str)){
			str=str.replace("自治区", "省");
			int index=str.indexOf("省");
			if(index>0){
				return str.substring(index+1, str.length());
			}else{
				return str;
			}
		}
		return str;
	}
	public static void main(String[] args) {
		//String name="内蒙古自治区是丹佛";
		String name="江苏省南京市";
		
		System.out.println(CityUtil.getCityName(name));;
	}
}
