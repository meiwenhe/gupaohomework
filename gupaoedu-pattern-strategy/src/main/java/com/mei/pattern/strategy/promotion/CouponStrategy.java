package com.mei.pattern.strategy.promotion;

public class CouponStrategy implements IPromotionStrategy {
    public void promoton() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
