package com.caafc.pbocAnalysis.enums;

import java.util.Arrays;
import java.util.List;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.SerializableEnum;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 学历 (2011-2-27 上午02:24:09)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class StudyExp extends StringEnumTypeImp {

    public StudyExp(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 研究生 */
    public static StudyExp YJS = new StudyExp("2001", "studyExp.yjs");

    /** 大学本科 */
    public static StudyExp DX = new StudyExp("2502", "studyExp.dx");

    /** 大学专科和专科学校*/
    public static StudyExp DZ = new StudyExp("3003", "studyExp.dz");

    /** 中等专业学校或中等技术学校 */
    public static StudyExp ZZ = new StudyExp("4004", "studyExp.zz");

    /** 技术学校*/
    public static StudyExp JG = new StudyExp("5005", "studyExp.jg");

    /** 高中 */
    public static StudyExp GZ = new StudyExp("6006", "studyExp.gz");

    /** 初中 */
    public static StudyExp CZ = new StudyExp("7007", "studyExp.cz");

    /** 小学 */
    public static StudyExp XX = new StudyExp("8008", "studyExp.xx");

    /** 文盲或半文盲 */
    public static StudyExp WM = new StudyExp("9009", "studyExp.wm");
    
    /**博士后*/
    public static StudyExp 	BO = new StudyExp("1000", "studyExp.bo");
    
    /**博士研究生*/
    public static StudyExp 	BOYJS = new StudyExp("1500", "studyExp.boyjs");

    /** 未知 */
    public static StudyExp UNKNOW = new StudyExp("9999 ", "studyExp.unknow");

    public static StudyExp[] COMMON = { YJS, DX, DZ, ZZ, JG, GZ, CZ, XX, WM, UNKNOW,BO,BOYJS };

    public static List<SerializableEnum> getEnumList() {
        SerializableEnum[] all = EnumUtil.getAll(StudyExp.class);
        return Arrays.asList(all);
    }

    public static StudyExp getEnumByValue(String value) {
        StudyExp enm = (StudyExp) EnumUtil.getStringEnum(StudyExp.class, value);
        return enm;
    }
}
