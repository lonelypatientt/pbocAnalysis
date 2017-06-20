/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午1:52:22
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 查询信息.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlqueryreq {
	
	/**
	 * 线程处理区分
	 */
	private String kind;
	/**
	 * 被查询者姓名
	 */
	private String name;
	/**
	 * 被查询者证件类型
	 */
	private String certtype;
	/**
	 * 被查询者证件号码
	 */
	private String certno;
	/**
	 * 查询原因
	 */
	private String queryreason;
	/**
	 * 签发机关
	 */
	private String queryorg;
	/**
	 * 查询操作员
	 */
	private String usercode;
	/**
	 * 核查结果
	 */
	private String queryresultcue;
	/**
	 * 报告编号
	 */
	private String reportNo;
	/**
	 * 查询请求参数
	 */
	private String queryformat;
	
	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the certtype
	 */
	public String getCerttype() {
		return certtype;
	}
	/**
	 * @param certtype the certtype to set
	 */
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}
	/**
	 * @return the certno
	 */
	public String getCertno() {
		return certno;
	}
	/**
	 * @param certno the certno to set
	 */
	public void setCertno(String certno) {
		this.certno = certno;
	}
	/**
	 * @return the queryreason
	 */
	public String getQueryreason() {
		return queryreason;
	}
	/**
	 * @param queryreason the queryreason to set
	 */
	public void setQueryreason(String queryreason) {
		this.queryreason = queryreason;
	}
	/**
	 * @return the queryorg
	 */
	public String getQueryorg() {
		return queryorg;
	}
	/**
	 * @param queryorg the queryorg to set
	 */
	public void setQueryorg(String queryorg) {
		this.queryorg = queryorg;
	}
	/**
	 * @return the usercode
	 */
	public String getUsercode() {
		return usercode;
	}
	/**
	 * @param usercode the usercode to set
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	/**
	 * @return the queryresultcue
	 */
	public String getQueryresultcue() {
		return queryresultcue;
	}
	/**
	 * @param queryresultcue the queryresultcue to set
	 */
	public void setQueryresultcue(String queryresultcue) {
		this.queryresultcue = queryresultcue;
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
	 * @return the queryformat
	 */
	public String getQueryformat() {
		return queryformat;
	}
	/**
	 * @param queryformat the queryformat to set
	 */
	public void setQueryformat(String queryformat) {
		this.queryformat = queryformat;
	}
	
	

}
