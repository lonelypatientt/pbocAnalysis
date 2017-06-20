package com.caafc.pbocAnalysis.entity;

// Generated 2016-11-15 16:17:32 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * FRePlspecialtrade generated by hbm2java
 */
public class FRePlspecialtrade implements java.io.Serializable {

	private FRePlspecialtradeId id;
	private String type;
	private String gettime;
	private Long changingmonths;
	private BigDecimal changingamount;
	private String content;

	public FRePlspecialtrade() {
	}

	public FRePlspecialtrade(FRePlspecialtradeId id) {
		this.id = id;
	}

	public FRePlspecialtrade(FRePlspecialtradeId id, String type,
			String gettime, Long changingmonths, BigDecimal changingamount,
			String content) {
		this.id = id;
		this.type = type;
		this.gettime = gettime;
		this.changingmonths = changingmonths;
		this.changingamount = changingamount;
		this.content = content;
	}

	public FRePlspecialtradeId getId() {
		return this.id;
	}

	public void setId(FRePlspecialtradeId id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGettime() {
		return this.gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}

	public Long getChangingmonths() {
		return this.changingmonths;
	}

	public void setChangingmonths(Long changingmonths) {
		this.changingmonths = changingmonths;
	}

	public BigDecimal getChangingamount() {
		return this.changingamount;
	}

	public void setChangingamount(BigDecimal changingamount) {
		this.changingamount = changingamount;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}