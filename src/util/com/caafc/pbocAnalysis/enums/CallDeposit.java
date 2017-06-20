package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 是否通知枚举 (2010-9-16 下午03:05:32)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class CallDeposit extends StringEnumTypeImp {

    public CallDeposit(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 非通知 */
    public static CallDeposit NOINFORM = new CallDeposit("0", "callDeposit.noinform");

    /** 通知 */
    public static CallDeposit INFORM = new CallDeposit("1", "callDeposit.inform");

    public static CallDeposit[] COMMON = { INFORM, NOINFORM };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CallDeposit.class);
        return Arrays.asList(all);
    }

    public static CallDeposit getEnumByValue(String value) {
    	CallDeposit cd = (CallDeposit) EnumUtil.getStringEnum(CallDeposit.class, value);
        return cd;
    }
}
