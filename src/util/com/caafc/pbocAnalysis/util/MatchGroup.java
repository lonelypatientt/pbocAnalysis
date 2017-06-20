/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-20 上午09:46:24
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 数据分组算法
 * 
 * @author zhoul
 * @version $Revision:$
 */
public class MatchGroup {

	/**
	 * 数据分组算法
	 * 
	 * @param hay
	 */
	public static Map<String, Group> merge(List<String> hay) {
		Map<String, Group> groups = new HashMap<String, Group>();
		for (String key : hay) {
			groups.put(key, new Group());
		}
		for (String each : hay) {
			groups.get(each).getIns().add(each);
		}
		//display(groups);
		return groups;
	}

	public static void display(Map<String, Group> groups) {
		for (Entry<String, Group> each : groups.entrySet()) {
			System.err.println("++++++++++++++++++==");
			for (String g : each.getValue().getIns()) {
				System.err.println(g);
			}
			System.err.println("+++++++++++++++++++++");
		}
	}

	public static void main(String[] args) {
		List<String> hay = new ArrayList<String>();
		hay.add("1");
		hay.add("3");
		hay.add("5");
		hay.add("1");
		hay.add("5");
		hay.add("4");
		hay.add("6");
		hay.add("7");
		hay.add("9");
		hay.add("5");
		hay.add("3");
		MatchGroup m = new MatchGroup();
		Map<String, Group> map=m.merge(hay);
		System.out.println(map.size());
	}
}
