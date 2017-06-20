/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn
 * 养老金缴费状态装换
 *
 */
public class ChangeAccountStatus {
	public static String accountStatus(String s) {
		if (s.length() > 4) {
			s = s.substring(0, 4);
		}
		if (s.equals("未参保")) {
			return "0";
		} else if (s.equals("参保缴费")) {
			return "1";
		} else if (s.equals("暂停缴费")) {// 暂停缴费(中断)
			return "2";
		} else if (s.equals("终止缴费")) {
			return "3";
		} else if (s.equals("未知")) {
			return "9";
		}
		return "";
	}
}
