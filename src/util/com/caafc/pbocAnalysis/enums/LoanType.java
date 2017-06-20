package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 贷款品种
 * 
 */
public class LoanType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private LoanType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final LoanType NULL = new LoanType(null,
			LoanType.class.getName() + ".none");

	/* ------------------------------------------ */
	/** 个人住房贷款 */
	public static final LoanType ZF = new LoanType("11",
			LoanType.class.getName() + ".zf");

	/** 个人商用房贷款 */
	public static final LoanType SF = new LoanType("12",
			LoanType.class.getName() + ".sf");

	/** 个人住房公积金贷款*/
	public static final LoanType GJ = new LoanType("13",
			LoanType.class.getName() + ".gj");

	/** 个人汽车消费贷款 */
	public static final LoanType CAR = new LoanType("21",
			LoanType.class.getName() + ".car");
	
	/** 个人助学贷款 */
	public static final LoanType ZX = new LoanType("31",
			LoanType.class.getName() + ".zx");
	
	/** 个人经营性贷款 */
	public static final LoanType JY = new LoanType("41",
			LoanType.class.getName() + ".jy");
	
	/** 农户贷款 */
	public static final LoanType NH = new LoanType("51",
			LoanType.class.getName() + ".nh");
	
	/** 准贷记卡 */
	public static final LoanType ZC = new LoanType("71",
			LoanType.class.getName() + ".zc");
	
	/** 贷记卡 */
	public static final LoanType DC = new LoanType("81",
			LoanType.class.getName() + ".dc");
	
	/** 个人消费贷款 */
	public static final LoanType XF = new LoanType("91",
			LoanType.class.getName() + ".xf");

	/** 其他 */
	public static final LoanType QT = new LoanType("99",
			LoanType.class.getName() + ".qt");
	

	public static final LoanType[] ALL = { ZF,SF,GJ,CAR,ZX,JY,NH,ZC,DC,XF,QT};

	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final LoanType fromString(String value) {
		LoanType result = (LoanType) EnumUtil.findStringEnumType(
				ALL, value);
		if (result == null)
			result = NULL;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.core.data.Mappedable#getProperties()
	 */
	public Map getProperties() {
		return null;
	}
}
