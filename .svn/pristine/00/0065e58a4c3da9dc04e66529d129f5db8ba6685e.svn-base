package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 个人征信返回码
 * 
 * @author ZL
 * @version $Revision: 1.1 $
 */
public class PbocResultCode extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public PbocResultCode(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}
	//1	成功
	public static PbocResultCode CODE_1 = new PbocResultCode("1", "成功");
	//2	失败
	public static PbocResultCode CODE_2= new PbocResultCode("2", "失败");
	//3	请求记录错误
	public static PbocResultCode CODE_3 = new PbocResultCode("3", "请求记录错误");
	//5	查询失败
	public static PbocResultCode CODE_5 = new PbocResultCode("5", "查询失败");
	//6	解析失败
	public static PbocResultCode CODE_6 = new PbocResultCode("6", "	解析失败");
	//7	系统异常
	public static PbocResultCode CODE_7 = new PbocResultCode("7", "系统异常");
	//8	查询本地成功
	public static PbocResultCode CODE_8 = new PbocResultCode("8", "查询本地成功");
	//9	本地没有该客户的有效信用报告信息	
	public static PbocResultCode CODE_9 = new PbocResultCode("9", "本地没有该客户的有效信用报告信息");
	//X	查无此人
	public static PbocResultCode CODE_X = new PbocResultCode("X", "查无此人");

	

	public static PbocResultCode[] COMMON = { CODE_1, CODE_2, CODE_3,CODE_5,CODE_6,CODE_7,CODE_8,CODE_9,CODE_X };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(PbocResultCode.class);
		return Arrays.asList(all);
	}

	public static PbocResultCode getEnumByValue(String value) {
		PbocResultCode enm = (PbocResultCode) EnumUtil.getStringEnum(PbocResultCode.class, value);
		return enm;
	}
}
