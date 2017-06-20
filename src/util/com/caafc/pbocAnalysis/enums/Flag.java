package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 是否标识 (2010-10-16 下午09:08:32)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class Flag extends StringEnumTypeImp {

    public Flag(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 否 */
    public static Flag FALSE = new Flag("0", "flag.false");

    /** 是 */
    public static Flag TRUE = new Flag("1", "flag.true");

    public static Flag[] COMMON = { FALSE, TRUE };

    public static Flag getEnumByValue(String value) {
        Flag enm = (Flag) EnumUtil.getStringEnum(Flag.class, value);
        return enm;
    }
}
