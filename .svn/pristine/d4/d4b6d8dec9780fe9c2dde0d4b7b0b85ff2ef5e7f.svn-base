package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 学位 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class Degree extends StringEnumTypeImp {

    public Degree(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 其他 */
    public static Degree OTHER = new Degree("0", "degree.other");

    /** 名誉博士 */
    public static Degree MYBS = new Degree("1", "degree.mybs");

    /** 博士 */
    public static Degree BS = new Degree("2", "degree.bs");

    /** 硕士 */
    public static Degree SS = new Degree("3", "degree.ss");

    /** 学士 */
    public static Degree XS = new Degree("4", "degree.xs");

    /** 未知 */
    public static Degree UNKNOW = new Degree("9", "degree.unknow");

    public static Degree[] COMMON = { OTHER, MYBS, BS, SS, XS, UNKNOW };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(Degree.class);
        return Arrays.asList(all);
    }

    public static Degree getEnumByValue(String value) {
        Degree enm = (Degree) EnumUtil.getStringEnum(Degree.class, value);
        return enm;
    }
}
