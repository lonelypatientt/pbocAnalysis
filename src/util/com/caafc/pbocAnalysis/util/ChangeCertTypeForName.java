/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn 将人行征信报告xml文件的证件类型转换为Key,
 */

/*011	第一代居民身份证
021	第二代居民身份证
031	临时身份证
042	中国护照
056	户口簿
068	村民委员会证明
078	学生证
083	军官证
098	离休干部荣誉证
108	军官退休证
118	文职干部退休证
128	军事学员证
134	武警证
137	警官证
148	士兵证
155	香港通行证
165	澳门通行证
175	台湾通行证或有效旅行证件
18A	外国人永久居留证
199	边民出入境通行证
202	外国护照
218	其它
210	个体工商户营业执照
*/

public class ChangeCertTypeForName {

	public static String certTypeKey(String s) {
		if (s.equals("身份证")) {
			return "021";
		} else if (s.equals("户口簿")) {
			return "056";
		} else if (s.equals("护照")) {
			return "042";
		} else if (s.equals("军官证")) {
			return "083";
		} else if (s.equals("士兵证")) {
			return "148";
		} else if (s.equals("港澳居民来往内地通行证")) {
			return "155";
		} else if (s.equals("台湾同胞来往内地通行证")) {
			return "175";
		} else if (s.equals("临时身份证")) {
			return "031";
		} else if (s.equals("外国人居留证")) {
			return "18A";
		} else if (s.equals("警官证")) {
			return "137";
		} else if (s.equals("其他证件")) {
			return "218";
		}
		return "";
	}
}
