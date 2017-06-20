package com.caafc.pbocAnalysis.util;

/**
 * 参数常量 (默认值)
 * modified by luqian at 201406
 * @author zl
 * @version $Revision: 1.1 $
 */
public interface Parameters_Default {
	//默认天数
	String DAY="day";
	String DAY_15_VALUE = ParameterUtil.getParameter(DAY);
	String DAY_30_VALUE = "30";
	String DAY_60_VALUE = "60";
	//默认日期
	String DATE="date";
	String DATE_VALUE = ParameterUtil.getParameter(DATE);
	//默认1
	String DEFAULT_1="default_1";
	String DEFAULT_1_VALUE = ParameterUtil.getParameter(DEFAULT_1);
	int DEFAULT_1_NUM = Integer.parseInt(DEFAULT_1_VALUE);
	//默认0
	String DEFAULT_0="default_0";
	String DEFAULT_0_VALUE = ParameterUtil.getParameter(DEFAULT_0);
	int DEFAULT_0_NUM = Integer.parseInt(DEFAULT_0_VALUE);
	//默认每月天数
	String MONTH_DAY = "month_day";
	String MONTH_DAY_VALUE = ParameterUtil.getParameter(MONTH_DAY);
   
	String ISNOTNULL = "isNotNull";
	String DATEFORMAT_YYYYMMDD = "yyyyMMdd";
	
	//参数文件
	String PARAMETERS="/parameters.properties";
	//错误信息文件
	String ERROR_INFO="/errorInfo.properties";
   
}
