/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午3:31:13
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 担保信息.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlguarantee {
	
	/**
	 * 担保贷款发放机构
	 */
	private String organname;
	/**
	 * 担保贷款合同金额
	 */
	private BigDecimal contractmoney;
	/**
	 * 担保贷款发放日期
	 */
	private String begindate;
	/**
	 * 担保贷款到期日期
	 */
	private String enddate;
	/**
	 * 担保金额
	 */
	private BigDecimal guananteemoney;
	/**
	 * 担保贷款本金余额
	 */
	private BigDecimal guaranteebalance ;
	/**
	 * 担保贷款五级分类
	 */
	private String class5state;
	/**
	 * 结算日期
	 */
	private String billingdate;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * 报告序号
	 */
	private String serialNo;
	/**
	 * @return the organname
	 */
	public String getOrganname() {
		return organname;
	}
	/**
	 * @param organname the organname to set
	 */
	public void setOrganname(String organname) {
		this.organname = organname;
	}
	/**
	 * @return the contractmoney
	 */
	public BigDecimal getContractmoney() {
		return contractmoney;
	}
	/**
	 * @param contractmoney the contractmoney to set
	 */
	public void setContractmoney(BigDecimal contractmoney) {
		this.contractmoney = contractmoney;
	}
	/**
	 * @return the begindate
	 */
	public String getBegindate() {
		return begindate;
	}
	/**
	 * @param begindate the begindate to set
	 */
	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}
	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	/**
	 * @return the guananteemoney
	 */
	public BigDecimal getGuananteemoney() {
		return guananteemoney;
	}
	/**
	 * @param guananteemoney the guananteemoney to set
	 */
	public void setGuananteemoney(BigDecimal guananteemoney) {
		this.guananteemoney = guananteemoney;
	}
	/**
	 * @return the guaranteebalance
	 */
	public BigDecimal getGuaranteebalance() {
		return guaranteebalance;
	}
	/**
	 * @param guaranteebalance the guaranteebalance to set
	 */
	public void setGuaranteebalance(BigDecimal guaranteebalance) {
		this.guaranteebalance = guaranteebalance;
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
	 * @return the billingdate
	 */
	public String getBillingdate() {
		return billingdate;
	}
	/**
	 * @param billingdate the billingdate to set
	 */
	public void setBillingdate(String billingdate) {
		this.billingdate = billingdate;
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
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}
	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
