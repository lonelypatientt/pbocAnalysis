package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 账户状态
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class CardAccountStatus extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public CardAccountStatus(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 正常 */
	public static CardAccountStatus NORMAL = new CardAccountStatus("1", "cardAccountStatus.normal");

	/** 未激活*/
	public static CardAccountStatus NOTACTIVATE = new CardAccountStatus("2", "cardAccountStatus.notActivate");

	/** 销户 */
	public static CardAccountStatus CLOSEACCOUNT = new CardAccountStatus("3", "cardAccountStatus.closeAccount");
	
	/** 其他 */
	public static CardAccountStatus OTHER = new CardAccountStatus("4", "cardAccountStatus.other");

	public static CardAccountStatus[] COMMON = { NORMAL, NOTACTIVATE,CLOSEACCOUNT, OTHER };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(CardAccountStatus.class);
		return Arrays.asList(all);
	}

	public static CardAccountStatus getEnumByValue(String value) {
		CardAccountStatus enm = (CardAccountStatus) EnumUtil.getStringEnum(CardAccountStatus.class, value);
		return enm;
	}
}
