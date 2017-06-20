package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 贷款品种枚举
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class LoanVarieties extends StringEnumTypeImp {

    /**
     * @param storeValue
     * @param resourceKey
     */
    public LoanVarieties(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 房易贷 */
    public static LoanVarieties FYD = new LoanVarieties("1", "loanVarieties.fyd");
    
    /**信易贷*/
    public static LoanVarieties XYD = new LoanVarieties("2", "loanVarieties.xyd");
    
    /**按揭贷款*/
    public static LoanVarieties AJDK = new LoanVarieties("3", "loanVarieties.ajdk");
    
    /**综合消费贷款*/
    public static LoanVarieties ZHXFDK = new LoanVarieties("4", "loanVarieties.zhxfdk");
    
    public static LoanVarieties[] COMMON = { FYD, XYD, AJDK, ZHXFDK };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(LoanVarieties.class);
        return Arrays.asList(all);
    }

    public static LoanVarieties getEnumByValue(String value) {
        LoanVarieties ccType = (LoanVarieties) EnumUtil.getStringEnum(LoanVarieties.class, value);
        return ccType;
    }
}
