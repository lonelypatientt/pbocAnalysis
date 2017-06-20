/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:17:39
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 强制执行记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlforceexecution {

	/**
	 * 执行法院
	 */
	private String court;
	
	/**
	 * 执行案由
	 */
	private String casereason;
	
	/**
	 * 立案日期
	 */
	private String registerdate;
	
	/**
	 * 结案方式
	 */
	private String closedtype;
	
	/**
	 * 案件状态
	 */
	private String casestate;
	
	/**
	 * 结案日期
	 */
	private String closeddate;
	
	/**
	 * 申请执行标的
	 */
	private String enforceobject;
	
	/**
	 * 申请执行标的金额
	 */
	private BigDecimal enforceobjectmoney;
	
	/**
	 * 已执行标的
	 */
	private String alreadyenforceobject;
	
	/**
	 * 已执行标的金额
	 */
	private BigDecimal alreadyenforceobjectmoney;
	
	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号
	 */
	private long serialNo;

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getCasereason() {
		return casereason;
	}

	public void setCasereason(String casereason) {
		this.casereason = casereason;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getClosedtype() {
		return closedtype;
	}

	public void setClosedtype(String closedtype) {
		this.closedtype = closedtype;
	}

	public String getCasestate() {
		return casestate;
	}

	public void setCasestate(String casestate) {
		this.casestate = casestate;
	}

	public String getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(String closeddate) {
		this.closeddate = closeddate;
	}

	public String getEnforceobject() {
		return enforceobject;
	}

	public void setEnforceobject(String enforceobject) {
		this.enforceobject = enforceobject;
	}

	public BigDecimal getEnforceobjectmoney() {
		return enforceobjectmoney;
	}

	public void setEnforceobjectmoney(BigDecimal enforceobjectmoney) {
		this.enforceobjectmoney = enforceobjectmoney;
	}

	public String getAlreadyenforceobject() {
		return alreadyenforceobject;
	}

	public void setAlreadyenforceobject(String alreadyenforceobject) {
		this.alreadyenforceobject = alreadyenforceobject;
	}

	public BigDecimal getAlreadyenforceobjectmoney() {
		return alreadyenforceobjectmoney;
	}

	public void setAlreadyenforceobjectmoney(BigDecimal alreadyenforceobjectmoney) {
		this.alreadyenforceobjectmoney = alreadyenforceobjectmoney;
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
