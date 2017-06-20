package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 客户层次 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class CustLev extends StringEnumTypeImp {

    public CustLev(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 潜在 */
    public static CustLev QZ = new CustLev("1", "custLev.qz");

    /** 普通 */
    public static CustLev PT = new CustLev("2", "custLev.pt");

    /** 普通贵宾 */
    public static CustLev PTGB = new CustLev("3", "custLev.ptgb");

    /** 重要贵宾 */
    public static CustLev ZYGB = new CustLev("4", "custLev.zygb");

    public static CustLev[] COMMON = { QZ, PT, PTGB, ZYGB };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CustLev.class);
        return Arrays.asList(all);
    }

    public static CustLev getEnumByValue(String value) {
        CustLev enm = (CustLev) EnumUtil.getStringEnum(CustLev.class, value);
        return enm;
    }
}
