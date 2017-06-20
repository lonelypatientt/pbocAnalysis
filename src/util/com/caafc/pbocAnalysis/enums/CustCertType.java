package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 证件类型枚举
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class CustCertType extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public CustCertType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }
    
    /** 临时身份证 */
    public static CustCertType LSFZ = new CustCertType("020", "custCertType.lsfz");
    
    /** 身份证 */
    public static CustCertType SFZ = new CustCertType("011", "custCertType.sfz");
    
    /**户口薄*/
    public static CustCertType HKB = new CustCertType("042", "custCertType.hkb");
    
    /**村民委员证明*/
    public static CustCertType CMWY = new CustCertType("050", "custCertType.cmwy");
    
    /**学生证*/
    public static CustCertType XSZ = new CustCertType("060", "custCertType.xsz");
    
    /**护照*/
    public static CustCertType HZ = new CustCertType("033", "custCertType.hz");
    
    /**军官证*/
    public static CustCertType JGZ = new CustCertType("070", "custCertType.jgz");
    
    /**离休干部荣誉证*/
    public static CustCertType LXGB = new CustCertType("080", "custCertType.lxgb");
    
    /**军官退休证*/
    public static CustCertType JGTXZ = new CustCertType("090", "custCertType.jgtxz");
    
    /**文职干部退休证*/
    public static CustCertType WZGBTXZ = new CustCertType("100", "custCertType.wzgbtxz");
    
    /**军事学员学员证*/
    public static CustCertType JSXYXYZ = new CustCertType("110", "custCertType.wzgbtxz");
    
    /**港澳居民来往内陆通行证*/
    public static CustCertType GATXZ = new CustCertType("144", "custCertType.gatxz");
    
    /**香港通行证*/
    public static CustCertType XGTXZ = new CustCertType("140", "custCertType.xgtxz");
    
    /**澳门通行证*/
    public static CustCertType AMTXZ = new CustCertType("150", "custCertType.amtxz");
    
    /**港澳同胞回乡证*/
    public static CustCertType GAHXZ = new CustCertType("145", "custCertType.gahxz");
    
    /**台湾通行证或有效旅行证件*/
    public static CustCertType TWTXZHLYZ = new CustCertType("160", "custCertType.twtxzHLYZ");
    
    /**台湾居民来往大陆通行证*/
    public static CustCertType TWTXZ = new CustCertType("166", "custCertType.twtxz");
    
    /**外国人永久居留证*/
    public static CustCertType WGRYJJLZ = new CustCertType("170", "custCertType.wgryjjlz");
    
    /**边民出入境通行证*/
    public static CustCertType BMCRJTXZ = new CustCertType("180", "custCertType.bmcrjtxz");
    
    /**外国护照*/
    public static CustCertType WGHZ = new CustCertType("190", "custCertType.wghz");
    
    /**其它有效证件*/
    public static CustCertType QTYXZJ = new CustCertType("207", "custCertType.qtyxzj");
    
    /**解放军士兵证*/
    public static CustCertType JFJSBZ = new CustCertType("138", "custCertType.jfjsbz");
    
    /**士兵证*/
    public static CustCertType SBZ = new CustCertType("130", "custCertType.sbz");
    
    /**解放军军官证*/
    public static CustCertType JFJJGZ = new CustCertType("079", "custCertType.jfjjgz");
    
    /**解放军文职干部证*/
    public static CustCertType JFJGBZ = new CustCertType("07a", "custCertType.jfjgbz");
    
    /**解放军离休干部荣誉证*/
    public static CustCertType JFJLXGBRYZ = new CustCertType("08b", "custCertType.jfjlxgbryz");
    
    /**解放军军官退休证*/
    public static CustCertType JFJJGTXZ = new CustCertType("09c", "custCertType.jfjjgtxz");
    
    /**解放军文职干部退休证*/
    public static CustCertType JFJWZGBTXZ = new CustCertType("10d", "custCertType.jfjwzgbtxz");
    
    /**武警士兵证*/
    public static CustCertType WJSBZ = new CustCertType("12e", "custCertType.wjsbz");
    
    /**武警证*/
    public static CustCertType WJZ = new CustCertType("120", "custCertType.wjz");
    
    /**武警警官证*/
    public static CustCertType WJJGZ = new CustCertType("12f", "custCertType.wjjgz");
    
    /**武警文职干部证*/
    public static CustCertType WJWZGBZ = new CustCertType("12g", "custCertType.wjwzgbz");
    
    /**武警离休干部荣誉证*/
    public static CustCertType WJLXGBRYZ = new CustCertType("12h", "custCertType.wjlxgbryz");
    
    /**武警警官退休证*/
    public static CustCertType WJJGTXZ= new CustCertType("12i", "custCertType.wjjgtxz");

    /**武警文职干部退休证*/
    public static CustCertType WJWZGBTXZ= new CustCertType("12j", "custCertType.wjwzgbtxz");
    
    /**机构代码证*/
    public static CustCertType JGDMZ= new CustCertType("20k", "custCertType.jgdmz");
   
    /**其他1*/
    public static CustCertType QTQ= new CustCertType("20Q", "custCertType.qtq");
   
    /**其他2*/
    public static CustCertType QTR= new CustCertType("20R", "custCertType.qtr");
    
    public static CustCertType[] COMMON = {LSFZ,SFZ,HKB,CMWY,XSZ,HZ,JGZ,LXGB,JGTXZ,WZGBTXZ,JSXYXYZ,GATXZ,XGTXZ,AMTXZ,GAHXZ,TWTXZHLYZ,TWTXZ,WGRYJJLZ,BMCRJTXZ,WGHZ,QTYXZJ,JFJSBZ,SBZ,JFJJGZ,JFJGBZ,JFJLXGBRYZ,JFJJGTXZ,JFJWZGBTXZ,WJSBZ,WJZ,WJJGZ,WJWZGBZ,WJLXGBRYZ,WJJGTXZ,WJWZGBTXZ,JGDMZ,QTQ,QTR };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CustCertType.class);
        return Arrays.asList(all);
    }

    public static CustCertType getEnumByValue(String value) {
        CustCertType ccType = (CustCertType) EnumUtil.getStringEnum(CustCertType.class, value);
        return ccType;
    }
}
