package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 单位性质 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class UnitKind extends StringEnumTypeImp {

    /*
     * 1.企业法人 2.企业非法人 3.个体商户
     * 4.事业单位 5.其他，默认空
     */
    public UnitKind(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 企业法人 */
    public static UnitKind QYFR = new UnitKind("1", "unitKind.qyfr");

    /** 企业非法人 */
    public static UnitKind QYFFR = new UnitKind("2", "unitKind.qyffr");

    /** 个体商户 */
    public static UnitKind GTSH = new UnitKind("3", "unitKind.gtsh");

    /** 事业单位 */
    public static UnitKind SYDW = new UnitKind("4", "unitKind.sydw");

    /** 其他 */
    public static UnitKind OTHER = new UnitKind("5", "unitKind.other");

    public static UnitKind[] COMMON = { QYFR, QYFFR, GTSH, SYDW, OTHER };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(UnitKind.class);
        return Arrays.asList(all);
    }

    public static UnitKind getEnumByValue(String value) {
        UnitKind enm = (UnitKind) EnumUtil.getStringEnum(UnitKind.class, value);
        return enm;
    }
}
