/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午02:54:10
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 车辆交易和抵押记录
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlvehicle {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号 
	 */
	private long serialNo;
	
	/**
	 * 发动机号
	 */
	private String enginecode;
	
	/**
	 * 车牌号码
	 */
	private String licensecode;
	
	/**
	 * 品牌
	 */
	private String brand;
	
	/**
	 * 车辆类型
	 */
	private String cartype;
	
	/**
	 * 使用性质
	 */
	private String usecharacter;
	
	/**
	 * 车辆状态
	 */
	private String state;
	
	/**
	 * 抵押标记
	 */
	private String pledgeflag;
	
	/**
	 * 信息更新日期
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

	public String getEnginecode() {
		return enginecode;
	}

	public void setEnginecode(String enginecode) {
		this.enginecode = enginecode;
	}

	public String getLicensecode() {
		return licensecode;
	}

	public void setLicensecode(String licensecode) {
		this.licensecode = licensecode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getUsecharacter() {
		return usecharacter;
	}

	public void setUsecharacter(String usecharacter) {
		this.usecharacter = usecharacter;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPledgeflag() {
		return pledgeflag;
	}

	public void setPledgeflag(String pledgeflag) {
		this.pledgeflag = pledgeflag;
	}

	public String getGettime() {
		return gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
