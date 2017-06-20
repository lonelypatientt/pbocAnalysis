/*
 * Copyright (c) 2011 Technology Ltd.
 * All rights reserved.
 * project: nxcrm
 * create: 2011-1-25
 * cvs: $Id: AwokeTypeConvert.java,v 1.1 2012/01/05 08:22:50 lawever Exp $
 */
package com.caafc.pbocAnalysis.enums;

/**
 * 提醒类别转换 (2011-1-25 下午02:43:22)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class AwokeTypeConvert {

    /** 客户关怀地址 */
    private static final String MYJOB_KHGX_ACTION = "/myjob/custCare.action";

    /** 系统提醒地址 */
    private static final String MYJOB_XTTX_ACTION_MSG_TYP = "/myjob/systemRemind.action?msgTyp=";

    public static SysAwokeParticularType[] INDEX_XTTX_ARRAY = { SysAwokeParticularType.DKDQTX, SysAwokeParticularType.DKYQTX,
            SysAwokeParticularType.CKDQTX, SysAwokeParticularType.DEYDTX, SysAwokeParticularType.DSJ, SysAwokeParticularType.JNR };

    /** 风险预警 */
    public static SysAwokeParticularType[] DKDQTX_DKYQTX_ARRAY = { SysAwokeParticularType.DKDQTX, SysAwokeParticularType.DKYQTX };

    /** 到期提醒 */
    public static SysAwokeParticularType[] CKDQTX_ARRAY = { SysAwokeParticularType.CKDQTX };

    /** 大额异动提醒 */
    public static SysAwokeParticularType[] DEYDTX_ARRAY = { SysAwokeParticularType.DEYDTX };

    /** 客户关怀 */
    public static SysAwokeParticularType[] KHGX_ARRAY = { SysAwokeParticularType.DSJ, SysAwokeParticularType.JNR };

    public static String getActionUrl(SysAwokeParticularType arg0) {
        SysAwokeType sat = AwokeTypeConvert.convertToParent(arg0);
        if (sat == SysAwokeType.FXYJ || sat == SysAwokeType.DEYDTX || sat == SysAwokeType.DQTX)
            return MYJOB_XTTX_ACTION_MSG_TYP + sat.getStringValue();
        else if (sat == SysAwokeType.KHGX)
            return MYJOB_KHGX_ACTION;
        else
            return "";
    }

    /** 转换成大类 */
    public static SysAwokeType convertToParent(SysAwokeParticularType arg0) {
        if (isContain(arg0, DKDQTX_DKYQTX_ARRAY))
            return SysAwokeType.FXYJ;
        else if (isContain(arg0, CKDQTX_ARRAY))
            return SysAwokeType.DQTX;
        else if (isContain(arg0, DEYDTX_ARRAY))
            return SysAwokeType.DEYDTX;
        else if (isContain(arg0, KHGX_ARRAY))
            return SysAwokeType.KHGX;
        else
            return null;
    }

    /** 根据大类获取小类 */
    public static SysAwokeParticularType[] getChilds(SysAwokeType arg0) {
        if (arg0.equals(SysAwokeType.FXYJ))
            return DKDQTX_DKYQTX_ARRAY;
        else if (arg0.equals(SysAwokeType.DQTX))
            return CKDQTX_ARRAY;
        else if (arg0.equals(SysAwokeType.DEYDTX))
            return DEYDTX_ARRAY;
        else if (arg0.equals(SysAwokeType.KHGX))
            return KHGX_ARRAY;
        else if (arg0.equals(SysAwokeType.INDEX_XTTX))
            return INDEX_XTTX_ARRAY;
        else
            return null;
    }

    private static boolean isContain(SysAwokeParticularType arg0, SysAwokeParticularType[] arg1) {
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i].equals(arg0)) {
                return true;
            }
        }
        return false;
    }
}
