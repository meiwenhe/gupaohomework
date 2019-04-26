package com.mei.pattern.singleton.lazysingleton;

public class LazyCommonSingleton {
    private static LazyCommonSingleton  instance ;
    private LazyCommonSingleton(){

    }

    public static synchronized LazyCommonSingleton getInstance(){//加了synchronized  效率较低
        if(instance == null ){
            instance = new LazyCommonSingleton();
        }
        return instance;
    }
}
