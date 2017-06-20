package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 人物关系 (2010-10-16 下午07:19:10)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class PeopleRelationship extends StringEnumTypeImp {

    public PeopleRelationship(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 本人 */
    public static PeopleRelationship SELF = new PeopleRelationship("1", "peopleRelationship.self");

    /** 父母 */
    public static PeopleRelationship PARENTS = new PeopleRelationship("2", "peopleRelationship.parents");

    /** 配偶 */
    public static PeopleRelationship SPOUSE = new PeopleRelationship("3", "peopleRelationship.spouse");

    /** 同事 */
    public static PeopleRelationship COLLEAGUE = new PeopleRelationship("4", "peopleRelationship.colleague");

    /** 朋友 */
    public static PeopleRelationship FRIEND = new PeopleRelationship("5", "peopleRelationship.friend");

    /** 子女 */
    public static PeopleRelationship CHILD = new PeopleRelationship("6", "peopleRelationship.child");

    /** 其他 */
    public static PeopleRelationship OTHER = new PeopleRelationship("7", "peopleRelationship.other");

    public static PeopleRelationship[] COMMON = { SELF, PARENTS, SPOUSE, COLLEAGUE, FRIEND, CHILD, OTHER };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(PeopleRelationship.class);
        return Arrays.asList(all);
    }

    public static PeopleRelationship getEnumByValue(String value) {
        PeopleRelationship enm = (PeopleRelationship) EnumUtil.getStringEnum(PeopleRelationship.class, value);
        return enm;
    }
}
