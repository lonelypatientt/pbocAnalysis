package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 系统提醒（详细类型） (2011-1-24 下午03:49:05)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class SysAwokeParticularType extends StringEnumTypeImp {

    public SysAwokeParticularType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 贷款到期提醒 */
    public static SysAwokeParticularType DKDQTX = new SysAwokeParticularType("200001", "sysAwokeParticularType.dkdqtx");

    /** 贷款逾期提醒 */
    public static SysAwokeParticularType DKYQTX = new SysAwokeParticularType("200002", "sysAwokeParticularType.dkyqtx");

    /** 存款到期提醒 */
    public static SysAwokeParticularType CKDQTX = new SysAwokeParticularType("300001", "sysAwokeParticularType.ckdqtx");

    /** 大额异动提醒 */
    public static SysAwokeParticularType DEYDTX = new SysAwokeParticularType("400001", "sysAwokeParticularType.deydtx");

    /** 评级变动提醒 */
    public static SysAwokeParticularType PJBDTX = new SysAwokeParticularType("600001", "sysAwokeParticularType.pjbdtx");

    /** 大事件 */
    public static SysAwokeParticularType DSJ = new SysAwokeParticularType("500001", "sysAwokeParticularType.dsj");

    /** 纪念日 */
    public static SysAwokeParticularType JNR = new SysAwokeParticularType("500002", "sysAwokeParticularType.jnr");

    /** 客户分配提醒 */
    public static SysAwokeParticularType KHFBTX = new SysAwokeParticularType("700001", "sysAwokeParticularType.khfptx");

    /** 代办日程提醒 */
    public static SysAwokeParticularType DBRCTX = new SysAwokeParticularType("800001", "sysAwokeParticularType.dbrctx");

    /** 客户维护提醒 */
    public static SysAwokeParticularType KHWHTX = new SysAwokeParticularType("900001", "sysAwokeParticularType.khwhtx");

    public static SysAwokeParticularType[] COMMON = { DSJ, DSJ, DKDQTX, DKYQTX, CKDQTX, DEYDTX, PJBDTX };

    public static SysAwokeParticularType getEnumByValue(String value) {
        SysAwokeParticularType enm = (SysAwokeParticularType) EnumUtil.getStringEnum(SysAwokeParticularType.class, value);
        return enm;
    }
}
