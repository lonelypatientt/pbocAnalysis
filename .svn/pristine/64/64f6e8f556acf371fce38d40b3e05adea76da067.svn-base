package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 特殊交易类型转换
 */
public class ChangeSpecialTradeType {
	public static String specialTradeType(String s) {
		if (s.equals("展期（延期）")) {
			return "1";
		} else if (s.equals("担保人代还")) {
			return "2";
		} else if (s.equals("以资抵债")) {
			return "3";
		} else if (s.equals("提前还款（部分）")) {
			return "4";
		} else if (s.equals("提前还款（全部）")) {
			return "5";
		} else if (s.equals("其他")) {
			return "9";
		}
		return "";
	}
}
