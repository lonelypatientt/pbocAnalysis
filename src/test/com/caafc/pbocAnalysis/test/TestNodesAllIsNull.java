/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-1-11 下午02:22:11
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.caafc.pbocAnalysis.util.StringUtil;

/**
 * TODO 请填写注释.
 * 
 * @author jsyh
 * @version $Revision:$
 */
public class TestNodesAllIsNull {

	/**
	 * @param args
	 * @throws DocumentException
	 */
	public static void main(String[] args) throws DocumentException {
		// Calendar call = Calendar.getInstance();
		// call.setTime(new Date());
		// call.add(Calendar.MONTH, -1);
		// String lastDate = call.get(Calendar.YEAR) + "-" + call.get(Calendar.MONTH) + "-"
		// + call.get(Calendar.DAY_OF_MONTH);
		// System.out.println(lastDate);
		//
		// BigDecimal b = new BigDecimal(87.7678);
		// int i = b.intValue()/36;
		// System.out.println(b.intValue());
		File f = new File("D:/nn.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(f);
		Element root = doc.getRootElement();
		Element a1 = root.element("socialInsuranceDeliver");
		Element a2 = root.element("guarantees");
		Element a3 = root.element("creditAndLoanQueryRecords");
		boolean b1 = nodesAllIsNull(a1);
		boolean b2 = nodesAllIsNull(a2);
		boolean b3 = nodesAllIsNull(a3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

	// 判断根节点下所有子节点是否都为空值
	public static boolean nodesAllIsNull(Element pr) {
		boolean b = true;
		@SuppressWarnings("unchecked")
		List<Element> list = pr.elements();
		System.out.println(list.size());
		for (Element element : list) {
			if (StringUtil.isNotEmpty(element.getText().trim())) {
				b = false;
				break;
			}
		}
		return b;
	}

	public static Element checkChildNodes(Element pr) {
		if (pr.nodeCount() > 0) {
			List<Element> list = pr.elements();
			for (Element element : list) {
				checkChildNodes(element);
			}
		} else {
			return pr.getParent();
		}
		return pr;
	}
}
