package com.coumin.woowahancoupons.coupon.service;

import java.util.UUID;

public interface CouponRedemptionService {
    void allocateCouponToCustomer(UUID couponId, Long customerId);
}