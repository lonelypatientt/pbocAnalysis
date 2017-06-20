/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-22 下午06:50:05
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

/**
 * TODO 请填写注释.
 * @author jsyh 
 * @version $Revision:$
 */
public class TestCutNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "江苏连云港市沭阳县友谊路888号学府小区2-1-402";
		char[] chars = s.toCharArray();
		int be = 0;
		for (int i=0; i<chars.length; i++) {
			if(chars[i]>=48&&chars[i]<=57){
				if(be==0){
					be=1;
				}
				chars[i]='M';
			}
		}
		s=new String(chars);
		System.out.println(s.replaceAll("M", ""));
	}

}
