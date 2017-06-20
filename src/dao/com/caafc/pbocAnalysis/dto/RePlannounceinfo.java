/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午3:17:34
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 本人声明.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlannounceinfo {
	
	/**
	 * 申明内容
	 */
	private String content;
	/**
	 * 添加日期
	 */
	private String gettime;
	/**
	 * 上级字段
	 */
	private String uplevel;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * 字段序号
	 */
	private Integer idenNo;
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the gettime
	 */
	public String getGettime() {
		return gettime;
	}
	/**
	 * @param gettime the gettime to set
	 */
	public void setGettime(String gettime) {
		this.gettime = gettime;
	}
	/**
	 * @return the uplevel
	 */
	public String getUplevel() {
		return uplevel;
	}
	/**
	 * @param uplevel the uplevel to set
	 */
	public void setUplevel(String uplevel) {
		this.uplevel = uplevel;
	}
	/**
	 * @return the reportNo
	 */
	public String getReportNo() {
		return reportNo;
	}
	/**
	 * @param reportNo the reportNo to set
	 */
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	/**
	 * @return the idenNo
	 */
	public Integer getIdenNo() {
		return idenNo;
	}
	/**
	 * @param idenNo the idenNo to set
	 */
	public void setIdenNo(Integer idenNo) {
		this.idenNo = idenNo;
	}

}
