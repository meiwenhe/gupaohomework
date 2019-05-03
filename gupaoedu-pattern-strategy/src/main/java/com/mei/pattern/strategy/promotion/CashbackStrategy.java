package com.mei.pattern.strategy.promotion;

public class CashbackStrategy implements IPromotionStrategy{
    public void promoton() {
        System.out.println("恭喜你参加返现活动");
    }
}
