package com.caafc.pbocAnalysis.util;

import java.util.List;

/**
 * 存放查询分页中的结果集和总页数 (2010-9-17 下午03:48:07) 
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class QueryResult<T> {
    
    /**
     * 结果集
     */
    private List<T> resultList;
    
    /**
     * 总页数
     */
    private long totalRecord;

    /**
     * 获取 resultList 属性值。
     * @return resultList 属性值
     */
    public List<T> getResultList() {
        return resultList;
    }

    /**
     * 设置 resultList 属性值。
     * @param resultList 为 resultList 属性赋的新值
     */
    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    /**
     * 获取 totalRecord 属性值。
     * @return totalRecord 属性值
     */
    public long getTotalRecord() {
        return totalRecord;
    }

    /**
     * 设置 totalRecord 属性值。
     * @param totalRecord 为 totalRecord 属性赋的新值
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }
    
    
}
