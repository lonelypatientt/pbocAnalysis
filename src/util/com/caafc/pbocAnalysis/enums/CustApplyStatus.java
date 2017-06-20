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
public class CustApplyStatus extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public CustApplyStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 审核中 */
    public static CustApplyStatus PROCESS = new CustApplyStatus("0", "custApplyStatus.process");

    /** 审核通过 */
    public static CustApplyStatus PASS = new CustApplyStatus("1", "custApplyStatus.pass");

    /** 审核未通过 */
    public static CustApplyStatus FAIL = new CustApplyStatus("2", "custApplyStatus.fail");

    public static CustApplyStatus[] COMMON = { PROCESS,PASS,FAIL };
    public static CustApplyStatus[] AUDIT = {PASS,FAIL };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CustApplyStatus.class);
        return Arrays.asList(all);
    }

    public static CustApplyStatus getEnumByValue(String value) {
        CustApplyStatus enm = (CustApplyStatus) EnumUtil.getStringEnum(CustApplyStatus.class, value);
        return enm;
    }
}
