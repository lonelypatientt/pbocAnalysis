/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午2:26:48
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

import java.math.BigDecimal;

/**
 * TODO 未销户准贷记卡信息汇总.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlundestorystandardloa {
	
	/**
	 * 账户数
	 */
	private Integer accountcount;
	/**
	 * 发卡法人机构数
	 */
	private Integer financecorpcount;
	/**
	 * 发卡机构数
	 */
	private Integer financeorgcount;
	/**
	 * 授信总额
	 */
	private BigDecimal creditlimit;
	/**
	 * 单家行最高授信额
	 */
	private BigDecimal maxcreditlimitperorg;
	/**
	 * 单家行最低授信额
	 */
	private BigDecimal mincreditlimitperorg;
	/**
	 * 已用额度
	 */
	private BigDecimal usedcreditlimit ;
	/**
	 * 最近6个月平均透支余额
	 */
	private BigDecimal latest6monthusedavgamount;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * @return the accountcount
	 */
	public Integer getAccountcount() {
		return accountcount;
	}
	/**
	 * @param accountcount the accountcount to set
	 */
	public void setAccountcount(Integer accountcount) {
		this.accountcount = accountcount;
	}
	/**
	 * @return the financecorpcount
	 */
	public Integer getFinancecorpcount() {
		return financecorpcount;
	}
	/**
	 * @param financecorpcount the financecorpcount to set
	 */
	public void setFinancecorpcount(Integer financecorpcount) {
		this.financecorpcount = financecorpcount;
	}
	/**
	 * @return the financeorgcount
	 */
	public Integer getFinanceorgcount() {
		return financeorgcount;
	}
	/**
	 * @param financeorgcount the financeorgcount to set
	 */
	public void setFinanceorgcount(Integer financeorgcount) {
		this.financeorgcount = financeorgcount;
	}
	/**
	 * @return the creditlimit
	 */
	public BigDecimal getCreditlimit() {
		return creditlimit;
	}
	/**
	 * @param creditlimit the creditlimit to set
	 */
	public void setCreditlimit(BigDecimal creditlimit) {
		this.creditlimit = creditlimit;
	}
	/**
	 * @return the maxcreditlimitperorg
	 */
	public BigDecimal getMaxcreditlimitperorg() {
		return maxcreditlimitperorg;
	}
	/**
	 * @param maxcreditlimitperorg the maxcreditlimitperorg to set
	 */
	public void setMaxcreditlimitperorg(BigDecimal maxcreditlimitperorg) {
		this.maxcreditlimitperorg = maxcreditlimitperorg;
	}
	/**
	 * @return the mincreditlimitperorg
	 */
	public BigDecimal getMincreditlimitperorg() {
		return mincreditlimitperorg;
	}
	/**
	 * @param mincreditlimitperorg the mincreditlimitperorg to set
	 */
	public void setMincreditlimitperorg(BigDecimal mincreditlimitperorg) {
		this.mincreditlimitperorg = mincreditlimitperorg;
	}
	/**
	 * @return the usedcreditlimit
	 */
	public BigDecimal getUsedcreditlimit() {
		return usedcreditlimit;
	}
	/**
	 * @param usedcreditlimit the usedcreditlimit to set
	 */
	public void setUsedcreditlimit(BigDecimal usedcreditlimit) {
		this.usedcreditlimit = usedcreditlimit;
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

}
