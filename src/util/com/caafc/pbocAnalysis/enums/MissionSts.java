
package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 任务执行状态
 */
public class MissionSts extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *            
	 * @param resourceKeyֵ
	 */
	private MissionSts(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final MissionSts NULL = new MissionSts(null,
			MissionSts.class.getName() + ".none");	

	/** 执行中 */
	public static final MissionSts DISPOSING = new MissionSts("1",
			MissionSts.class.getName() + ".disposing");

	/** 执行成功 */
	public static final MissionSts SUCCESS = new MissionSts("0",
			MissionSts.class.getName() + ".success");

	/** 执行失败 */
	public static final MissionSts FAILED = new MissionSts("2",
			MissionSts.class.getName() + ".failed");

//	/** ���� */
//	public static final MissionSts REPEAL = new MissionSts("4",
//			MissionSts.class.getName() + ".repeal");

	public static final MissionSts[] ALL = { DISPOSING, SUCCESS, FAILED};

	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final MissionSts fromString(String value) {
		MissionSts result = (MissionSts) EnumUtil
				.findStringEnumType(ALL, value);
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
