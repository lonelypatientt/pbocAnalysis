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
public class AccountStatus extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public AccountStatus(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 正常 */
	public static AccountStatus NORMAL = new AccountStatus("0", "accountStatus.normal");

	/** 结清 */
	public static AccountStatus FINISH = new AccountStatus("1", "accountStatus.finish");

	/** 其他 */
	public static AccountStatus OTHER = new AccountStatus("2", "accountStatus.other");

	public static AccountStatus[] COMMON = { NORMAL, FINISH, OTHER };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(AccountStatus.class);
		return Arrays.asList(all);
	}

	public static AccountStatus getEnumByValue(String value) {
		AccountStatus enm = (AccountStatus) EnumUtil.getStringEnum(AccountStatus.class, value);
		return enm;
	}
}
