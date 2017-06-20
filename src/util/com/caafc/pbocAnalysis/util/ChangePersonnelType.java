/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 人员类别
 * 
 */
public class ChangePersonnelType {
	public static String personnelType(String s) {
		if (s.equals("在职职工")) {
			return "1";
		} else if (s.equals("离岗")) {
			return "2";
		} else if (s.equals("失业")) {
			return "3";
		} else if (s.equals("离退休人员")) {
			return "4";
		} else if (s.equals("三无人员")) {
			return "5";
		} else if (s.equals("居民")) {
			return "6";
		} else if (s.equals("学生")) {
			return "7";
		} 
		return "";
	}
}
