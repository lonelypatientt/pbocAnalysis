package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 风险等级
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class RiskRank extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public RiskRank(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 风险很高 */
	public static RiskRank FXHG = new RiskRank("1", "riskRank.fxhg");

	/** 风险较高 */
	public static RiskRank FXJG = new RiskRank("2", "riskRank.fxjg");

	/** 风险中等 */
	public static RiskRank FXZD = new RiskRank("3", "riskRank.fxzd");
	
	/** 风险较低 */
	public static RiskRank FXJD = new RiskRank("4", "riskRank.fxjd");
	
	/** 风险很低 */
	public static RiskRank FXHD = new RiskRank("5", "riskRank.fxhd");

	public static RiskRank[] COMMON = { FXHG, FXJG, FXZD, FXJD, FXHD };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(RiskRank.class);
		return Arrays.asList(all);
	}

	public static RiskRank getEnumByValue(String value) {
		RiskRank enm = (RiskRank) EnumUtil.getStringEnum(RiskRank.class, value);
		return enm;
	}
}
