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
public class WorkType extends StringEnumTypeImp {

    public WorkType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 国家公务员和参照公务员管理人员 */
    public static WorkType GJJG = new WorkType("01", "work.gjjg");

    /** 教育、卫生、新闻、广电、出版、银行、证券、保险、电信、航空、烟草、电力、石化 */
    public static WorkType JSRY = new WorkType("02", "work.jsry");

    /** 事业单位（不参照公务员管理） */
    public static WorkType BSRY = new WorkType("03", "work.bsry");

    /** 其他大中型企业 */
    public static WorkType SYRY = new WorkType("04", "work.syry");

    /** 自由职业人员 */
    public static WorkType SCRY = new WorkType("05", "work.scry");

    /** 其他小微企业及个体工商户*/
    public static WorkType YSRY = new WorkType("99", "work.ysry");

   
    public static WorkType[] COMMON = { GJJG, JSRY, BSRY, SYRY, SCRY, YSRY };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(WorkType.class);
        return Arrays.asList(all);
    }

    public static WorkType getEnumByValue(String value) {
        WorkType enm = (WorkType) EnumUtil.getStringEnum(WorkType.class, value);
        return enm;
    }
}
