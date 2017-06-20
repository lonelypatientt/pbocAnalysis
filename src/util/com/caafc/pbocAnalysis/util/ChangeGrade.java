/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn
 * 职业等级
 */
public class ChangeGrade {
	public static String grade(String s) {
		if (s.equals("国家级机构颁发的执业资格证书")) {
			return "1";
		} else if (s.equals("省市级机构颁发的执业资格证书")) {
			return "2";
		} else if (s.equals("地市级机构颁发的执业资格证书")) {
			return "3";
		} else if (s.equals("独立行业协会或制订行业标准的企业颁发的执业资格证")) {
			return "4";
		} 
		return "";
	}
}
