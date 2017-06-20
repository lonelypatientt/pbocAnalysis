/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author xihn
 * 
 *         将数据库查询的证件类型转换为人行征信定义的证件类型
 */
public class ChangeCertType {

	/*江苏银行
	011	第一代居民身份证
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
	
	/* 征信报告
	0	身份证
	1	户口簿
	2	护照
	3	军官证
	4	士兵证
	5	港澳居民来往内地通行证
	6	台湾同胞来往内地通行证
	7	临时身份证
	8	外国人居留证
	9	警官征
	A	香港身份证
	B	澳门身份证
	C	台湾身份证
	X	其他证件*/

	public static String changeCertType(String certType) {
		String rs = "";
		if (certType.equals("011") || certType.equals("021")) {
			// 身份证
			rs = "0";
		} else if (certType.equals("056")) {
			// 户口薄
			rs = "1";
		} else if (certType.equals("042")) {
			// 护照
			rs = "2";
		} else if (certType.equals("155") || certType.equals("165")) {
			// 港澳居民来往内陆通行证、港澳同胞回乡证 香港通行证 澳门通行证
			rs = "5";
		} else if (certType.equals("175")) {
			// 台湾居民来往大陆通行证 台湾通行证或有效旅行证件
			rs = "6";
		}  else if (certType.equals("148") || certType.equals("128")
				|| certType.equals("134") ) {
			// 解放军士兵证、武警士兵证 士兵证 武警证 120 军事学员学员证
			rs = "4";
		} else if (certType.equals("083") || certType.equals("098")
				|| certType.equals("108") || certType.equals("118")) {

			// 解放军军官证、解放军文职干部证、解放军离休干部荣誉证、解放军军官退休证、解放军文职干部退休证
			// 080 军官证 离休干部荣誉证 文职干部退休证
			rs = "3";
		} else if (certType.equals("137")) {
			// 武警警官证、武警文职干部证、武警离休干部荣誉证、武警军官退休证、武警文职干部退休证
			rs = "9";
		}

		else if (certType.equals("199") || certType.equals("202")
				|| certType.equals("18A")) {
			// 外国人永久居留证、外国护照、边民出入境通行证
			rs = "8";
		} else if (certType.equals("031")) {
			// 临时身份证
			rs = "7";
		}else{
			// 其它有效证件 机构代码证 
			rs = "X";
		}
		return rs;
	}
}
