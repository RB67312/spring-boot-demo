package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Transient
	private String couponCode;
	public String getCouponCode() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setPrice(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
