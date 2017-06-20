/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午03:05:08
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 查询记录汇总
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlrecordsummary {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号 
	 */
	private long serialNo;
	
	/**
	 * 查询原因
	 */
	private String queryreason;
	
	/**
	 * 数目
	 */
	private long sum;
	
	/**
	 * 记录编号
	 */
	private int recordNo;

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

	public String getQueryreason() {
		return queryreason;
	}

	public void setQueryreason(String queryreason) {
		this.queryreason = queryreason;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public int getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(int recordNo) {
		this.recordNo = recordNo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
