package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 业务模块(策略调用流水号)
 * 
 * @author HLRain
 * @version $Revision: 1.1 $
 */
public class BusinessModuleCode extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public BusinessModuleCode(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 预审批 */
	public static BusinessModuleCode YSP = new BusinessModuleCode("A", "BusinessModuleCode.ysp");

	/** 反欺诈 */
	public static BusinessModuleCode FQZ = new BusinessModuleCode("B", "BusinessModuleCode.fqz");

	/** 审批 */
	public static BusinessModuleCode SP = new BusinessModuleCode("C", "BusinessModuleCode.sp");
	
	/** 风险预警 按天*/
	public static BusinessModuleCode FXYJD = new BusinessModuleCode("D", "BusinessModuleCode.fxyjd");
	
	/**风险预警 按月*/
	public static BusinessModuleCode FXYJM = new BusinessModuleCode("M", "BusinessModuleCode.fxyjm");
	
	public static BusinessModuleCode[] COMMON = { YSP, FQZ, SP, FXYJD ,FXYJM};

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(BusinessModuleCode.class);
		return Arrays.asList(all);
	}

	public static BusinessModuleCode getEnumByValue(String value) {
		BusinessModuleCode enm = (BusinessModuleCode) EnumUtil.getStringEnum(BusinessModuleCode.class, value);
		return enm;
	}
}
