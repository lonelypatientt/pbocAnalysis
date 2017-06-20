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
 * 获得Blaze规则库server路径
 * blazeServer.properties.
 * 
 * @author xihn
 * @version $Revision:$
 */
public class ServerFileConfig {
	private static final org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory
			.getLog(ServerFileConfig.class);

	public static String SERVER_PATH;
	public static String APPROVALSERVER_PATH;
	public static String REBELLIONFAKESERVER_PATH;

	static {
		try {
			Properties prop = new Properties();
			prop.load(new ServerFileConfig().getClass().getResourceAsStream(
					"/blazeServer.properties"));
			SERVER_PATH = prop.getProperty("PreparApprovalPath");
			APPROVALSERVER_PATH = prop.getProperty("ApprovalPath");
			REBELLIONFAKESERVER_PATH = prop.getProperty("RebellionFakePath");
		} catch (IOException e) {
			logger.error("获得Blaze规则库server文件失败", e);
			throw new RuntimeException(e);
		}
	}
}
