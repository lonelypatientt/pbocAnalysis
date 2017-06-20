/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 人行征信客户居住状况转换为key
 */
public class ChangeResidence {

	public static String residence(String s) {
		if (s.equals("自置")) {
			return "1";
		} else if (s.equals("按揭")) {
			return "2";
		} else if (s.equals("亲属楼宇")) {
			return "3";
		} else if (s.equals("集体宿舍")) {
			return "4";
		} else if (s.equals("租房")) {
			return "5";
		} else if (s.equals("共有住宅")) {
			return "6";
		} else if (s.equals("其他")) {
			return "7";
		} else if (s.equals("未知")) {
			return "9";
		}
		return "";
	}

}
