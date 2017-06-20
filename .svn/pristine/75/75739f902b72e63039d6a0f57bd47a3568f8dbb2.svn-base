package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 婚姻状况 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class MaritalStatus extends StringEnumTypeImp {

    public MaritalStatus(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 未婚 */
    public static MaritalStatus WH = new MaritalStatus("101", "maritalStatus.wh");

    /** 已婚 */
    public static MaritalStatus YH = new MaritalStatus("202", "maritalStatus.yh");
    
    /** 初婚 */
    public static MaritalStatus CH = new MaritalStatus("210", "maritalStatus.ch");

    /** 再婚 */
    public static MaritalStatus ZH = new MaritalStatus("220", "maritalStatus.zh");

    /** 复婚*/
    public static MaritalStatus FH = new MaritalStatus("220", "maritalStatus.fh");
    
    /** 丧偶 */
    public static MaritalStatus SO = new MaritalStatus("303", "maritalStatus.so");

    /** 离婚 */
    public static MaritalStatus LY = new MaritalStatus("404", "maritalStatus.lh");

    /** 未说明的婚姻状况 */
    public static MaritalStatus WSMHYZK = new MaritalStatus("900 ", "maritalStatus.wsmhyzk");
    
    /** 分居 */
    public static MaritalStatus FJ = new MaritalStatus("90P", "maritalStatus.fj");
    
    public static MaritalStatus[] COMMON = { WH, YH, SO, LY ,CH,ZH,FH,WSMHYZK};

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(MaritalStatus.class);
        return Arrays.asList(all);
    }

    public static MaritalStatus getEnumByValue(String value) {
        MaritalStatus enm = (MaritalStatus) EnumUtil.getStringEnum(MaritalStatus.class, value);
        return enm;
    }
}
