package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 风险名单类型
 * 
 * @author zl
 * @version $Revision: 1.1 $
 */
public class SpclSrcType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public SpclSrcType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 信用卡黑名单 */
	public static SpclSrcType XYKHMD = new SpclSrcType("12001", "spclSrcType.xykhmd");

	/** 信用卡灰名单 */
	public static SpclSrcType XYKHUIMD = new SpclSrcType("11001", "spclSrcType.xykhuimd");
	
	/** 个贷黑名单 */
	public static SpclSrcType GDHMD = new SpclSrcType("12002", "spclSrcType.gdhmd");
	
	/** 个贷灰名单 */
	public static SpclSrcType GDHUIMD = new SpclSrcType("11002", "spclSrcType.gdhuimd");
	
	/** 银监个人黑名单 */
	public static SpclSrcType YJGRHMD = new SpclSrcType("12003", "spclSrcType.yjhmd");
	
	/** 银监企业黑名单 */
	public static SpclSrcType YJQYHMD = new SpclSrcType("22001", "spclSrcType.yjqyhmd");
	
	/** 个人欺诈黑名单 */
	public static SpclSrcType QZHMD = new SpclSrcType("12004", "spclSrcType.qzhmd");
	
	/** 江苏银行行内员工	 */
	public static SpclSrcType HNYG = new SpclSrcType("13001", "spclSrcType.hnyg");

	public static SpclSrcType[] COMMON = { XYKHMD, XYKHUIMD, GDHMD , GDHUIMD , YJGRHMD ,YJQYHMD, HNYG ,QZHMD};

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(SpclSrcType.class);
		return Arrays.asList(all);
	}

	public static SpclSrcType getEnumByValue(String value) {
		SpclSrcType enm = (SpclSrcType) EnumUtil.getStringEnum(SpclSrcType.class, value);
		return enm;
	}
}
