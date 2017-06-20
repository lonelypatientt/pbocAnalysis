package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 *  (2012-3-7 下午04:00:45) 关联方类型。
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class RelateType extends StringEnumTypeImp {

    public RelateType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 个人 */
    public static RelateType PRI = new RelateType("个人", "relatetype.pri");

    /** 企业 */
    public static RelateType ENT = new RelateType("企业", "relatetype.ent");
    
    /** 同业 */
    public static RelateType TOY = new RelateType("同业", "relatetype.toy"); 
    
    public static RelateType[] COMMON = { PRI,ENT,TOY};
    
    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(RelateType.class);
        return Arrays.asList(all);
    }

    public static RelateType getEnumByValue(String value) {
    	RelateType rt = (RelateType) EnumUtil.getStringEnum(RelateType.class, value);
        return rt;
    }
}
