package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 职称枚举类 (2011-1-9 下午06:49:47)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class UserTle extends StringEnumTypeImp {

    public UserTle(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 负责人 */
    public static UserTle FZR = new UserTle("1", "userTle.fzr");

    /** 高级 */
    public static UserTle GJ = new UserTle("2", "userTle.gj");

    /** 中级 */
    public static UserTle ZJ = new UserTle("3", "userTle.zj");

    /** 初级 */
    public static UserTle CJ = new UserTle("4", "userTle.cj");

    /** 其他 */
    public static UserTle QT = new UserTle("5", "userTle.qt");

    public static UserTle[] COMMON = { FZR, GJ, ZJ, CJ, QT };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(UserTle.class);
        return Arrays.asList(all);
    }

    public static UserTle getEnumByValue(String value) {
        UserTle enm = (UserTle) EnumUtil.getStringEnum(UserTle.class, value);
        return enm;
    }
}
