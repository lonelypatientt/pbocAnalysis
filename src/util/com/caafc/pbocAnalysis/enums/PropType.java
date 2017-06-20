/*
 * Copyright (c) 2013 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2013-11-11 上午11:09:14
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 个贷审批类型
 * @author Administrator 
 * @version $Revision:$
 */
public class PropType extends StringEnumTypeImp{

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public PropType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 预审批 */
	public static PropType YSHP = new PropType("0", "propType.yshp");

	/** 审批 */
	public static PropType SHP = new PropType("1", "propType.shp");


	public static PropType[] COMMON = { YSHP, SHP };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(PropType.class);
		return Arrays.asList(all);
	}

	public static PropType getEnumByValue(String value) {
		PropType enm = (PropType) EnumUtil.getStringEnum(PropType.class, value);
		return enm;
	}
}
