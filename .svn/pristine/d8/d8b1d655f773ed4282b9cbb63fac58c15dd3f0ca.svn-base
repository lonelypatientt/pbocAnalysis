package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 决策结果&规则决策结果
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class DecisionResult extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public DecisionResult(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 自动拒绝 */
	public static DecisionResult ZDJJ = new DecisionResult("1", "decisionResult.zdjj");

	/** 建议拒绝 */
	public static DecisionResult JYJJ = new DecisionResult("2", "decisionResult.jyjj");

	/** 人工审查 */
	public static DecisionResult RGSC = new DecisionResult("3", "decisionResult.rgsc");
	
	/** 建议核准 */
	public static DecisionResult JJHZ = new DecisionResult("4", "decisionResult.jjhz");
	
	/** 自动批准 */
	public static DecisionResult ZDPZ = new DecisionResult("5", "decisionResult.zdpz");
	
	public static DecisionResult[] COMMON = { ZDJJ, JYJJ, RGSC, JJHZ, ZDPZ };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(DecisionResult.class);
		return Arrays.asList(all);
	}

	public static DecisionResult getEnumByValue(String value) {
		DecisionResult enm = (DecisionResult) EnumUtil.getStringEnum(DecisionResult.class, value);
		return enm;
	}
}
