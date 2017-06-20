package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 客户类别 (2011-3-4 下午03:30:20)
 * @author zhaohb 
 * @version $Revision: 1.1 $
 */
public class CustCate extends StringEnumTypeImp {

    public CustCate(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 个人 */
    public static CustCate GR = new CustCate("1", "custCate.gr");

    /** 单位 */
    public static CustCate DW = new CustCate("2", "custCate.dw");

    /** 金融 */
    public static CustCate JR = new CustCate("3", "custCate.jr");
    
    /** 未知 */
    public static CustCate OTHER = new CustCate("", "custCate.other");

    public static CustCate[] COMMON = { GR, DW, JR };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CustCate.class);
        return Arrays.asList(all);
    }

    public static CustCate getEnumByValue(String value) {
        CustCate enm = (CustCate) EnumUtil.getStringEnum(CustCate.class, value);
        return enm;
    }
}
