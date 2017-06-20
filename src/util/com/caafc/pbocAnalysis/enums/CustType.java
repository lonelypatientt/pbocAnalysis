package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 客户类型(2010-10-16 下午09:08:32)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class CustType extends StringEnumTypeImp {

    public CustType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 农户 */
    public static CustType NH = new CustType("11", "custType.nh");

    /** 非农户 */
    public static CustType FNH = new CustType("12", "custType.fnh");

    /** 农村其他经济组织 */
    public static CustType NCQTJJZZ = new CustType("21", "custType.ncqtjjzz");

    /** 农村工业企业 */
    public static CustType NCGYQY = new CustType("22", "custType.ncgyqy");

    /** 农村商业企业 */
    public static CustType NCSYQY = new CustType("23", "custType.ncsyqy");

    /** 农村经济合作社 */
    public static CustType NCJJHZS = new CustType("24", "custType.ncjjhzs");

    /** 农民专业合作社 */
    public static CustType NMZYHZS = new CustType("25", "custType.nmzyhzs");

    /** 城市其他经济组织 */
    public static CustType CSQTJJZZ = new CustType("61", "custType.csqtjjzz");

    /** 城市工业企业 */
    public static CustType CSGYQY = new CustType("62", "custType.csgyqy");

    /** 城市商业企业 */
    public static CustType CSSYQY = new CustType("63", "custType.cssyqy");

    /** 城市经济合作社 */
    public static CustType CSJJHZS = new CustType("64", "custType.csjjhzs");

    /** 城市农民专业合作社 */
    public static CustType CSNMZYHZS = new CustType("65", "custType.csnmzyhzs");

    public static CustType[] COMMON = { NH, FNH, NCQTJJZZ, NCGYQY, NCSYQY, NCJJHZS, NMZYHZS, CSQTJJZZ, CSGYQY, CSSYQY, CSJJHZS, CSNMZYHZS };

    public static CustType[] CUST_PES = { NH, FNH };

    public static CustType[] CUST_ENT = { NCQTJJZZ, NCGYQY, NCSYQY, NCJJHZS, NMZYHZS, CSQTJJZZ, CSGYQY, CSSYQY, CSJJHZS, CSNMZYHZS };

    public static CustType getEnumByValue(String value) {
        CustType enm = (CustType) EnumUtil.getStringEnum(CustType.class, value);
        return enm;
    }
}
