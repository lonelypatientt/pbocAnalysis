/*
 * Copyright (c) 2017 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2017年1月3日 下午1:58:04
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.vo;

import java.util.List;

import com.caafc.pbocAnalysis.dto.RePlcontractinfo;
import com.caafc.pbocAnalysis.dto.RePlcurraccountinfo;
import com.caafc.pbocAnalysis.dto.RePlcurroverdue;
import com.caafc.pbocAnalysis.dto.RePllatest24monthpaymentstate;
import com.caafc.pbocAnalysis.dto.RePloverduerecord;

/**
 * TODO 贷款所需信息vo类.
 * @author zdsp 
 * @version $Revision:$
 */
public class LoanDetailVo {
	/**
	 * 贷款状态
	 */
	private String state;
	
	/**
	 * 贷款合同信息
	 */
	private RePlcontractinfo contract;
	
	/**
	 * 贷款当前账户信息
	 */
	private RePlcurraccountinfo account;
	
	/**
	 * 五年逾期记录
	 */
	private List<RePloverduerecord> overdueList;
	
	/**
	 * 24个月还款状态
	 */
	private RePllatest24monthpaymentstate paymentstate;
	
	/**
	 * 当前逾期信息
	 */
	private List<RePlcurroverdue> curroverdueList;

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
	 * @return the contract
	 */
	public RePlcontractinfo getContract() {
		return contract;
	}

	/**
	 * @param contract the contract to set
	 */
	public void setContract(RePlcontractinfo contract) {
		this.contract = contract;
	}

	/**
	 * @return the account
	 */
	public RePlcurraccountinfo getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(RePlcurraccountinfo account) {
		this.account = account;
	}

	/**
	 * @return the overdueList
	 */
	public List<RePloverduerecord> getOverdueList() {
		return overdueList;
	}

	/**
	 * @param overdueList the overdueList to set
	 */
	public void setOverdueList(List<RePloverduerecord> overdueList) {
		this.overdueList = overdueList;
	}

	/**
	 * @return the paymentstate
	 */
	public RePllatest24monthpaymentstate getPaymentstate() {
		return paymentstate;
	}

	/**
	 * @param paymentstate the paymentstate to set
	 */
	public void setPaymentstate(RePllatest24monthpaymentstate paymentstate) {
		this.paymentstate = paymentstate;
	}

	/**
	 * @return the curroverdueList
	 */
	public List<RePlcurroverdue> getCurroverdueList() {
		return curroverdueList;
	}

	/**
	 * @param curroverdueList the curroverdueList to set
	 */
	public void setCurroverdueList(List<RePlcurroverdue> curroverdueList) {
		this.curroverdueList = curroverdueList;
	}
	

}
