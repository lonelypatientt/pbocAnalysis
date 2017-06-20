/*
 * Copyright (c) 2011 Technology Ltd.
 * All rights reserved.
 * project: nxcrm
 * create: 2011-4-21
 * cvs: $Id: GurantCate.java,v 1.1 2012/01/05 08:22:50 lawever Exp $
 */
package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 担保类型 (2011-4-21 下午06:50:49)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class GurantCate extends StringEnumTypeImp {

    public GurantCate(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 保证 */
    public static GurantCate BAO_ZHENG = new GurantCate("1", "gurantCate.baozheng");

    /** 抵押 */
    public static GurantCate DI_YA = new GurantCate("2", "gurantCate.diya");

    /** 质押 */
    public static GurantCate ZHI_YA = new GurantCate("3", "gurantCate.zhiya");

    /** 抵押+保证 */
    public static GurantCate DY_BZ = new GurantCate("4", "gurantCate.dy_bz");

    public static GurantCate[] COMMON = { BAO_ZHENG, DI_YA, ZHI_YA, DY_BZ };

    public static GurantCate getEnumByValue(String value) {
        GurantCate enm = (GurantCate) EnumUtil.getStringEnum(GurantCate.class, value);
        return enm;
    }
}
