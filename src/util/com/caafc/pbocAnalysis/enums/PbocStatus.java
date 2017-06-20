package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 征信报告客户信息录入状态
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class PbocStatus extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public PbocStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未完成 */
    public static PbocStatus UNFINISHED = new PbocStatus("0", "pbocReport.unfinished");

    /** 已完成 */
    public static PbocStatus FINISH = new PbocStatus("1", "pbocReport.finish");

    public static PbocStatus[] COMMON = { UNFINISHED,FINISH };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(PbocStatus.class);
        return Arrays.asList(all);
    }

    public static PbocStatus getEnumByValue(String value) {
        PbocStatus enm = (PbocStatus) EnumUtil.getStringEnum(PbocStatus.class, value);
        return enm;
    }
}
