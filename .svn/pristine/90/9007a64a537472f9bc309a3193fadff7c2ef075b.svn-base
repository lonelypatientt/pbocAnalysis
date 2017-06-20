package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 地址类型 (2010-10-16 下午07:03:37)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class AddressType extends StringEnumTypeImp {

    public AddressType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 家庭地址 */
    public static AddressType HOME = new AddressType("1", "addr.home");

    /** 公司地址 */
    public static AddressType COMPANY = new AddressType("2", "addr.company");

    public static AddressType[] COMMON = { HOME, COMPANY };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(AddressType.class);
        return Arrays.asList(all);
    }

    public static AddressType getEnumByValue(String value) {
        AddressType enm = (AddressType) EnumUtil.getStringEnum(AddressType.class, value);
        return enm;
    }
}
