package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 是否浏览 (2011-1-25 上午09:30:40)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class BrowFlag extends StringEnumTypeImp {

    public BrowFlag(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未浏览 */
    public static BrowFlag NO = new BrowFlag("0", "browFlag.no");

    /** 已浏览 */
    public static BrowFlag YES = new BrowFlag("1", "browFlag.yes");

    public static BrowFlag[] COMMON = { NO, YES };

    public static BrowFlag getEnumByValue(String value) {
        BrowFlag enm = (BrowFlag) EnumUtil.getStringEnum(BrowFlag.class, value);
        return enm;
    }
}
