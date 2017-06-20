
package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 贷款状态
 * 
 */
public class LoanStatus extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private LoanStatus(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final LoanStatus NULL = new LoanStatus(null,
			LoanStatus.class.getName() + ".none");

	/* ------------------------------------------ */
	/** 正常 */
	public static final LoanStatus ZC = new LoanStatus("0",
			LoanStatus.class.getName() + ".zc");

	/** 逾期 */
	public static final LoanStatus YQ = new LoanStatus("1",
			LoanStatus.class.getName() + ".yq");

	/** 结清*/
	public static final LoanStatus JQ = new LoanStatus("2",
			LoanStatus.class.getName() + ".jq");

	/** 呆账 */
	public static final LoanStatus DZ = new LoanStatus("3",
			LoanStatus.class.getName() + ".dz");
	
	/** 转出 */
	public static final LoanStatus CC = new LoanStatus("4",
			LoanStatus.class.getName() + ".cc");	
	

	public static final LoanStatus[] ALL = {ZC,YQ,JQ,DZ,CC };

	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final LoanStatus fromString(String value) {
		LoanStatus result = (LoanStatus) EnumUtil.findStringEnumType(
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
