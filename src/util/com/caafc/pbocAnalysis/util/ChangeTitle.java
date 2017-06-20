
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 职称转换
 */
public class ChangeTitle {
	public static String title(String s) {
		if (s.equals("高级")) {
			return "01";
		} else if (s.equals("中级")) {
			return "02";
		} else if (s.equals("初级")) {
			return "03";
		}  else if (s.equals("未知")) {
			return "99";
		}
		return "";
	}
}
