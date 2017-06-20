package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 通用的状态枚举 (2010-9-16 下午03:05:32)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class CommonStringStatus extends StringEnumTypeImp {

    public CommonStringStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 无效 */
    public static CommonStringStatus INVALID = new CommonStringStatus("0", "comm.invalid");

    /** 有效 */
    public static CommonStringStatus VALID = new CommonStringStatus("1", "comm.valid");

    public static CommonStringStatus[] COMMON = { VALID, INVALID };

    public static CommonStringStatus getEnumByValue(String value) {
        CommonStringStatus enm = (CommonStringStatus) EnumUtil.getStringEnum(CommonStringStatus.class, value);
        return enm;
    }
}
