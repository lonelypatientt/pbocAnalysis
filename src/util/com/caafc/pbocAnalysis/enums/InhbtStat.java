package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 住房状况
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class InhbtStat extends StringEnumTypeImp {

    public InhbtStat(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 自有房、300平方米（含）以上 */
    public static InhbtStat ZYF300 = new InhbtStat("11", "inhbtStat.zyf300");
    
    /**自有房、180（含）—300平方米  */
    public static InhbtStat ZYF180 = new InhbtStat("12", "inhbtStat.zyf180");
    
    /** 自有房、140（含）—180平方米 */
    public static InhbtStat ZYF140 = new InhbtStat("13", "inhbtStat.zyf140");
    
    /** 自有房、80（含）—140平方米 */
    public static InhbtStat ZYF80 = new InhbtStat("14", "inhbtStat.zyf80");
    
    /** 自有房、80平方米以下 */
    public static InhbtStat ZYF80down = new InhbtStat("15", "inhbtStat.zyf80down");
    
    /** 按揭房、300平方米（含）以上 */
    public static InhbtStat AJF300 = new InhbtStat("21", "inhbtStat.ajf300");
    
    /** 按揭房、180（含）—300平方米 */
    public static InhbtStat AJF180 = new InhbtStat("22", "inhbtStat.ajf180");
    
    /** 按揭房、140（含）—180平方米 */
    public static InhbtStat AJF140 = new InhbtStat("23", "inhbtStat.ajf140");
    
    /** 按揭房、80（含）—140平方米 */
    public static InhbtStat AJF80 = new InhbtStat("24", "inhbtStat.ajf80");
    
    /** 按揭房、80平方米以下 */
    public static InhbtStat AJF80down = new InhbtStat("25", "inhbtStat.AJF80down");
    
    /** 父母所有 */
    public static InhbtStat FM = new InhbtStat("31", "inhbtStat.fm");
    
    /** 租赁、无房（单位宿舍） */
    public static InhbtStat ZF = new InhbtStat("41", "inhbtStat.zf");

    /** 其它 */
    public static InhbtStat QT = new InhbtStat("99", "inhbtStat.qt");
   

    public static InhbtStat[] COMMON = { ZYF300, ZYF180, ZYF140, ZYF80, ZF, ZYF80down, AJF300, AJF180,AJF140,AJF80,AJF80down,FM,ZF };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(InhbtStat.class);
        return Arrays.asList(all);
    }

    public static InhbtStat getEnumByValue(String value) {
        InhbtStat enm = (InhbtStat) EnumUtil.getStringEnum(InhbtStat.class, value);
        return enm;
    }
}
