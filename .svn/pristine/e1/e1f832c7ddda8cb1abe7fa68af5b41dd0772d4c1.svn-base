/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-22 下午03:08:43
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dto;

/**
 * TODO 信贷审批查询记录明细
 * @author Administrator 
 * @version $Revision:$
 */
public class RePlrecorddetail {

	/**
	 * 报告编号
	 */
	private String reportNo;
	
	/**
	 * 报告序号 
	 */
	private long serialNo;
	
	/**
	 * 查询日期
	 */
	private String querydate;
	
	/**
	 * 查询操作员
	 */
	private String querier;
	
	/**
	 * 查询原因
	 */
	private String queryreason;
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RePlrecorddetail other = (RePlrecorddetail) obj;
		if (querier == null) {
			if (other.querier != null)
				return false;
		} else if (!querier.equals(other.querier))
			return false;
		if (querydate == null) {
			if (other.querydate != null)
				return false;
		}
		if (queryreason == null) {
			if (other.queryreason != null)
				return false;
		} else if (!queryreason.equals(other.queryreason))
			return false;
		
		//处理时间
		String querydateStr = querydate.substring(0,7);
		String otherquerydateStr = other.getQuerydate().substring(0,7);
		if(!querydateStr.equals(otherquerydateStr)){
			return false;
		}
		
		return true;
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

	public String getQuerydate() {
		return querydate;
	}

	public void setQuerydate(String querydate) {
		this.querydate = querydate;
	}

	public String getQuerier() {
		return querier;
	}

	public void setQuerier(String querier) {
		this.querier = querier;
	}

	public String getQueryreason() {
		return queryreason;
	}

	public void setQueryreason(String queryreason) {
		this.queryreason = queryreason;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
