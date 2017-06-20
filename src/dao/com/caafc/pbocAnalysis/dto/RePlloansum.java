/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午2:20:57
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 贷款逾期.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlloansum {
	
	/**
	 * 笔数
	 */
	private Integer count;
	/**
	 * 月份数
	 */
	private Integer months;
	/**
	 * 单月最高逾期总额
	 */
	private BigDecimal highestoverdueamountpermon;
	/**
	 * 最长逾期月数
	 */
	private Integer maxduration;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	/**
	 * @return the months
	 */
	public Integer getMonths() {
		return months;
	}
	/**
	 * @param months the months to set
	 */
	public void setMonths(Integer months) {
		this.months = months;
	}
	/**
	 * @return the highestoverdueamountpermon
	 */
	public BigDecimal getHighestoverdueamountpermon() {
		return highestoverdueamountpermon;
	}
	/**
	 * @param highestoverdueamountpermon the highestoverdueamountpermon to set
	 */
	public void setHighestoverdueamountpermon(BigDecimal highestoverdueamountpermon) {
		this.highestoverdueamountpermon = highestoverdueamountpermon;
	}
	/**
	 * @return the maxduration
	 */
	public Integer getMaxduration() {
		return maxduration;
	}
	/**
	 * @param maxduration the maxduration to set
	 */
	public void setMaxduration(Integer maxduration) {
		this.maxduration = maxduration;
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
	
	

}
