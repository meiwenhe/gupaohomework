package com.mei.pattern.strategy.promotion;

public class StrategyTest {
    public static void main(String[] args){
        //这个值一般由调用层决定，比如前端按钮传入的值，或者数据库配置的值
        String promotionStrategy = "cashback";
        IPromotionStrategy strategy = StrategyFactory.getStrategr(promotionStrategy);
        strategy.promoton();
        promotionStrategy = "coupon";
        strategy = StrategyFactory.getStrategr(promotionStrategy);
        strategy.promoton();
        promotionStrategy = "groupbug";
        strategy = StrategyFactory.getStrategr(promotionStrategy);
        strategy.promoton();
        promotionStrategy = "test";
        strategy = StrategyFactory.getStrategr(promotionStrategy);
        strategy.promoton();
    }
}
