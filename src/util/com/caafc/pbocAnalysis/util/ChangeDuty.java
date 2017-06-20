package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 职务转换
 */
public class ChangeDuty {
	public static String duty(String s) {
		if (s.equals("高级领导（行政级别局级及局级以上领导或大公司高级管理人员）")) {
			return "1";
		} else if (s.equals("中级领导（行政级别局级以下领导或大公司中级管理人员）")) {
			return "2";
		} else if (s.equals("一般员工")) {
			return "14";
		} else if (s.equals("其他")) {
			return "4";
		} else if (s.equals("未知")) {
			return "99";
		}
		return "";
	}
}
