/*
 * Copyright (c) 2013 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2013-10-16 下午04:05:48
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

/**
 * String doucument转换
 * @author zl 
 * @version $Revision:$
 */
public class StringDocumentConvert {
	Logger logger=Logger.getLogger(StringDocumentConvert.class);

	// 将返回的字符串转换成xml类型
	public static Document string2Document(String s) throws DocumentException {
		Document doc = null;
		doc = DocumentHelper.parseText(s);
		return doc;
	}
	
}
