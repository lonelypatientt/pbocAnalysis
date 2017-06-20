
package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 人行征信返回的证件类型
 * 
 */
public class PbocBackCertType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private PbocBackCertType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final PbocBackCertType NULL = new PbocBackCertType(null,
			PbocBackCertType.class.getName() + ".none");

	/* ------------------------------------------ */
	/** 身份证 */
	public static final PbocBackCertType SFZ = new PbocBackCertType("0",
			PbocBackCertType.class.getName() + ".sfz");

	/** 户口簿 */
	public static final PbocBackCertType HKB = new PbocBackCertType("1",
			PbocBackCertType.class.getName() + ".hkb");

	/** 护照*/
	public static final PbocBackCertType HZ = new PbocBackCertType("2",
			PbocBackCertType.class.getName() + ".hz");

	/** 军官证 */
	public static final PbocBackCertType JGZ = new PbocBackCertType("3",
			PbocBackCertType.class.getName() + ".jgz");
	
	/** 士兵证 */
	public static final PbocBackCertType SBZ = new PbocBackCertType("4",
			PbocBackCertType.class.getName() + ".sbz");
	
	/** 港澳居民来往内地通行证 */
	public static final PbocBackCertType GAZ = new PbocBackCertType("5",
			PbocBackCertType.class.getName() + ".gaz");
	
	/** 台湾同胞来往内地通行证 */
	public static final PbocBackCertType TWZ = new PbocBackCertType("6",
			PbocBackCertType.class.getName() + ".twz");
	
	/** 临时身份证 */
	public static final PbocBackCertType LSZ = new PbocBackCertType("7",
			PbocBackCertType.class.getName() + ".lsz");
	
	/** 外国人居留证 */
	public static final PbocBackCertType WGZ = new PbocBackCertType("8",
			PbocBackCertType.class.getName() + ".wgz");
	
	/** 警官证 */
	public static final PbocBackCertType JCZ = new PbocBackCertType("9",
			PbocBackCertType.class.getName() + ".jcz");

	/** 其他证件 */
	public static final PbocBackCertType QTZ = new PbocBackCertType("X",
			PbocBackCertType.class.getName() + ".qtz");
	

	public static final PbocBackCertType[] ALL = { SFZ,HKB,HZ,JGZ,SBZ,GAZ,TWZ,LSZ,WGZ,JCZ,QTZ};

	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final PbocBackCertType fromString(String value) {
		PbocBackCertType result = (PbocBackCertType) EnumUtil.findStringEnumType(
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
