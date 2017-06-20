package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 评级职务职称枚举
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class RatingPositionTitle extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public RatingPositionTitle(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 厅局级副职及以上 */
    public static RatingPositionTitle TJJFZ = new RatingPositionTitle("01", "ratingPositionTitle.tjjfz");
    
    /**县处级副职及以上*/
    public static RatingPositionTitle XCJFZ = new RatingPositionTitle("02", "ratingPositionTitle.xcjfz");
    
    /**乡科级副职及以上*/
    public static RatingPositionTitle XKJFZ = new RatingPositionTitle("03", "ratingPositionTitle.xkjfz");
    
    /**普通科员*/
    public static RatingPositionTitle PTKY = new RatingPositionTitle("04", "ratingPositionTitle.ptky");
    
    /**企业高级管理人员*/
    public static RatingPositionTitle QYGJGL = new RatingPositionTitle("11", "ratingPositionTitle.qygjgl");
    
    /**企业中级管理人员（或拥有高级职称）*/
    public static RatingPositionTitle QYZJGL = new RatingPositionTitle("12", "ratingPositionTitle.qyzjgl");
    
    /**私营业主*/
    public static RatingPositionTitle SYYZ = new RatingPositionTitle("13", "ratingPositionTitle.syyz");
    
    /**基层主管*/
    public static RatingPositionTitle JCZG = new RatingPositionTitle("14", "ratingPositionTitle.jczg");
    
    /**基层员工（或拥有中、初级职称）*/
    public static RatingPositionTitle JCYG = new RatingPositionTitle("15", "ratingPositionTitle.jcyg");
    
    /**自由职业*/
    public static RatingPositionTitle ZYZY = new RatingPositionTitle("16", "ratingPositionTitle.zyzy");
   
    public static RatingPositionTitle[] COMMON = { TJJFZ, XCJFZ, XKJFZ, PTKY, QYGJGL, QYZJGL, SYYZ, JCZG, JCYG, ZYZY };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(RatingPositionTitle.class);
        return Arrays.asList(all);
    }

    public static RatingPositionTitle getEnumByValue(String value) {
        RatingPositionTitle ccType = (RatingPositionTitle) EnumUtil.getStringEnum(RatingPositionTitle.class, value);
        return ccType;
    }
}
