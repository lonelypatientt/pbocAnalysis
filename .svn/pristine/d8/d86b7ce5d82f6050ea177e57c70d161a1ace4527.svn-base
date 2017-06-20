package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 征信报告查询原因
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class QueryReason extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public QueryReason(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未完成 */
    public static QueryReason CREDITCARDAPPROVE = new QueryReason("1", "queryReason.creditCardApprove");

    /** 已完成 */
    public static QueryReason LOANAPPROVE = new QueryReason("2", "queryReason.loanApprove");

    public static QueryReason[] COMMON = { CREDITCARDAPPROVE,LOANAPPROVE };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(QueryReason.class);
        return Arrays.asList(all);
    }

    public static QueryReason getEnumByValue(String value) {
        QueryReason enm = (QueryReason) EnumUtil.getStringEnum(QueryReason.class, value);
        return enm;
    }
}
