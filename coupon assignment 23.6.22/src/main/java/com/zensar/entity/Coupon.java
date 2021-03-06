package com.zensar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = { @NamedQuery(name = "Coupon.com", query = "from Coupon c where c.couponCode=?1"),
		@NamedQuery(name = "Coupon.com1", query = "from Coupon c where c.couponCode=?1 and c.couponId=?2") })
//@NamedQuery(name="Coupon.com" ,query="from Coupon c where c.couponCode=?1")
//@NamedQuery(name="Coupon.com1",query="from Coupon c where c.couponCode=?1 and c.couponId=?2")
@NamedNativeQuery(name = "Coupon.com2", query = "select * from Coupon c where c.coupon_code=?1 and c.coupon_id=?2 ", resultClass = Coupon.class)
public class Coupon {
	@Id
	private int couponId;
	private String couponCode;
	private String expDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String expDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.expDate = expDate;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", expDate=" + expDate + "]";
	}
}