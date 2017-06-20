package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 职称 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class JobTitle extends StringEnumTypeImp {

    public JobTitle(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 无 */
    public static JobTitle NONE = new JobTitle("0", "jobTitle.none");

    /** 高级 */
    public static JobTitle GJ = new JobTitle("1", "jobTitle.gj");

    /** 中级 */
    public static JobTitle ZJ = new JobTitle("2", "jobTitle.zj");

    /** 初级 */
    public static JobTitle CJ = new JobTitle("3", "jobTitle.cj");

    /** 未知 */
    public static JobTitle UNKNOW = new JobTitle("9", "jobTitle.unknow");

    public static JobTitle[] COMMON = { NONE, GJ, ZJ, CJ, UNKNOW };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(JobTitle.class);
        return Arrays.asList(all);
    }

    public static JobTitle getEnumByValue(String value) {
        JobTitle enm = (JobTitle) EnumUtil.getStringEnum(JobTitle.class, value);

        return enm;
    }
}
