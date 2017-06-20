/*
 * Copyright (c) 2011  Technology Ltd.
 * All rights reserved.
 *
 * project: nxcrm
 * create: 2011-5-14
 * cvs: $Id: BigDecimalUtil.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * BigDeimal格式化工具类 (2011-5-14 下午07:24:23)
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class BigDecimalUtil {
	
	public static String format(BigDecimal bigDecimal){
		DecimalFormat decFormat = new DecimalFormat("0.00");
		return decFormat.format(bigDecimal);
	}
	
	/**
	 * 转换数据
	 * @return
	 */
    public static BigDecimal strToBig(String str){
    	if(StringUtil.isNotEmpty(str)){
    		return new BigDecimal(str);
    	}
		return new BigDecimal(0);
    }
    
	/**
	 * 转换数据
	 * @param str 要转换的值
	 * @param defaultValue 如果为空默认值
	 * @return
	 */
    public static BigDecimal strToBig(String str,String defaultValue){
    	if(StringUtil.isNotEmpty(str)){
    		return new BigDecimal(str);
    	}
		return new BigDecimal(defaultValue);
    }
    
    /**
	 * 转换数据(不为空时转换)
	 * @param str 要转换的值
	 * @return
	 */
    public static BigDecimal strToBig2(String str){
    	if(StringUtil.isNotEmpty(str)){
    		return new BigDecimal(str);
    	}
    	else
    	{
    		return null;
    	}
    }
    
    /**
	 * 
	 * @param date
	 * @return
	 */
	public static BigDecimal dateToBig( Date date){
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return  new BigDecimal(format.format(date));
	}
	
	public static Object bigNotNull(Object o)
	{
		return o == null ? new BigDecimal(0) : o;
	}
}
