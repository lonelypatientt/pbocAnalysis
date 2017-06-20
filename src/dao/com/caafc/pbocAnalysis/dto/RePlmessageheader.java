/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午1:47:10
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 报告头描述.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlmessageheader {
	
	/**
	 * 查询请求时间
	 */
	private String querytime;
	/**
	 * 报告时间
	 */
	private String reportcreatetime;
	/**
	 * 报告编号
	 */
	private String reportsn;
	
	
	/**
	 * @return the querytime
	 */
	public String getQuerytime() {
		return querytime;
	}
	/**
	 * @param querytime the querytime to set
	 */
	public void setQuerytime(String querytime) {
		this.querytime = querytime;
	}
	/**
	 * @return the reportcreatetime
	 */
	public String getReportcreatetime() {
		return reportcreatetime;
	}
	/**
	 * @param reportcreatetime the reportcreatetime to set
	 */
	public void setReportcreatetime(String reportcreatetime) {
		this.reportcreatetime = reportcreatetime;
	}
	/**
	 * @return the reportsn
	 */
	public String getReportsn() {
		return reportsn;
	}
	/**
	 * @param reportsn the reportsn to set
	 */
	public void setReportsn(String reportsn) {
		this.reportsn = reportsn;
	}
	
	

}
