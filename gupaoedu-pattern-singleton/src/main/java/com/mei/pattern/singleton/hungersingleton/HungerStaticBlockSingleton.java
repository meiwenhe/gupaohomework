package com.mei.pattern.singleton.hungersingleton;

public class HungerStaticBlockSingleton {
    private static final HungerStaticBlockSingleton INSTANCE;
    static {
        INSTANCE = new HungerStaticBlockSingleton();
    }
    private HungerStaticBlockSingleton(){
        if(INSTANCE!=null){
            throw  new RuntimeException("单例，不允许使用反射创建实例");
        }
    }
    public static  HungerStaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}
