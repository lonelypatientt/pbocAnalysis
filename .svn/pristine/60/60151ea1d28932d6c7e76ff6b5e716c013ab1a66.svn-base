/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午03:11:28
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

import com.caafc.pbocAnalysis.common.Constant;

/**
 * TODO 贷款的合同信息
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlcontractinfo {

	/**
	 * 贷款机构
	 */
	private String financeorg;
	
	/**
	 * 业务号
	 */
	private String account;
	
	/**
	 * 贷款种类细分
	 */
	private String type;
	
	/**
	 * 币种
	 */
	private String currency;
	
	/**
	 * 发放日期
	 */
	private String opendate;
	
	/**
	 * 到期日期
	 */
	private String enddate;
	
	/**
	 * 合同金额
	 */
	private BigDecimal creditlimitamount;
	
	/**
	 * 担保方式
	 */
	private String guaranteetype;
	
	/**
	 * 还款频率
	 */
	private String paymentrating;
	
	/**
	 * 还款期数
	 */
	private String paymentcyc;
	
	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 上级字段
	 */
	private String uplevel;
	
	/**
	 * 字段序号
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
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

	public String getPaymentrating() {
		return paymentrating;
	}

	public void setPaymentrating(String paymentrating) {
		this.paymentrating = paymentrating;
	}

	public String getPaymentcyc() {
		return paymentcyc;
	}

	public void setPaymentcyc(String paymentcyc) {
		this.paymentcyc = paymentcyc;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getUplevel() {
		return uplevel;
	}

	public void setUplevel(String uplevel) {
		this.uplevel = uplevel;
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
			return Constant.STATE_YUQI;
		}else if ("3".equals(state)){
			return Constant.STATE_JIEQING;
		}else if ("4".equals(state)){
			return Constant.STATE_DAIZHANG;
		}else if ("5".equals(state)){
			return Constant.STATE_ZHUANCHU;
		}else if ("6".equals(state)){
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
