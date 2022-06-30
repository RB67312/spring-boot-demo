package com.zensar.restClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.entity.Coupon;

@FeignClient("GATEWAY-SERVER")
public interface CouponRestClient {
	@GetMapping("/coupons/{couponCode}")
	Coupon getCoupon(@PathVariable("couponCode")String couponCode);
	@GetMapping("/coupons/getCoupons")
	List<Coupon> getAllCoupons();
}
