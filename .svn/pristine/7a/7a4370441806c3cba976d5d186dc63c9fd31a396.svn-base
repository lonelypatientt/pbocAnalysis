package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 卡类型
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class CardType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public CardType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 正常 */
	public static CardType CREATCARD = new CardType("0", "cardType.creatCard");

	/** 结清 */
	public static CardType ZDJCARD = new CardType("1", "cardType.zdjCard");

	/** 其他 */
	public static CardType OTHER = new CardType("2", "cardType.other");

	public static CardType[] COMMON = { CREATCARD, ZDJCARD, OTHER };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(CardType.class);
		return Arrays.asList(all);
	}

	public static CardType getEnumByValue(String value) {
		CardType enm = (CardType) EnumUtil.getStringEnum(CardType.class, value);
		return enm;
	}
}
