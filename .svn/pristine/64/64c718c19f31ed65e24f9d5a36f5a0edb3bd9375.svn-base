package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 房贷，综合消费贷审批或预审批区分
 * 
 * @author lq
 * @version $Revision: 1.1 $
 */
public class ConsumeOrHouseLoan extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public ConsumeOrHouseLoan(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}
	
	/** 消费贷预审批：0 */
	public static final ConsumeOrHouseLoan CONSUMELOANS_PREAPP = new ConsumeOrHouseLoan("0", "消费贷预审批");
	/** 消费贷审批：1 */
	public static final ConsumeOrHouseLoan CONSUMELOANS_APP = new ConsumeOrHouseLoan("1", "消费贷审批");
	/** 房贷预审批：3 */
	public static final ConsumeOrHouseLoan HOUSELOAN_PREAPP = new ConsumeOrHouseLoan("3", "房贷预审批");
	/** 房贷审批：4 */
	public static final ConsumeOrHouseLoan HOUSELOAN_APP = new ConsumeOrHouseLoan("4", "房贷审批");
	
	public static final ConsumeOrHouseLoan[] COMMON = { CONSUMELOANS_PREAPP, CONSUMELOANS_APP, HOUSELOAN_PREAPP,HOUSELOAN_APP};

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(ConsumeOrHouseLoan.class);
		return Arrays.asList(all);
	}

	public static ConsumeOrHouseLoan getEnumByValue(String value) {
		ConsumeOrHouseLoan enm = (ConsumeOrHouseLoan) EnumUtil.getStringEnum(ConsumeOrHouseLoan.class, value);
		return enm;
	}
	
	public static void main(String[] args) {
		System.out.println(ConsumeOrHouseLoan.class.getName());
	}
}
