
package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 信用卡状态
 * 
 */
public class CardStatus extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private CardStatus(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final CardStatus NULL = new CardStatus(null,
			CardStatus.class.getName() + ".none");

	/* ------------------------------------------ */
	/** 正常 */
	public static final CardStatus ZC = new CardStatus("1",
			CardStatus.class.getName() + ".zc");

	/** 冻结 */
	public static final CardStatus DJ = new CardStatus("2",
			CardStatus.class.getName() + ".dj");

	/** 止付*/
	public static final CardStatus ZF = new CardStatus("3",
			CardStatus.class.getName() + ".zf");

	/** 销户 */
	public static final CardStatus XH = new CardStatus("0",
			CardStatus.class.getName() + ".xh");
	
	/** 呆账 */
	public static final CardStatus DZ = new CardStatus("4",
			CardStatus.class.getName() + ".dz");
	
	/** 未激活 */
	public static final CardStatus WJH = new CardStatus("6",
			CardStatus.class.getName() + ".wjh");
	

	public static final CardStatus[] ALL = {ZC,DJ,ZF,XH,DZ,WJH};

	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final CardStatus fromString(String value) {
		CardStatus result = (CardStatus) EnumUtil.findStringEnumType(
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
