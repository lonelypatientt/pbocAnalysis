/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:30:10
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 住房公积金参缴记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlaccfund {

	/**
	 * 参缴地
	 */
	private String area;
	
	/**
	 * 参缴日期
	 */
	private String registerdate;
	
	/**
	 * 初缴月份
	 */
	private String firstmonth;
	
	/**
	 * 缴至月份
	 */
	private String tomonth;
	
	/**
	 * 缴费状态
	 */
	private String state;
	
	/**
	 * 月缴存额
	 */
	private BigDecimal pay;
	
	/**
	 * 个人缴存比例
	 */
	private String ownpercent;
	
	/**
	 * 单位存缴比例
	 */
	private String compercent;
	
	/**
	 * 缴费单位
	 */
	private String organname;
	
	/**
	 * 信息更新日期
	 */
	private String gettime;
	
	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号
	 */
	private long serialNo;

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

	public String getFirstmonth() {
		return firstmonth;
	}

	public void setFirstmonth(String firstmonth) {
		this.firstmonth = firstmonth;
	}

	public String getTomonth() {
		return tomonth;
	}

	public void setTomonth(String tomonth) {
		this.tomonth = tomonth;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getPay() {
		return pay;
	}

	public void setPay(BigDecimal pay) {
		this.pay = pay;
	}

	public String getOwnpercent() {
		return ownpercent;
	}

	public void setOwnpercent(String ownpercent) {
		this.ownpercent = ownpercent;
	}

	public String getCompercent() {
		return compercent;
	}

	public void setCompercent(String compercent) {
		this.compercent = compercent;
	}

	public String getOrganname() {
		return organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public String getGettime() {
		return gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
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
