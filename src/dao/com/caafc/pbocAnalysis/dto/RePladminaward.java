/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:51:35
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 行政奖励记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePladminaward {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号 
	 */
	private long serialNo;
	
	/**
	 * 奖励机构
	 */
	private String organname;
	
	/**
	 * 奖励内容
	 */
	private String content;
	
	/**
	 * 生效日期
	 */
	private String begindate;
	
	/**
	 * 截止日期
	 */
	private String enddate;

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}

	public String getOrganname() {
		return organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBegindate() {
		return begindate;
	}

	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
