package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 担保状态 (2010-10-16 下午09:08:32)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class GurantStat extends StringEnumTypeImp {

    public GurantStat(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 正常 */
    public static GurantStat NORMAL = new GurantStat("0", "gurant.normal");

    /** 解除 */
    public static GurantStat RELIEVE = new GurantStat("1", "gurant.relieve");

    public static GurantStat[] COMMON = { NORMAL, RELIEVE };

    public static GurantStat getEnumByValue(String value) {
        GurantStat enm = (GurantStat) EnumUtil.getStringEnum(GurantStat.class, value);
        return enm;
    }
}
