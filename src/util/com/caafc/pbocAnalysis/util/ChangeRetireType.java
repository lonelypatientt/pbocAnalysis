/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn
 * 离退休类别转换
 *
 */
public class ChangeRetireType {
	public static String retireType(String s) {
		if (s.equals("离休")) {
			return "1";
		} else if (s.equals("正常退休")) {
			return "2";
		} else if (s.equals("退职")) {
			return "3";
		} else if (s.equals("因病退休")) {
			return "4";
		} else if (s.equals("特殊工种退休")) {
			return "5";
		} else if (s.equals("工伤退休")) {
			return "6";
		} else if (s.equals("政策性提前退休")) {
			return "7";
		} else if (s.equals("特殊政策提前退休")) {
			return "8";
		} else if (s.equals("其他提前退休")) {
			return "9";
		} 
		return "";
	}
}
