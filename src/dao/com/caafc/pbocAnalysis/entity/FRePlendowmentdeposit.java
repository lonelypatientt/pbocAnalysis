package com.caafc.pbocAnalysis.entity;

// Generated 2016-11-15 16:17:32 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * FRePlendowmentdeposit generated by hbm2java
 */
public class FRePlendowmentdeposit implements java.io.Serializable {

	private FRePlendowmentdepositId id;
	private String area;
	private String registerdate;
	private Short monthduration;
	private String workdate;
	private String state;
	private BigDecimal ownbasicmoney;
	private BigDecimal money;
	private String organname;
	private String pausereason;
	private String gettime;

	public FRePlendowmentdeposit() {
	}

	public FRePlendowmentdeposit(FRePlendowmentdepositId id) {
		this.id = id;
	}

	public FRePlendowmentdeposit(FRePlendowmentdepositId id, String area,
			String registerdate, Short monthduration, String workdate,
			String state, BigDecimal ownbasicmoney, BigDecimal money,
			String organname, String pausereason, String gettime) {
		this.id = id;
		this.area = area;
		this.registerdate = registerdate;
		this.monthduration = monthduration;
		this.workdate = workdate;
		this.state = state;
		this.ownbasicmoney = ownbasicmoney;
		this.money = money;
		this.organname = organname;
		this.pausereason = pausereason;
		this.gettime = gettime;
	}

	public FRePlendowmentdepositId getId() {
		return this.id;
	}

	public void setId(FRePlendowmentdepositId id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegisterdate() {
		return this.registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public Short getMonthduration() {
		return this.monthduration;
	}

	public void setMonthduration(Short monthduration) {
		this.monthduration = monthduration;
	}

	public String getWorkdate() {
		return this.workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getOwnbasicmoney() {
		return this.ownbasicmoney;
	}

	public void setOwnbasicmoney(BigDecimal ownbasicmoney) {
		this.ownbasicmoney = ownbasicmoney;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getOrganname() {
		return this.organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public String getPausereason() {
		return this.pausereason;
	}

	public void setPausereason(String pausereason) {
		this.pausereason = pausereason;
	}

	public String getGettime() {
		return this.gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}

}