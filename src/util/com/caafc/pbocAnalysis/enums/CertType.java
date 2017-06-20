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
public class CertType extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     * @param msgResource
     */
    public CertType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 公民身份证号码 */
    public static CertType GMSFZ = new CertType("A", "ctgmsfz");

    /** 军官证 */
    public static CertType JUNGZ = new CertType("B", "ctjungz");

    /** 解放军文职干部证 */
    public static CertType JFJWZ = new CertType("C", "ctjfjwz");

    /** 警官证 */
    public static CertType JINGGZ = new CertType("D", "ctjinggz");

    /** 解放军士兵证 */
    public static CertType JFJSBZ = new CertType("E", "ctjfjsbz");

    /** 户口簿 */
    public static CertType HKB = new CertType("F", "cthkb");

    /** (港澳)回乡证-通行证 */
    public static CertType GAHXZ = new CertType("G", "ctgahxz");

    /** 台通行证-其他有效旅行证 */
    public static CertType TTXZ = new CertType("H", "ctttxz");

    /** (外国)护照 */
    public static CertType WGHZ = new CertType("I", "ctwghz");

    /** (中国)护照 */
    public static CertType ZGHZ = new CertType("J", "ctzghz");

    /** 武警文职干部证 */
    public static CertType WJWZ = new CertType("K", "ctwjwz");

    /** 武警士兵证 */
    public static CertType WJSB = new CertType("L", "ctwjsb");

    /** 全国组织机构代码 */
    public static CertType QGZZJG = new CertType("P", "ctqgzzjg");

    /** 海外客户编号 */
    public static CertType HWKH = new CertType("Q", "cthwkh");

    /** 营业执照号码 */
    public static CertType YYZZ = new CertType("R", "ctyyzz");

    /** 其他有效证件 */
    public static CertType QTZJ = new CertType("U", "ctqtzj");

    /** 公司卡 */
    public static CertType GSK = new CertType("V", "ctgsk");

    /** 其他 */
    public static CertType QT = new CertType("Z", "ctqt");

    public static CertType[] COMMON = { GMSFZ, JUNGZ, JFJWZ, JINGGZ, JFJSBZ, HKB, GAHXZ, TTXZ, WGHZ, ZGHZ, WJWZ, WJSB, QGZZJG, HWKH, YYZZ, QTZJ, GSK };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(CertType.class);
        return Arrays.asList(all);
    }

    public static CertType getEnumByValue(String value) {
        CertType enm = (CertType) EnumUtil.getStringEnum(CertType.class, value);
        return enm;
    }
}
