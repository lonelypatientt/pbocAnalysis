package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 房贷，综合消费贷关联关系人类型
 * 
 * @author zl
 * @version $Revision: 1.1 $
 */
public class RelationType extends StringEnumTypeImp {

	/**
	 * @param storeValue
	 * @param resourceKey
	 * @param msgResource
	 */
	public RelationType(String storeValue, String resourceKey) {
		super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
	}
	/** 本人 */
	public static final RelationType SELF = new RelationType("1", "本人");
	/** 配偶 */
	public static final RelationType SPOUSE = new RelationType("2", "配偶");
	/** 共同还款人N1 */
	public static final RelationType COMMREPAYN1 = new RelationType("3", "共同还款人N1");
	/** 共同还款人N2 */
	public static final RelationType COMMREPAYN2 = new RelationType("4", "共同还款人N2");
	/** 共同还款人N3 */
	public static final RelationType COMMREPAYN3 = new RelationType("5", "共同还款人N3");
	/** 共同还款人N4 */
	public static final RelationType COMMREPAYN4 = new RelationType("6", "共同还款人N4");
	/**担保人N1 */
	public static final RelationType GUARANTORN1 = new RelationType("7", "担保人N1");
	/** 担保人N2 */
	public static final RelationType GUARANTORN2 = new RelationType("8", "担保人N2");
	/** 担保人N3 */
	public static final RelationType GUARANTORN3 = new RelationType("9", "担保人N3");
	/** 担保人N4 */
	public static final RelationType GUARANTORN4 = new RelationType("10", "担保人N4");
	
	public static final RelationType[] COMMON = { SELF, SPOUSE, COMMREPAYN1,COMMREPAYN2,COMMREPAYN3,COMMREPAYN4,GUARANTORN1,GUARANTORN2,GUARANTORN3,GUARANTORN4 };

	public static List<SerializableEnum> getEnumList() {
		SerializableEnum[] all = EnumUtil.getAll(RelationType.class);
		return Arrays.asList(all);
	}

	public static RelationType getEnumByValue(String value) {
		RelationType enm = (RelationType) EnumUtil.getStringEnum(RelationType.class, value);
		return enm;
	}
	public static void main(String[] args) {
		RelationType relationType1 = new RelationType("1", "本人");
		RelationType relationType2 = RelationType.SELF;
		
		System.out.println("relationType1: " + (relationType1==RelationType.SELF));
		System.out.println("relationType2: " + (relationType2==RelationType.SELF));
		System.out.println("relationType1,2: " + (relationType1==relationType2));
		
	}
}
