package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 触发规则原因类型
 * @author xihn 
 * @version $Revision: 1.1 $
 */
public class Reason_type extends StringEnumTypeImp {

    public Reason_type(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 拒绝类*/
    public static Reason_type R = new Reason_type("R", "Reason.R");

    /** 关注类 */
    public static Reason_type A = new Reason_type("A", "Reason.A");
    
    /** 人工类 */
    public static Reason_type M = new Reason_type("M", "Reason.M");

    public static Reason_type[] COMMON = { R,A,M };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(Reason_type.class);
        return Arrays.asList(all);
    }

    public static Reason_type getEnumByValue(String value) {
        Reason_type enm = (Reason_type) EnumUtil.getStringEnum(Reason_type.class, value);
        return enm;
    }
}
