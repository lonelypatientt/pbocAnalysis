package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 关联关系类型
 * 
 * @author zl
 * @version $Revision: 1.1 $
 */
public class RelType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public RelType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}

	/** 父母 */
	public static RelType FM = new RelType("00", "relType.fm");

	/** 配偶 */
	public static RelType PO = new RelType("01", "relType.po");
	
	/** 亲属*/
	public static RelType QS = new RelType("02", "relType.qs");
	
	/** 子女 */
	public static RelType ZV = new RelType("03", "relType.zv");
	
	/** 朋友 */
	public static RelType PY = new RelType("04", "relType.py");
	
	/** 师生 */
	public static RelType SS = new RelType("05", "relType.ss");
	
	/** 同学 */
	public static RelType TX = new RelType("06", "relType.tx");
	
	/** 同事*/
	public static RelType TS = new RelType("07", "relType.ts");
	/** 其他 */
	public static RelType QT = new RelType("10", "relType.qt");
	/** 开拓人 */
	public static RelType KTR = new RelType("21", "relType.ktr");
	/** 保证人 */
	public static RelType BZR = new RelType("22", "relType.bzr");
	/** 抵制押人 */
	public static RelType DZYR = new RelType("23", "relType.dzyr");
	/** 客户经理 */
	public static RelType KHJL = new RelType("24", "relType.khjl");
	/** 推荐人 */
	public static RelType TJR = new RelType("25", "relType.tjr ");

	
	
	public static RelType[] COMMON = { FM, PO, QS , ZV , PY ,SS, TX ,TS,QT,KTR,BZR,DZYR,KHJL,TJR};

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(RelType.class);
		return Arrays.asList(all);
	}

	public static RelType getEnumByValue(String value) {
		RelType enm = (RelType) EnumUtil.getStringEnum(RelType.class, value);
		return enm;
	}
}
