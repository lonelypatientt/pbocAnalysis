package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 决策组件类型 
 * @author xihn 
 * @version $Revision: 1.1 $
 */
public class ComponentType extends StringEnumTypeImp {

    public ComponentType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 规则集*/
    public static ComponentType RULES = new ComponentType("1", "componentType.rules");

    /** 评分卡 */
    public static ComponentType PK = new ComponentType("2", "componentType.pk");
    
    /** 决策表 */
    public static ComponentType DICISION = new ComponentType("3", "componentType.dicision");
    
    /** 决策树 */
    public static ComponentType DICISIONTREE = new ComponentType("4", "componentType.dicisionTree");
    
    /** 函数 */
    public static ComponentType FUN = new ComponentType("5", "componentType.fun");

    public static ComponentType[] COMMON = { RULES, PK,DICISION,DICISIONTREE,FUN };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(ComponentType.class);
        return Arrays.asList(all);
    }

    public static ComponentType getEnumByValue(String value) {
        ComponentType enm = (ComponentType) EnumUtil.getStringEnum(ComponentType.class, value);
        return enm;
    }
}
