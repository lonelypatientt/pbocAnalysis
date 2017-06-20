
package com.caafc.pbocAnalysis.enums;

import java.util.Map;

import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 批处理任务类型
 * 1--风险预警(按天)fxyj  2--征信数据批量查询  3--人行征信数据装载(按天) 4--人行征信数据装载(按月) 5--风险预警(按月) 
 */
public class TaskMissionType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 *         
	 * @param resourceKey
	 */
	private TaskMissionType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, TaskEnumUtil.messageResource);
	}

	/** 空值 */
	private static final TaskMissionType NULL = new TaskMissionType(null,
			TaskMissionType.class.getName() + ".none");

	/* ------------------------------------------ */
	/** 对公风险预警*/
	public static final TaskMissionType DGFXYJ = new TaskMissionType("1",
			TaskMissionType.class.getName() + ".dgfxyj");

	/**房贷早期预警*/
	public static final TaskMissionType FDYJ = new TaskMissionType("2",
			TaskMissionType.class.getName() + ".fdyj");
	
	/** 征信数据批量装载(按天)*/
	public static final TaskMissionType PRCL = new TaskMissionType("3",
			TaskMissionType.class.getName() + ".prcl");

	/** 征信数据批量装载(按月)*/
	public static final TaskMissionType PRCLM = new TaskMissionType("4",
			TaskMissionType.class.getName() + ".prclm");
	
	/** 风险预警(按月)  */
	public static final TaskMissionType FXYJM = new TaskMissionType("5",
			TaskMissionType.class.getName() + ".fxyjm");
	
	/** 信用卡催收  */
	public static final TaskMissionType XYKCS = new TaskMissionType("6",
			TaskMissionType.class.getName() + ".xykcs");
	
	/**信用调额*/
	public static final TaskMissionType XYKTE = new TaskMissionType("7",
			TaskMissionType.class.getName() + ".xykte");
	/**信用调额（征信部分）*/
	public static final TaskMissionType XYKTEPBOC = new TaskMissionType("8",
			TaskMissionType.class.getName() + ".xyktepboc");

	

	public static final TaskMissionType[] ALL = { DGFXYJ, FDYJ,PRCL,PRCLM,FXYJM,XYKCS,XYKTE,XYKTEPBOC};


	static { 
		java.util.Arrays.sort(ALL);
	}

	public static final TaskMissionType fromString(String value) {
		TaskMissionType result = (TaskMissionType) EnumUtil.findStringEnumType(
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
