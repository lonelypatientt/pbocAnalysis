package com.caafc.pbocAnalysis.enums;

import com.caafc.pbocAnalysis.util.EspressoEnumsUtil;
import com.skyon.core.enums.EnumUtil;
import com.skyon.core.enums.StringEnumTypeImp;

/**
 * 员工类别 (2010-10-16 下午09:08:32)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class EmployeeType extends StringEnumTypeImp {

    public EmployeeType(String storeValue, String resourceKey) {
        super(storeValue, resourceKey, EspressoEnumsUtil.msgResource);
    }

    /** 管理人员 */
    public static EmployeeType GL = new EmployeeType("0", "employeeTyp.gl");

    /** 信贷人员 */
    public static EmployeeType XD = new EmployeeType("1", "employeeTyp.xd");

    /** 其他人员 */
    public static EmployeeType OTHER = new EmployeeType("1", "employeeTyp.other");

    public static EmployeeType[] COMMON = { GL, XD, OTHER };

    public static EmployeeType getEnumByValue(String value) {
        EmployeeType enm = (EmployeeType) EnumUtil.getStringEnum(EmployeeType.class, value);
        return enm;
    }
}
