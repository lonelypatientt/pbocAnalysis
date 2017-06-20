/*
 * Copyright (c) 2012 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: lavender
 * create: 2012-6-20 上午04:58:17
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.CycleDetectionStrategy;

/**
 * TODO 请填写注释.
 * @author lawever 
 * @version $Revision:$
 */
public class JsonUtils {
	public static JsonConfig configJson(String[] excludes, String datePattern) { 
		  JsonConfig jsonConfig = new JsonConfig(); 
		  jsonConfig.setExcludes(excludes); 
		  jsonConfig.setIgnoreDefaultExcludes(false); 
		  jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT); 
		  jsonConfig.registerJsonValueProcessor(Date.class, 
		    new JsonUtils.DateJsonValueProcessor(datePattern)); 
		  return jsonConfig; 

}
	
	public static class DateJsonValueProcessor implements JsonValueProcessor { 

		  private SimpleDateFormat sdf; 

		  public DateJsonValueProcessor() { 
		   sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		  } 

		  public DateJsonValueProcessor(String datePattern) { 
		   sdf = new SimpleDateFormat(datePattern); 
		  } 

		  public Object processArrayValue(Object value, JsonConfig jsonConfig) { 
		   return process(value); 
		  } 

		  public Object processObjectValue(String key, Object value, 
		    JsonConfig jsonConfig) { 
		   return process(value); 
		  } 

		  private Object process(Object value) { 
		   return sdf.format((Date) value); 
		  } 
		  
	}
	
//	public static void main(String[] args) { 
//		JSONObject jsonObject = JSONObject.fromObject(starvingProxy,JsonUtils.configJson(null, "yyyy-MM-dd")); 
//	}
	
}
