package com.mei.pattern.singleton.register;

public enum  EnumSingleton {
    INSTANCE, get;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
