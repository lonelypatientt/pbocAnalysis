package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 批量数据处理状态 
 * @author xihn 
 * @version $Revision: 1.1 $
 */
public class BranchFlg extends StringEnumTypeImp {

    public BranchFlg(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 处理成功*/
    public static BranchFlg COMPLETE = new BranchFlg("0", "branchFlg.complete");

    /** 处理中 */
    public static BranchFlg PROCESS = new BranchFlg("1", "branchFlg.process");
    
    /** 处理失败 */
    public static BranchFlg FAIL = new BranchFlg("2", "branchFlg.fail");

    public static BranchFlg[] COMMON = { COMPLETE, PROCESS,FAIL };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(BranchFlg.class);
        return Arrays.asList(all);
    }

    public static BranchFlg getEnumByValue(String value) {
        BranchFlg enm = (BranchFlg) EnumUtil.getStringEnum(BranchFlg.class, value);
        return enm;
    }
}
