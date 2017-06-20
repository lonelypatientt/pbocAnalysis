/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:35:30
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 养老保险金缴存记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlendowmentinsurancedeposit {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 参保地
	 */
	private String area;
	
	/**
	 * 参保日期
	 */
	private String registerdate;
	
	/**
	 * 累计缴费月数
	 */
	private int monthduration;
	
	/**
	 * 参加工作月份
	 */
	private String workdate;
	
	/**
	 * 缴费状态
	 */
	private String state;
	
	/**
	 * 个人缴费基数
	 */
	private BigDecimal ownbasicmoney;
	
	/**
	 * 本月缴费金额
	 */
	private BigDecimal money;
	
	/**
	 * 缴费单位
	 */
	private String organname;
	
	/**
	 * 中断或终止缴费原因
	 */
	private String pausereason;
	
	/**
	 * 信息更新日期
	 */
	private String gettime;
	
	/**
	 * 报告序号
	 */
	private long serialNo;

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public int getMonthduration() {
		return monthduration;
	}

	public void setMonthduration(int monthduration) {
		this.monthduration = monthduration;
	}

	public String getWorkdate() {
		return workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getOwnbasicmoney() {
		return ownbasicmoney;
	}

	public void setOwnbasicmoney(BigDecimal ownbasicmoney) {
		this.ownbasicmoney = ownbasicmoney;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getOrganname() {
		return organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public String getPausereason() {
		return pausereason;
	}

	public void setPausereason(String pausereason) {
		this.pausereason = pausereason;
	}

	public String getGettime() {
		return gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
