package com.mei.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final String CASH_BACK = "cashback";
    private static final String COUPON = "coupon";
    private static final String GROUPBUY = "groupbug";
    private static final String DEFAULT = "cashback";
    static  Map<String,IPromotionStrategy>  register = new HashMap<String, IPromotionStrategy>();
    static {
        register.put(CASH_BACK,new CashbackStrategy());
        register.put(COUPON,new CouponStrategy());
        register.put(GROUPBUY,new GroupbuyStrategy());
    }
    public static IPromotionStrategy getStrategr(String strategy){
       return  register.get(strategy)==null?register.get(DEFAULT):register.get(strategy);
    }

}
