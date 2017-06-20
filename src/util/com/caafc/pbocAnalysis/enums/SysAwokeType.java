package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 系统提醒（大类） (2011-1-24 下午03:49:05)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class SysAwokeType extends StringEnumTypeImp {

    public SysAwokeType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    public static SysAwokeType INDEX_XTTX = new SysAwokeType("A", "sysAwokeType.index_xttx");

    /** 贷款提醒 */
    public static SysAwokeType DKTX = new SysAwokeType("1", "sysAwokeType.dktx");

    /** 风险预警 */
    public static SysAwokeType FXYJ = new SysAwokeType("2", "sysAwokeType.fxyj");

    /** 到期提醒 */
    public static SysAwokeType DQTX = new SysAwokeType("3", "sysAwokeType.dqtx");

    /** 大额异动提醒 */
    public static SysAwokeType DEYDTX = new SysAwokeType("4", "sysAwokeType.deydtx");

    /** 客户关怀 */
    public static SysAwokeType KHGX = new SysAwokeType("5", "sysAwokeType.khgx");

    /** 评级变动提醒 */
    public static SysAwokeType PJBDTX = new SysAwokeType("6", "sysAwokeType.pjbdtx");

    /** 客户分配提醒 */
    public static SysAwokeType KHFBTX = new SysAwokeType("7", "sysAwokeType.khfptx");

    /** 代办日程提醒 */
    public static SysAwokeType DBRCTX = new SysAwokeType("8", "sysAwokeType.dbrctx");

    /** 客户维护提醒 */
    public static SysAwokeType KHWHTX = new SysAwokeType("9", "sysAwokeType.khwhtx");

    public static SysAwokeType[] COMMON = { DKTX, FXYJ, DQTX, DEYDTX, KHGX, PJBDTX };

    public static SysAwokeType getEnumByValue(String value) {
        SysAwokeType enm = (SysAwokeType) EnumUtil.getStringEnum(SysAwokeType.class, value);
        return enm;
    }
}
