package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 审核状态 (2010-10-16 下午08:06:58)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class AuditingState extends StringEnumTypeImp {

    public AuditingState(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未审核 */
    public static AuditingState UNAUDITED = new AuditingState("0", "auditingState.unaudited");

    /** 通过 */
    public static AuditingState PASS = new AuditingState("1", "auditingState.pass");

    /** 拒绝 */
    public static AuditingState REFUSE = new AuditingState("2", "auditingState.refuse");

    public static AuditingState[] COMMON = { UNAUDITED, PASS, REFUSE };

    public static AuditingState getEnumByValue(String value) {
        AuditingState enm = (AuditingState) EnumUtil.getStringEnum(AuditingState.class, value);
        return enm;
    }
}
