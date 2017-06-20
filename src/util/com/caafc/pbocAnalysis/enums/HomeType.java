package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 房屋类别
 * 
 * @author HLRain
 * @version $Revision: 1.1 $
 */
public class HomeType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public HomeType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 一手房 */
	public static HomeType FIRSTHAND = new HomeType("1", "homeType.firstHand");

	/** 二手房 */
	public static HomeType USED = new HomeType("0", "homeType.used");

	
	
	public static HomeType[] COMMON = { FIRSTHAND, USED };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(HomeType.class);
		return Arrays.asList(all);
	}

	public static HomeType getEnumByValue(String value) {
		HomeType enm = (HomeType) EnumUtil.getStringEnum(HomeType.class, value);
		return enm;
	}
}
