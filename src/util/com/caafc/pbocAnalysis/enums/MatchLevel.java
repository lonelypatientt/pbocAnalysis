package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 
 * ecif黑名单查询层级
 * @author zl
 * @version $Revision: 1.1 $
 */
public class MatchLevel extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public MatchLevel(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 查匹配信息项是否在特殊客户基本信息表*/
	public static MatchLevel SELF = new MatchLevel("1", "matchLevel.self");

	/** 查匹配信息项是否在特殊客户基本信息表或者特殊客户关系表 */
	public static MatchLevel ALL = new MatchLevel("2", "accountStatus.all");

	public static MatchLevel[] COMMON = { SELF, ALL};

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(MatchLevel.class);
		return Arrays.asList(all);
	}

	public static MatchLevel getEnumByValue(String value) {
		MatchLevel enm = (MatchLevel) EnumUtil.getStringEnum(MatchLevel.class, value);
		return enm;
	}
}
