/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:58:06
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 电信缴费记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePltelpayment {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号 
	 */
	private long serialNo;
	
	/**
	 * 电信运营商
	 */
	private String organname;
	
	/**
	 * 业务类型
	 */
	private String type;
	
	/**
	 * 业务开通日期
	 */
	private String registerdate;
	
	/**
	 * 当前缴费状态
	 */
	private String state;
	
	/**
	 * 当前欠费金额
	 */
	private BigDecimal arrearmoney;
	
	/**
	 * 当前欠费月数
	 */
	private String arrearmonths;
	
	/**
	 * 最近24个月缴费状态
	 */
	private String status24;
	
	/**
	 * 记帐年月
	 */
	private String gettime;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getArrearmoney() {
		return arrearmoney;
	}

	public void setArrearmoney(BigDecimal arrearmoney) {
		this.arrearmoney = arrearmoney;
	}

	public String getArrearmonths() {
		return arrearmonths;
	}

	public void setArrearmonths(String arrearmonths) {
		this.arrearmonths = arrearmonths;
	}

	public String getStatus24() {
		return status24;
	}

	public void setStatus24(String status24) {
		this.status24 = status24;
	}

	public String getGettime() {
		return gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
