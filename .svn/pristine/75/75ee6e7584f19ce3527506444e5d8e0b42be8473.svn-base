/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午03:16:50
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

import com.caafc.pbocAnalysis.common.Constant;

/**
 * TODO 信用卡授信情况
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlawardcreditinfo {

	/**
	 * 发卡机构
	 */
	private String financeorg;
	
	/**
	 * 业务号
	 */
	private String account;
	
	/**
	 * 币种
	 */
	private String currency;
	
	/**
	 * 发卡日期
	 */
	private String opendate;
	
	/**
	 * 授信金额
	 */
	private BigDecimal creditlimitamount;
	
	/**
	 * 担保方式
	 */
	private String guaranteetype;
	
	/**
	 * 上级字段
	 */
	private String uplevel;
	
	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号
	 */
	private Integer idenNo;
	
	/**
	 * 状态
	 */
	private String state;
	
	/**
	 * 余额
	 */
	private BigDecimal balance;
	
	/**
	 * 状态截止日
	 */
	private String stateENDdate;

	public String getFinanceorg() {
		return financeorg;
	}

	public void setFinanceorg(String financeorg) {
		this.financeorg = financeorg;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	public BigDecimal getCreditlimitamount() {
		return creditlimitamount;
	}

	public void setCreditlimitamount(BigDecimal creditlimitamount) {
		this.creditlimitamount = creditlimitamount;
	}

	public String getGuaranteetype() {
		return guaranteetype;
	}

	public void setGuaranteetype(String guaranteetype) {
		this.guaranteetype = guaranteetype;
	}

	public String getUplevel() {
		return uplevel;
	}

	public void setUplevel(String uplevel) {
		this.uplevel = uplevel;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public Integer getIdenNo() {
		return idenNo;
	}

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
	 * 状态值处理
	 * @return
	 */
	public String getStateStr() {
		if("1".equals(state)){
			return Constant.STATE_ZHENGCHANG;
		}else if ("2".equals(state)){
			return Constant.STATE_DONGJIE;
		}else if ("3".equals(state)){
			return Constant.STATE_ZHIFU;
		}else if ("4".equals(state)){
			return Constant.STATE_XIAOHU;
		}else if ("5".equals(state)){
			return Constant.STATE_DAIZHANG;
		}else if ("6".equals(state)){
			return Constant.STATE_WEIJIHUO;
		}else if ("7".equals(state)){
			return Constant.STATE_ZHUANCHU;
		}else if ("8".equals(state)){
			return Constant.STATE_HEXIAO;
		}
		return "";
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
	 * @return the stateENDdate
	 */
	public String getStateENDdate() {
		return stateENDdate;
	}

	/**
	 * @param stateENDdate the stateENDdate to set
	 */
	public void setStateENDdate(String stateENDdate) {
		this.stateENDdate = stateENDdate;
	}
	
	
}
