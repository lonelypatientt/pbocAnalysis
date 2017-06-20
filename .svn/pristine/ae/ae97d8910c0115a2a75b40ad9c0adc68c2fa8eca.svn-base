package com.caafc.pbocAnalysis.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 系统参数获取工具
 * 
 * @author zl
 * @version $Revision: 1.1 $
 */
public class ParameterUtil {
	public static Properties prop = new Properties();
	
	
	public static Properties getProperties(String fileName) {
		Properties p = new Properties();
		try {
			p.load(new ParameterUtil().getClass().getResourceAsStream(fileName));
		}catch (IOException ioe) {
			ioe.getStackTrace();
		}
		return p;
	}

	/**
	 * 根据键读取对应值（默认文件名parameters.properties）
	 * @param key
	 * @return
	 */
	public static String getParameter(String key) {
		prop = getProperties(Parameters_Default.PARAMETERS);
		String value = prop.getProperty(key);
		if (value == null)
			return null;
		else
			return value.trim();
	}
	/**
	 * 根据键读取对应值（默认文件名errorInfo.properties）
	 * @param key
	 * @return
	 */
	public static String getErrorInfoParameter(String key) {
		prop = getProperties(Parameters_Default.ERROR_INFO);
		String value = prop.getProperty(key);
		if (value == null)
			return null;
		else
			return value.trim();
	}
	
	
	/**
	 * 根据文件和键读取对应值
	 * @param fileName 文件名称
	 * @param key
	 * @return
	 */
	public static String getPropertiesValue(String fileName,String key) {
		prop = getProperties(fileName);
		String value = prop.getProperty(key);
		if (value == null)
			return null;
		else
			return value.trim();
	}
	
}
