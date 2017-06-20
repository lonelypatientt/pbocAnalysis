/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 养老金中断或终止缴费原因转换
 */
public class ChangePauseReason {
	public static String pauseReason(String s) {
		if (s.equals("在职人员解除/终止劳动合同")) {
			return "6301";
		} else if (s.equals("人员参军")) {
			return "6303";
		} else if (s.equals("人员上学")) {
			return "6304";
		} else if (s.equals("人员被判刑收监执行或被劳动教养")) {
			return "6305";
		} else if (s.equals("其他原因中断缴费")) {
			return "6399";
		} else if (s.equals("死亡")) {
			return "6401";
		} else if (s.equals("出国定居")) {
			return "6402";
		} else if (s.equals("在职转退休")) {
			return "6501";
		} else if (s.equals("退保")) {
			return "6405";
		} else if (s.equals("其他原因终止缴费")) {
			return "6499";
		} else if (s.equals("人员统筹范围内转出")) {
			return "6302";
		} else if (s.equals("停薪留职")) {
			return "6307";
		} else if (s.equals("人员失踪")) {
			return "6306";
		} else if (s.equals("港澳台定居")) {
			return "6403";
		} else if (s.equals("人员转出统筹范围外")) {
			return "6404";
		}
		return "";
	}
}
