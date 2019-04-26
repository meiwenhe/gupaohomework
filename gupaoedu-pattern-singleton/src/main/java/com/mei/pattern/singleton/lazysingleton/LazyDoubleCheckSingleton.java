package com.mei.pattern.singleton.lazysingleton;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton INSTANCE = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }

        }
        return INSTANCE;
    }
}
