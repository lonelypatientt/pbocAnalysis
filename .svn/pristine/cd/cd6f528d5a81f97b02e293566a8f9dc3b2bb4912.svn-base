/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn
 * 人行征信中学历装换为key
	0       未知
	1	研究生
	2	大学本科（简称“大学”）
	3	大学专科和专科学校（简称“大专”）
	4	中等专业学校或中等技术学校
	5	技术学校
	6	高中
	7	初中
	8	小学
	9	文盲或半文盲

 */
public class ChangeEduLevel {
	
	public static String eduLevel(String s) {
		
		if (s.length()>4){
			if (s.substring(0, 4).equals("大学本科")) {
				return "25";
			} else if (s.substring(0, 4).equals("大学专科")) {
				return "30";
			} else if (s.substring(0, 4).equals("中等专业")) {
				return "40";
			}
		}else if (s.equals("未知")) {
			return "99";
		} else if (s.equals("研究生")) {
			return "20";
		} else if (s.equals("技术学校")){
			return "50";
		} else if (s.equals("高中")) {
			return "60";
		} else if (s.equals("初中")) {
			return "70";
		} else if (s.equals("小学")) {
			return "80";
		} else if (s.equals("文盲或半文盲")) {
			return "90";
		} 
		return "";
	}

}
