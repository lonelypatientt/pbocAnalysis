/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午2:50:05
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 当前账户信息.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlcurraccountinfo {
	
	/**
	 * 状态截止日
	 */
	private String stateenddate;
	/**
	 * 状态截止月/转出月
	 */
	private String stateendmonth;
	/**
	 * 五级分类
	 */
	private String class5state;
	/**
	 * 本金余额
	 */
	private BigDecimal balance;
	/**
	 * 剩余还款期数
	 */
	private Integer remainpaymentcyc;
	/**
	 * 本月应还款
	 */
	private BigDecimal scheduledpaymentamount;
	/**
	 * 应还款日
	 */
	private String scheduledpaymentdate;
	/**
	 * 本月实还款
	 */
	private BigDecimal actualpaymentamount;
	/**
	 * 最近一次还款日期
	 */
	private String recentpaydate;
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
	 * 账户状态
	 */
	private String state;
	/**
	 * @return the stateenddate
	 */
	public String getStateenddate() {
		return stateenddate;
	}
	/**
	 * @param stateenddate the stateenddate to set
	 */
	public void setStateenddate(String stateenddate) {
		this.stateenddate = stateenddate;
	}
	/**
	 * @return the stateendmonth
	 */
	public String getStateendmonth() {
		return stateendmonth;
	}
	/**
	 * @param stateendmonth the stateendmonth to set
	 */
	public void setStateendmonth(String stateendmonth) {
		this.stateendmonth = stateendmonth;
	}
	/**
	 * @return the class5state
	 */
	public String getClass5state() {
		return class5state;
	}
	/**
	 * @param class5state the class5state to set
	 */
	public void setClass5state(String class5state) {
		this.class5state = class5state;
	}
	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * @return the remainpaymentcyc
	 */
	public Integer getRemainpaymentcyc() {
		return remainpaymentcyc;
	}
	/**
	 * @param remainpaymentcyc the remainpaymentcyc to set
	 */
	public void setRemainpaymentcyc(Integer remainpaymentcyc) {
		this.remainpaymentcyc = remainpaymentcyc;
	}
	/**
	 * @return the scheduledpaymentamount
	 */
	public BigDecimal getScheduledpaymentamount() {
		return scheduledpaymentamount;
	}
	/**
	 * @param scheduledpaymentamount the scheduledpaymentamount to set
	 */
	public void setScheduledpaymentamount(BigDecimal scheduledpaymentamount) {
		this.scheduledpaymentamount = scheduledpaymentamount;
	}
	/**
	 * @return the scheduledpaymentdate
	 */
	public String getScheduledpaymentdate() {
		return scheduledpaymentdate;
	}
	/**
	 * @param scheduledpaymentdate the scheduledpaymentdate to set
	 */
	public void setScheduledpaymentdate(String scheduledpaymentdate) {
		this.scheduledpaymentdate = scheduledpaymentdate;
	}
	/**
	 * @return the actualpaymentamount
	 */
	public BigDecimal getActualpaymentamount() {
		return actualpaymentamount;
	}
	/**
	 * @param actualpaymentamount the actualpaymentamount to set
	 */
	public void setActualpaymentamount(BigDecimal actualpaymentamount) {
		this.actualpaymentamount = actualpaymentamount;
	}
	/**
	 * @return the recentpaydate
	 */
	public String getRecentpaydate() {
		return recentpaydate;
	}
	/**
	 * @param recentpaydate the recentpaydate to set
	 */
	public void setRecentpaydate(String recentpaydate) {
		this.recentpaydate = recentpaydate;
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
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
