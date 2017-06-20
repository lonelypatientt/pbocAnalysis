package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 规则风险预警级别
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class RuleLevel extends StringEnumTypeImp {

    public RuleLevel(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 高 */
    public static RuleLevel G = new RuleLevel("1", "ruleLevel.g");

    /** 中*/
    public static RuleLevel Z = new RuleLevel("2", "ruleLevel.z");
    
    /** 低*/
    public static RuleLevel D = new RuleLevel("3", "ruleLevel.d");

    public static RuleLevel[] COMMON = { G, Z, D };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(RuleLevel.class);
        return Arrays.asList(all);
    }

    public static RuleLevel getEnumByValue(String value) {
        RuleLevel enm = (RuleLevel) EnumUtil.getStringEnum(RuleLevel.class, value);
        return enm;
    }
}
