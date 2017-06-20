/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午3:24:48
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 使用/还款情况.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlrepayinfo {
	
	/**
	 * 状态截止日
	 */
	private String stateenddate;
	/**
	 * 状态截止月
	 */
	private String stateendmonth;
	/**
	 * 共享额度
	 */
	private BigDecimal sharecreditlimitamount;
	/**
	 * 已用额度/透支额度
	 */
	private BigDecimal usedcreditlimitamount;
	/**
	 * 最近6个月平均使用额度/最近6个月平均透支余额
	 */
	private BigDecimal latest6monthusedavgamount;
	/**
	 * 最大使用额度/最大透支余额
	 */
	private BigDecimal usedhighestamount;
	/**
	 * 账单日
	 */
	private String scheduledpaymentdate;
	/**
	 * 本月应还款
	 */
	private BigDecimal scheduledpaymentamount;
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
	 * 当前逾期期数
	 */
	private Integer curroverduecyc;
	/**
	 * 当前逾期金额
	 */
	private BigDecimal curroverdueamount;
	/**
	 * 透支180天以上未付余额
	 */
	private BigDecimal overdraft180dayunpaidbalance;
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
	 * @return the sharecreditlimitamount
	 */
	public BigDecimal getSharecreditlimitamount() {
		return sharecreditlimitamount;
	}
	/**
	 * @param sharecreditlimitamount the sharecreditlimitamount to set
	 */
	public void setSharecreditlimitamount(BigDecimal sharecreditlimitamount) {
		this.sharecreditlimitamount = sharecreditlimitamount;
	}
	/**
	 * @return the usedcreditlimitamount
	 */
	public BigDecimal getUsedcreditlimitamount() {
		return usedcreditlimitamount;
	}
	/**
	 * @param usedcreditlimitamount the usedcreditlimitamount to set
	 */
	public void setUsedcreditlimitamount(BigDecimal usedcreditlimitamount) {
		this.usedcreditlimitamount = usedcreditlimitamount;
	}
	/**
	 * @return the latest6monthusedavgamount
	 */
	public BigDecimal getLatest6monthusedavgamount() {
		return latest6monthusedavgamount;
	}
	/**
	 * @param latest6monthusedavgamount the latest6monthusedavgamount to set
	 */
	public void setLatest6monthusedavgamount(BigDecimal latest6monthusedavgamount) {
		this.latest6monthusedavgamount = latest6monthusedavgamount;
	}
	/**
	 * @return the usedhighestamount
	 */
	public BigDecimal getUsedhighestamount() {
		return usedhighestamount;
	}
	/**
	 * @param usedhighestamount the usedhighestamount to set
	 */
	public void setUsedhighestamount(BigDecimal usedhighestamount) {
		this.usedhighestamount = usedhighestamount;
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
	/**
	 * @return the curroverduecyc
	 */
	public Integer getCurroverduecyc() {
		return curroverduecyc;
	}
	/**
	 * @param curroverduecyc the curroverduecyc to set
	 */
	public void setCurroverduecyc(Integer curroverduecyc) {
		this.curroverduecyc = curroverduecyc;
	}
	/**
	 * @return the curroverdueamount
	 */
	public BigDecimal getCurroverdueamount() {
		return curroverdueamount;
	}
	/**
	 * @param curroverdueamount the curroverdueamount to set
	 */
	public void setCurroverdueamount(BigDecimal curroverdueamount) {
		this.curroverdueamount = curroverdueamount;
	}
	/**
	 * @return the overdraft180dayunpaidbalance
	 */
	public BigDecimal getOverdraft180dayunpaidbalance() {
		return overdraft180dayunpaidbalance;
	}
	/**
	 * @param overdraft180dayunpaidbalance the overdraft180dayunpaidbalance to set
	 */
	public void setOverdraft180dayunpaidbalance(BigDecimal overdraft180dayunpaidbalance) {
		this.overdraft180dayunpaidbalance = overdraft180dayunpaidbalance;
	}

}
