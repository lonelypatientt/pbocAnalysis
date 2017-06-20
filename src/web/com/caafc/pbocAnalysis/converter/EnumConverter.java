package com.caafc.pbocAnalysis.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.caafc.pbocAnalysis.enums.AddressType;
import com.caafc.pbocAnalysis.enums.AuditingState;
import com.caafc.pbocAnalysis.enums.BrowFlag;
import com.caafc.pbocAnalysis.enums.CertType;
import com.caafc.pbocAnalysis.enums.CommonStringStatus;
import com.caafc.pbocAnalysis.enums.CustApplyStatus;
import com.caafc.pbocAnalysis.enums.CustCate;
import com.caafc.pbocAnalysis.enums.CustCertType;
import com.caafc.pbocAnalysis.enums.CustLev;
import com.caafc.pbocAnalysis.enums.CustManStatus;
import com.caafc.pbocAnalysis.enums.CustType;
import com.caafc.pbocAnalysis.enums.Degree;
import com.caafc.pbocAnalysis.enums.DevChkFlag;
import com.caafc.pbocAnalysis.enums.Duty;
import com.caafc.pbocAnalysis.enums.EmployeeType;
import com.caafc.pbocAnalysis.enums.Flag;
import com.caafc.pbocAnalysis.enums.GurantCate;
import com.caafc.pbocAnalysis.enums.GurantStat;
import com.caafc.pbocAnalysis.enums.InhbtStat;
import com.caafc.pbocAnalysis.enums.JobTitle;
import com.caafc.pbocAnalysis.enums.MaritalStatus;
import com.caafc.pbocAnalysis.enums.PeopleRelationship;
import com.caafc.pbocAnalysis.enums.ReadState;
import com.caafc.pbocAnalysis.enums.RelateType;
import com.caafc.pbocAnalysis.enums.Sex;
import com.caafc.pbocAnalysis.enums.StarLevel;
import com.caafc.pbocAnalysis.enums.StudyExp;
import com.caafc.pbocAnalysis.enums.SysAwokeParticularType;
import com.caafc.pbocAnalysis.enums.SysAwokeType;
import com.caafc.pbocAnalysis.enums.UnitKind;
import com.caafc.pbocAnalysis.enums.UserTle;
import com.caafc.pbocAnalysis.enums.UserType;
import com.caafc.pbocAnalysis.enums.WorkType;

/**
 * 枚举类 类型转换 (2010-11-18 上午10:51:25)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class EnumConverter extends StrutsTypeConverter {

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map,
     *      java.lang.String[], java.lang.Class)
     */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {

        if (values[0] == null || values[0].trim().equals(""))
            return null;
        else {
            if (toClass == AddressType.class)
                return AddressType.getEnumByValue(values[0]);
            else if (toClass == AuditingState.class)
                return AuditingState.getEnumByValue(values[0]);
            else if (toClass == CertType.class)
                return CertType.getEnumByValue(values[0]);
            else if (toClass == CommonStringStatus.class)
                return CommonStringStatus.getEnumByValue(values[0]);
            else if (toClass == Flag.class)
                return Flag.getEnumByValue(values[0]);
            else if (toClass == PeopleRelationship.class)
                return PeopleRelationship.getEnumByValue(values[0]);
            else if (toClass == UserType.class)
                return UserType.getEnumByValue(values[0]);
            else if (toClass == UserTle.class)
                return UserTle.getEnumByValue(values[0]);
            else if (toClass == BrowFlag.class)
                return BrowFlag.getEnumByValue(values[0]);
            else if (toClass == SysAwokeParticularType.class)
                return SysAwokeParticularType.getEnumByValue(values[0]);
            else if (toClass == SysAwokeType.class)
                return SysAwokeType.getEnumByValue(values[0]);
            else if (toClass == StarLevel.class)
                return StarLevel.getEnumByValue(values[0]);
            else if (toClass == CustCate.class)
                return CustCate.getEnumByValue(values[0]);
            else if (toClass == Sex.class)
                return Sex.getEnumByValue(values[0]);
            else if (toClass == MaritalStatus.class)
                return MaritalStatus.getEnumByValue(values[0]);
            else if (toClass == StudyExp.class)
                return StudyExp.getEnumByValue(values[0]);
            else if (toClass == Degree.class)
                return Degree.getEnumByValue(values[0]);
            else if (toClass == UnitKind.class)
                return UnitKind.getEnumByValue(values[0]);
            else if (toClass == WorkType.class)
                return WorkType.getEnumByValue(values[0]);
            else if (toClass == Duty.class)
                return Duty.getEnumByValue(values[0]);
            else if (toClass == JobTitle.class)
                return JobTitle.getEnumByValue(values[0]);
            else if (toClass == InhbtStat.class)
                return InhbtStat.getEnumByValue(values[0]);
            else if (toClass == CustLev.class)
                return CustLev.getEnumByValue(values[0]);
            else if (toClass == EmployeeType.class)
                return EmployeeType.getEnumByValue(values[0]);
            else if (toClass == CustType.class)
                return CustType.getEnumByValue(values[0]);
            else if (toClass == CustCertType.class)
                return CustCertType.getEnumByValue(values[0]);
            else if (toClass == AuditingState.class)
                return AuditingState.getEnumByValue(values[0]);
            else if (toClass == CustApplyStatus.class)
                return CustApplyStatus.getEnumByValue(values[0]);
            else if (toClass == DevChkFlag.class)
                return DevChkFlag.getEnumByValue(values[0]);
            else if (toClass == CustManStatus.class)
                return CustManStatus.getEnumByValue(values[0]);
            else if (toClass == GurantCate.class)
                return GurantCate.getEnumByValue(values[0]);
            else if (toClass == GurantStat.class)
                return GurantStat.getEnumByValue(values[0]);
            else if (toClass == ReadState.class)
                return ReadState.getEnumByValue(values[0]);
            else if (toClass == RelateType.class)
                return RelateType.getEnumByValue(values[0]);
            else
                return null;
        	  
        }
        
    }

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map,
     *      java.lang.Object)
     */
    @Override
    public String convertToString(Map context, Object obj) {
        // TODO (2010-11-18 上午10:51:25) 自动生成方法存根
        return null;

    }

}
