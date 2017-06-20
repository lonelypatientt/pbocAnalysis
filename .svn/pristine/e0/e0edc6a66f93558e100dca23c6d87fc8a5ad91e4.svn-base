/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-22 上午10:08:14
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

/**
 * TODO 请填写注释.
 * 
 * @author jsyh
 * @version $Revision:$
 */
public class TestSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "连云港";
		String s2 = "连云港市";
		String c1 = "";
		String c2 = "";
		if (s1.length() > s2.length()) {
			c1 = s1.substring(0, s2.length());
			c2 = s2;
		} else {
			c1 = s1;
			c2 = s2.substring(0, s1.length());
		}
		System.out.println(c1);
		System.out.println(c2);

		String m = "4";
		if (Character.isDigit(m.charAt(0))) {
			System.out.println(m);
		} else {
			System.out.println("not number");
		}

		String n1 = "23231045";
		String n2 = "310";
		if (n1.indexOf(n2) == -1) {
			System.out.println("no");
		} else {
			System.out.println("ok");
		}
		StringBuffer addNumber1 = new StringBuffer();
		String address = "江苏连云港市沭阳县友谊路888号学府小区2-1-402";
		cutNumber(addNumber1, address);
	}
	
	private static StringBuffer dd = new StringBuffer();
	
	private static void cutNumber(StringBuffer addNumber1, String address) {
		String ss = "";
		for (int i = 0; i < address.length(); i++) {
			String s = address.substring(i, i + 1);
			if (Character.isDigit(s.charAt(0))) {
				addNumber1.append(s);
				if(ss==""){
					ss = address.substring(0,i);
				}
				//if(address)
				System.out.println(">>>>>: "+dd);
			}
		}
		System.out.println(dd.append(ss).toString());
		System.out.println(addNumber1.toString());
	}

}
