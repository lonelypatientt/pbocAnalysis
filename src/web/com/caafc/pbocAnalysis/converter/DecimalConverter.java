
package com.caafc.pbocAnalysis.converter;

import java.math.BigDecimal;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 角色类型转换 (2010-11-24 下午06:54:00) 
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class DecimalConverter extends StrutsTypeConverter {

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map,
     *      java.lang.Object)
     */
    @Override
    public String convertToString(Map arg0, Object arg1) {
        return null;
    }

    /**
     * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map, java.lang.String[], java.lang.Class)
     */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        BigDecimal value = new BigDecimal("0.00");
        if (values == null || values[0].length() <= 0)
            return value;
        else {
            Pattern p = Pattern.compile("^[0-9]+\\.[0-9]+$");
            int pos = values[0].indexOf(".");
            if (pos == -1) {
                values[0] += ".00";
            } else {
                if (p.matcher(values[0]).matches()) {
                    String s = values[0].substring(0, pos);
                    String e = values[0].substring(pos + 1).substring(0, 2);
                    if (e.length() < 2)
                        e += "0";
                    values[0] = s + "." + e;
                }
            }
            
            if (values[0].length() > 0 && p.matcher(values[0]).matches()) {
                value = new BigDecimal(values[0]);
            }
                
            return value;
        }
    }

}
