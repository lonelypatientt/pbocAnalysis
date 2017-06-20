/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午3:11:40
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 逾期/透支记录信息描述.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePloverduerecord {
	
	/**
	 * 月份
	 */
	private String month;
	/**
	 * 持续月份
	 */
	private Integer lastmonths;
	/**
	 * 金额
	 */
	private BigDecimal amount;
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
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the lastmonths
	 */
	public Integer getLastmonths() {
		return lastmonths;
	}
	/**
	 * @param lastmonths the lastmonths to set
	 */
	public void setLastmonths(Integer lastmonths) {
		this.lastmonths = lastmonths;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
