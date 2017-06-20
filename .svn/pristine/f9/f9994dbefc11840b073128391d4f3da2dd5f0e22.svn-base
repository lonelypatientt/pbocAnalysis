
package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 业务类型
 * 
 */
public class BusinessType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private BusinessType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 贷款 */
	public static final BusinessType DK = new BusinessType("1",
			BusinessType.class.getName() + ".dk");

	/** 贷记卡 */
	public static final BusinessType DJK = new BusinessType("2",
			BusinessType.class.getName() + ".djk");

	/** 准贷记卡*/
	public static final BusinessType ZDJK = new BusinessType("3",
			BusinessType.class.getName() + ".zdjk");

	public static final BusinessType[] ALL = {DK,DJK,ZDJK};


	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(BusinessType.class);
		return Arrays.asList(all);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.core.data.Mappedable#getProperties()
	 */
	public Map getProperties() {
		return null;
	}
	
	public static void main(String[] args) {
		BusinessType b=BusinessType.ZDJK;
		System.out.println(b.getValue());
		System.out.println(BusinessType.ZDJK.getValue());
	}
}
