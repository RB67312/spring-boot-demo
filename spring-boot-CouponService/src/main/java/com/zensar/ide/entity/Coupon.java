package com.zensar.ide.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
	@Id
	private int couponId;
	private String couponCode;
	private String expDate;
	private int couponPrice;
	private int discount;
	private String couponDesc;
	public Integer getCouponId() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
