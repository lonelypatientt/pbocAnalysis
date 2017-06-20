package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/** 星级 */
public class StarLevel extends StringEnumTypeImp {

    public StarLevel(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    public static StarLevel STAR_0 = new StarLevel("00", "starLevel.star_0");

    public static StarLevel STAR_1 = new StarLevel("01", "starLevel.star_1");

    public static StarLevel STAR_2 = new StarLevel("02", "starLevel.star_2");

    public static StarLevel STAR_3 = new StarLevel("03", "starLevel.star_3");

    public static StarLevel STAR_4 = new StarLevel("04", "starLevel.star_4");

    public static StarLevel STAR_5 = new StarLevel("05", "starLevel.star_5");
    
    public static StarLevel STAR_6 = new StarLevel("06", "starLevel.star_6");
    
    public static StarLevel STAR_7 = new StarLevel("07", "starLevel.star_7");
    
    public static StarLevel STAR_8 = new StarLevel("08", "starLevel.star_8");
    
    public static StarLevel STAR_9 = new StarLevel("09", "starLevel.star_9");
    
    public static StarLevel STAR_10 = new StarLevel("10", "starLevel.star_10");

    public static StarLevel[] COMMON = { STAR_0, STAR_1, STAR_2, STAR_3, STAR_4, STAR_5
    	,STAR_6,STAR_7,STAR_8,STAR_9,STAR_10};

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(StarLevel.class);
        return Arrays.asList(all);
    }

    public static StarLevel getEnumByValue(String value) {
        StarLevel enm = (StarLevel) EnumUtil.getStringEnum(StarLevel.class, value);
        return enm;
    }
}
