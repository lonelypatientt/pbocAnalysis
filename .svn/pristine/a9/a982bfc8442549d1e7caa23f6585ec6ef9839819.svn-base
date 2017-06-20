package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 业务模块
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class BusinessModule extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public BusinessModule(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}
	/* ------------------------------------------ */
	/** 对公风险预警*/
	public static final BusinessModule DGFXYJ = new BusinessModule("1",
			"businessModule.dgfxyj");

	/**房贷早期预警*/
	public static final BusinessModule FDYJ = new BusinessModule("2",
			"businessModule.fdyj");
	
	/** 征信数据批量装载(按天)*/
	public static final BusinessModule PRCL = new BusinessModule("3",
			"businessModule.prcl");

	/** 征信数据批量装载(按月)*/
	public static final BusinessModule PRCLM = new BusinessModule("4",
			"businessModule.prclm");
	
	/** 风险预警(按月)  */
	public static final BusinessModule FXYJM = new BusinessModule("5",
			"businessModule.fxyjm");
	
	/** 信用卡催收  */
	public static final BusinessModule XYKCS = new BusinessModule("6",
			"businessModule.xykcs");
	
	/**信用调额*/
	public static final BusinessModule XYKTE = new BusinessModule("7",
			"businessModule.xykte");
	/**信用调额（征信部分）*/
	public static final BusinessModule XYKTEPBOC = new BusinessModule("8",
			"businessModule.xyktepboc");

	
	public static BusinessModule[] COMMON = {DGFXYJ,FDYJ,XYKCS,XYKTE,XYKTEPBOC };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(BusinessModule.class);
		return Arrays.asList(all);
	}

	public static BusinessModule getEnumByValue(String value) {
		BusinessModule enm = (BusinessModule) EnumUtil.getStringEnum(BusinessModule.class, value);
		return enm;
	}
}
