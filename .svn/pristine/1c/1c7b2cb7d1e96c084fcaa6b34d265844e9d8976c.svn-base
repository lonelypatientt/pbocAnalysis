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
public class DevChkFlag extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public DevChkFlag(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 待审核 */
    public static DevChkFlag PROCESS = new DevChkFlag("0", "devChkFlag.process");

    /** 通过 */
    public static DevChkFlag PASS = new DevChkFlag("1", "devChkFlag.pass");

    /** 拒绝 */
    public static DevChkFlag FAIL = new DevChkFlag("2", "devChkFlag.fail");

    public static DevChkFlag[] COMMON = { PROCESS,PASS,FAIL };
    public static DevChkFlag[] AUDIT = {PASS,FAIL };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(DevChkFlag.class);
        return Arrays.asList(all);
    }

    public static DevChkFlag getEnumByValue(String value) {
        DevChkFlag enm = (DevChkFlag) EnumUtil.getStringEnum(DevChkFlag.class, value);
        return enm;
    }
}
