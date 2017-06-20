/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 养老金停止发放原因
 * 
 */
public class ChangeRePauseReason {
	public static String rePauseReason(String s) {
		if (s.equals("离退休人员未提供生存证明")) {
			return "1201";
		} else if (s.equals("离退休人员被判刑收监执行或被劳动教养")) {
			return "1202";
		} else if (s.equals("离退休人员失踪")) {
			return "1203";
		} else if (s.equals("银行帐号错误")) {
			return "1205";
		} else if (s.equals("邮寄地址错误")) {
			return "1206";
		} else if (s.equals("其他原因暂停养老待遇")) {
			return "1299";
		} else if (s.equals("离退休人员死亡")) {
			return "1401";
		} else if (s.equals("离退休人员出国定居")) {
			return "1402";
		} else if (s.equals("离退休人员港澳台定居")) {
			return "1403";
		} else if (s.equals("其他原因终止养老待遇")) {
			return "1499";
		}
		return "";
	}
}
