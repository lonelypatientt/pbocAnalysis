
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
public class BlackListType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private BlackListType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 黑名单 */
	public static final BlackListType BLACKLIST = new BlackListType("0", "blacklist");
	
	/** 灰名单 */
	public static final BlackListType GREYLIST = new BlackListType("1", "greylist");

	public static final BlackListType[] ALL = {BLACKLIST, GREYLIST};


	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(BlackListType.class);
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
		BlackListType b=BlackListType.GREYLIST;
		System.out.println(b.getValue());
		System.out.println(BlackListType.GREYLIST.toString());
	}
}
