package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

public class UserType extends StringEnumTypeImp {

    public UserType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 普通用户 */
    public static UserType NORMAL = new UserType("1", "userType.normal");

    /** 客户经理 */
    public static UserType CM = new UserType("2", "userType.cm");

    /** 客户经理主管 */
    public static UserType CRM = new UserType("3", "userType.crm");

    /** 网点负责人 */
    public static UserType WDFZR = new UserType("4", "userType.wdfzr");

    /** 总行管理用户 */
    public static UserType ZHGL = new UserType("9", "userType.zhgl");

    public static UserType[] COMMON = { NORMAL, CM, CRM, WDFZR, ZHGL };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(UserType.class);
        return Arrays.asList(all);
    }

    public static UserType getEnumByValue(String value) {
        UserType enm = (UserType) EnumUtil.getStringEnum(UserType.class, value);
        return enm;
    }
}
