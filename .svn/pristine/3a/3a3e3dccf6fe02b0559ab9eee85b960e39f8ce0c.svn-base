
package com.caafc.pbocAnalysis.converter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 角色类型转换 (2010-11-24 下午06:54:00) 
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class CustGrpsConverter extends StrutsTypeConverter {

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map,
     *      java.lang.String[], java.lang.Class)
     */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
/*   TODO
 * 
 *      Set<FdtCustGrp> groups = new HashSet<FdtCustGrp>();
        if (values[0].length() <= 0 || values[0].equals("null"))
            return groups;
        else {
            String[] grpIds = values[0].split(",");
            for (int i = 0; i < grpIds.length; i++)
                groups.add(new FdtCustGrp(Long.parseLong(grpIds[i])));
        }*/
    	Set<Object> groups = new HashSet<Object>();
        return groups;
        
    }

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map,
     *      java.lang.Object)
     */
    @Override
    public String convertToString(Map arg0, Object arg1) {
    	//TODO
//        Set<FdtCustGrp> groups = (Set<FdtCustGrp>) arg1;
//        String[] ids = null;
//        if (groups.size() > 0) {
//            ids = new String[groups.size()];
//            int i = 0;
//            for (FdtCustGrp grp : groups) {
//                ids[i] = grp.getCgId().toString();
//                i++;
//            }
//            return StringHelper.toString(ids, ',');
//        }
        return "null";
    }

}
