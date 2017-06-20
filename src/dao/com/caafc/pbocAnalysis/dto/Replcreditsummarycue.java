/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午2:11:47
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 信用汇总提示.
 * @author zdsp 
 * @version $Revision:$
 */
public class Replcreditsummarycue {
	
	/**
	 * 个人住房贷款笔数
	 */
	private Integer houseloancount;
	/**
	 * 其他贷款笔数
	 */
	private Integer otherloancount;
	/**
	 * 首笔贷款发放月份
	 */
	private String firstloanopenmonth;
	/**
	 * 贷记卡账户数
	 */
	private Integer loancardcount;
	/**
	 * 首张贷记卡发卡月份
	 */
	private String firstloancardopenmonth;
	/**
	 * 准贷记卡账户数
	 */
	private Integer standardloancardcount;
	/**
	 * 首张准贷记卡发卡月份
	 */
	private String firststandardloancardopenmonth;
	/**
	 * 本人声明数目
	 */
	private Integer announcecount;
	/**
	 * 异议标注数目
	 */
	private Integer dissentcount;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * 个人商用房（包括商住两用）贷款笔数
	 */
	private Integer perbusinesshouseloancount ;
	/**
	 * @return the houseloancount
	 */
	public Integer getHouseloancount() {
		return houseloancount;
	}
	/**
	 * @param houseloancount the houseloancount to set
	 */
	public void setHouseloancount(Integer houseloancount) {
		this.houseloancount = houseloancount;
	}
	/**
	 * @return the otherloancount
	 */
	public Integer getOtherloancount() {
		return otherloancount;
	}
	/**
	 * @param otherloancount the otherloancount to set
	 */
	public void setOtherloancount(Integer otherloancount) {
		this.otherloancount = otherloancount;
	}
	/**
	 * @return the firstloanopenmonth
	 */
	public String getFirstloanopenmonth() {
		return firstloanopenmonth;
	}
	/**
	 * @param firstloanopenmonth the firstloanopenmonth to set
	 */
	public void setFirstloanopenmonth(String firstloanopenmonth) {
		this.firstloanopenmonth = firstloanopenmonth;
	}
	/**
	 * @return the loancardcount
	 */
	public Integer getLoancardcount() {
		return loancardcount;
	}
	/**
	 * @param loancardcount the loancardcount to set
	 */
	public void setLoancardcount(Integer loancardcount) {
		this.loancardcount = loancardcount;
	}
	/**
	 * @return the firstloancardopenmonth
	 */
	public String getFirstloancardopenmonth() {
		return firstloancardopenmonth;
	}
	/**
	 * @param firstloancardopenmonth the firstloancardopenmonth to set
	 */
	public void setFirstloancardopenmonth(String firstloancardopenmonth) {
		this.firstloancardopenmonth = firstloancardopenmonth;
	}
	/**
	 * @return the standardloancardcount
	 */
	public Integer getStandardloancardcount() {
		return standardloancardcount;
	}
	/**
	 * @param standardloancardcount the standardloancardcount to set
	 */
	public void setStandardloancardcount(Integer standardloancardcount) {
		this.standardloancardcount = standardloancardcount;
	}
	/**
	 * @return the firststandardloancardopenmonth
	 */
	public String getFirststandardloancardopenmonth() {
		return firststandardloancardopenmonth;
	}
	/**
	 * @param firststandardloancardopenmonth the firststandardloancardopenmonth to set
	 */
	public void setFirststandardloancardopenmonth(String firststandardloancardopenmonth) {
		this.firststandardloancardopenmonth = firststandardloancardopenmonth;
	}
	/**
	 * @return the announcecount
	 */
	public Integer getAnnouncecount() {
		return announcecount;
	}
	/**
	 * @param announcecount the announcecount to set
	 */
	public void setAnnouncecount(Integer announcecount) {
		this.announcecount = announcecount;
	}
	/**
	 * @return the dissentcount
	 */
	public Integer getDissentcount() {
		return dissentcount;
	}
	/**
	 * @param dissentcount the dissentcount to set
	 */
	public void setDissentcount(Integer dissentcount) {
		this.dissentcount = dissentcount;
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
	 * @return the perbusinesshouseloancount
	 */
	public Integer getPerbusinesshouseloancount() {
		return perbusinesshouseloancount;
	}
	/**
	 * @param perbusinesshouseloancount the perbusinesshouseloancount to set
	 */
	public void setPerbusinesshouseloancount(Integer perbusinesshouseloancount) {
		this.perbusinesshouseloancount = perbusinesshouseloancount;
	}

}
