/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午2:06:12
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 居住信息.
 * @author zdsp 
 * @version $Revision:$
 */
public class RePlresidence {
	
	/**
	 * 居住地址
	 */
	private String address;
	/**
	 * 居住状况
	 */
	private String residencetype;
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
	private Integer serialNo;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the residencetype
	 */
	public String getResidencetype() {
		return residencetype;
	}
	/**
	 * @param residencetype the residencetype to set
	 */
	public void setResidencetype(String residencetype) {
		this.residencetype = residencetype;
	}
	/**
	 * @return the gettime
	 */
	public String getGettime() {
		return gettime;
	}
	/**
	 * @param gettime the gettime to set
	 */
	public void setGettime(String gettime) {
		this.gettime = gettime;
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
	public Integer getSerialNo() {
		return serialNo;
	}
	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	

}
