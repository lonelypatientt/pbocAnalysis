package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 读取状态 (2011-5-7 上午09:30:40)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class ReadState extends StringEnumTypeImp {

    public ReadState(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未读 */
    public static ReadState NO = new ReadState("0", "readState.no");
    
    /** 已读 */
    public static ReadState YES = new ReadState("1", "readState.yes");

    public static ReadState[] COMMON = { NO, YES };

    public static ReadState getEnumByValue(String value) {
        ReadState enm = (ReadState) EnumUtil.getStringEnum(ReadState.class, value);
        return enm;
    }
}
