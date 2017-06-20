/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午01:54:11
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 欠税记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePltaxarrear {

	/**
	 * 主管税务机关
	 */
	private String organname;
	
	/**
	 * 欠税总额
	 */
	private BigDecimal taxarreaamount;
	
	/**
	 * 欠税统计日
	 */
	private String revenuedate;
	
	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号
	 */
	private long serialNo;
	

	public String getOrganname() {
		return organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public BigDecimal getTaxarreaamount() {
		return taxarreaamount;
	}

	public void setTaxarreaamount(BigDecimal taxarreaamount) {
		this.taxarreaamount = taxarreaamount;
	}

	public String getRevenuedate() {
		return revenuedate;
	}

	public void setRevenuedate(String revenuedate) {
		this.revenuedate = revenuedate;
	}

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

	
	
	
}
