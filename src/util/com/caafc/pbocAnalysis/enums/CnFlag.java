package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 境内外枚举 (2010-9-16 下午03:05:32)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class CnFlag extends StringEnumTypeImp {

    public CnFlag(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 境外 */
    public static CnFlag CNOUT = new CnFlag("0", "cnFlag.out");

    /** 境内 */
    public static CnFlag CNIN = new CnFlag("1", "cnFlag.in");

    public static CnFlag[] COMMON = { CNIN, CNOUT };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CnFlag.class);
        return Arrays.asList(all);
    }

    public static CnFlag getEnumByValue(String value) {
    	CnFlag cf = (CnFlag) EnumUtil.getStringEnum(CnFlag.class, value);
        return cf;
    }
}
