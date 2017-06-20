/*
 * Copyright (c) 2011  Technology Ltd.
 * All rights reserved.
 *
 * project: nxcrm
 * create: 2011-2-28
 * cvs: $Id: FrequencyType.java,v 1.1 2012/01/05 08:22:49 lawever Exp $
 */
package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 报表频度 (2011-2-28 下午04:13:13)
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class FrequencyType extends StringEnumTypeImp {
	
	public FrequencyType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 日报 */
	public static FrequencyType DATE_REPORT = new FrequencyType("1", "frequencyType.date_report");
	
	/** 月报 */
	public static FrequencyType MONTH_REPORT = new FrequencyType("2", "frequencyType.month_report");
	
	/** 季报 */
	public static FrequencyType QUARTER_REPORT = new FrequencyType("3", "frequencyType.quarter_report");
	
	/** 年报 */
	public static FrequencyType YEAR_REPORT = new FrequencyType("4", "frequencyType.year_report");
	
    public static FrequencyType[] COMMON = { DATE_REPORT, MONTH_REPORT, QUARTER_REPORT, YEAR_REPORT};

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(FrequencyType.class);
        return Arrays.asList(all);
    }

    public static FrequencyType getEnumByValue(String value) {
    	FrequencyType enm = (FrequencyType) EnumUtil.getStringEnum(FrequencyType.class, value);
        return enm;
    }
}
