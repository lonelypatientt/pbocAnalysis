package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 性别 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class Sex extends StringEnumTypeImp {

    public Sex(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 男 */
    public static Sex MAN = new Sex("1", "sex.man");

    /** 女 */
    public static Sex WOMAN = new Sex("2", "sex.woman");

    /** 未说明的性别 */
    public static Sex WSM = new Sex("0", "sex.wsm");
    
    /** 未知的性别 */
    public static Sex WZ = new Sex("9", "sex.wz");
    
    public static Sex[] COMMON = { MAN, WOMAN ,WSM,WZ};

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(Sex.class);
        return Arrays.asList(all);
    }

    public static Sex getEnumByValue(String value) {
        Sex enm = (Sex) EnumUtil.getStringEnum(Sex.class, value);
        return enm;
    }
}
