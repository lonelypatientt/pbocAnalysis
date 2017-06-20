/*
 * Copyright (c) 2012 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: XEDDemo
 * create: 2012-3-12 ����02:02:42
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 获得webServiec的URL
 * 
 * @author xihn
 * @version $Revision:$
 */
public class WebServiceUrlConfig {
	private static final org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory
			.getLog(WebServiceUrlConfig.class);

	public static String BLAZE_WEBSERVICE_URL;
	
	public static String LOACL_WEBSERVICE_URL;

	static {
		//获得blaze规则库webServiec的URL
		try {
			Properties prop = new Properties();
			prop.load(new WebServiceUrlConfig().getClass().getResourceAsStream(
					"/blazeWebService.properties"));
			BLAZE_WEBSERVICE_URL = prop.getProperty("preparApprovalService.url");
		} catch (IOException e) {
			logger.error("获得webservice请求URL失败！", e);
			throw new RuntimeException(e);
		}
		
		try {
			Properties prop = new Properties();
			prop.load(new WebServiceUrlConfig().getClass().getResourceAsStream(
					"/webService.properties"));
			LOACL_WEBSERVICE_URL = prop.getProperty("localPreparApprovalService.url");
		} catch (IOException e) {
			logger.error("获得webservice请求URL失败！", e);
			throw new RuntimeException(e);
		}
	}
}
