package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 币种
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class MoneyType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public MoneyType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 人民币 */
	public static MoneyType RMB = new MoneyType("0", "moneyType.rmb");

	/** 美元 */
	public static MoneyType DOLS = new MoneyType("1", "moneyType.dols");

	/** 其他 */
	public static MoneyType OTHER = new MoneyType("2", "moneyType.other");

	public static MoneyType[] COMMON = { RMB, DOLS, OTHER };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(MoneyType.class);
		return Arrays.asList(all);
	}

	public static MoneyType getEnumByValue(String value) {
		MoneyType enm = (MoneyType) EnumUtil.getStringEnum(MoneyType.class, value);
		return enm;
	}
}
