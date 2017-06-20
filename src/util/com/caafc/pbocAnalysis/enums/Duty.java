package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 职务 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class Duty extends StringEnumTypeImp {

    public Duty(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 高级领导 */
    public static Duty GJLD = new Duty("1", "duty.gjld");

    /** 中级领导 */
    public static Duty ZJLD = new Duty("2", "duty.zjld");

    /** 一般员工 */
    public static Duty YBYG = new Duty("3", "duty.ybyg");

    /** 其他 */
    public static Duty OTHER = new Duty("4", "duty.other");

    /** 未知 */
    public static Duty UNKNOW = new Duty("9", "duty.unknow");

    public static Duty[] COMMON = { GJLD, ZJLD, YBYG, OTHER, UNKNOW };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(Duty.class);
        return Arrays.asList(all);
    }

    public static Duty getEnumByValue(String value) {
        Duty enm = (Duty) EnumUtil.getStringEnum(Duty.class, value);
        return enm;
    }
}
