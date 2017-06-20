package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 客户详细资料申请表
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class CustManStatus extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public CustManStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 正常 */
    public static CustManStatus NORMAL = new CustManStatus("0", "custManStatus.normal");

    /** 申请转移 */
    public static CustManStatus APPDEV = new CustManStatus("1", "custManStatus.appdev");

    public static CustManStatus[] COMMON = { NORMAL,APPDEV };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CustManStatus.class);
        return Arrays.asList(all);
    }

    public static CustManStatus getEnumByValue(String value) {
        CustManStatus enm = (CustManStatus) EnumUtil.getStringEnum(CustManStatus.class, value);
        return enm;
    }
}
