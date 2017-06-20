package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 职业 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class WorkStatus extends StringEnumTypeImp {

    public WorkStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }
    
    //自雇
    public static WorkStatus SELF_EMPLOYED = new WorkStatus("1", "自雇");

    //受薪
    public static WorkStatus PAID_STAFF = new WorkStatus("2", "受薪");

    //其他
    public static WorkStatus ELSE = new WorkStatus("0", "其他");

   
    public static WorkStatus[] COMMON = { SELF_EMPLOYED, PAID_STAFF, ELSE};

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(WorkStatus.class);
        return Arrays.asList(all);
    }

    public static WorkStatus getEnumByValue(String value) {
        WorkStatus enm = (WorkStatus) EnumUtil.getStringEnum(WorkStatus.class, value);
        return enm;
    }
}
