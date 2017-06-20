/*
 * Copyright (c) 2011 Technology Ltd.
 * All rights reserved.
 * project: nxcrm
 * create: 2011-1-18
 * cvs: $Id: StringHelper.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.util.List;
import java.util.Set;

/**
 * 字符串帮助类 (2011-1-18 下午01:45:25)
 * 
 * @author Zhaohb
 * @version $Revision: 1.1 $
 */
public class StringHelper {

    /**
     * 将String列表以指定的分隔符拼成字符串
     * 
     * @param data
     * @param reg
     * @return
     */
    public static String toString(List<String> data, char reg) {
        String _temp = "";
        if (data.size() > 0) {
            for (String str : data) {
                _temp += str + reg;
            }
            _temp = _temp.substring(0, _temp.length() - 1);
        }

        return _temp;
    }

    /**
     * 将String列表以指定的分隔符拼成字符串，并使用指定的字符包含
     * 
     * @param data
     * @param wrapChar
     * @param reg
     * @return
     */
    public static String toString(List<String> data, char wrapChar, char reg) {
        String _temp = "";
        if (data.size() > 0) {
            for (String str : data) {
                _temp += wrapChar + str + wrapChar + reg;
            }
            _temp = _temp.substring(0, _temp.length() - 1);
        }

        return _temp;
    }

    /**
     * 将String列表以指定的分隔符拼成字符串
     * 
     * @param data
     * @param reg
     * @return
     */
    public static String toString(Set<String> data, char reg) {
        String _temp = "";
        if (data.size() > 0) {
            for (String str : data) {
                _temp += str + reg;
            }
            _temp = _temp.substring(0, _temp.length() - 1);
        }
        return _temp;
    }

    /**
     * 将String数组以指定的分隔符拼成字符串
     * 
     * @param data
     * @param reg
     * @return
     */
    public static String toString(String[] data, char reg) {
        String _temp = "";
        if (data.length > 0) {
            for (String str : data) {
                _temp += str + reg;
            }
            _temp = _temp.substring(0, _temp.length() - 1);
        }

        return _temp;
    }

    /**
     * 检测字符串是否为空
     * 
     * @param str 要检测的字符串，忽略字符串中的空格。
     * @return 如果为空返回true，否则返回false。
     */
    public static boolean isNull(String str) {
        if (str == null || str.trim().length() <= 0)
            return true;
        else
            return false;
    }

    /**
     * 检测字符串是否为空
     * 
     * @param str
     *            要检测的字符串
     * @param ignore
     *            是否忽略字符串中的空格
     * @return
     */
    public static boolean isNull(String str, boolean ignore) {
        if (ignore) {
            return isNull(str);
        } else {
            if (str == null || str.length() <= 0)
                return true;
            else
                return false;
        }
    }

    /**
     * 检测字符串是否为空，忽略字符串中的空格
     * 
     * @param str
     *            要检测的字符串
     * @param checkStr
     *            进行比对的字符串
     * @return
     */
    public static boolean isNull(String str, String checkStr) {
        if (isNull(str))
            return false;
        else {
            if (str.equals(checkStr))
                return false;
            else
                return true;
        }
    }

    /**
     * 检测字符串是否为空
     * 
     * @param str
     *            要检测的字符串
     * @param checkStr
     *            进行比对的字符串
     * @param ignore
     *            是否忽略字符串中的空格
     * @return
     */
    public static boolean isNull(String str, String checkStr, boolean ignore) {
        if (isNull(str, ignore))
            return false;
        else {
            if (str.trim().equals(checkStr.trim()))
                return false;
            else
                return true;
        }
    }
}
