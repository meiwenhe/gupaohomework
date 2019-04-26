package com.mei.pattern.singleton.hungersingleton;

public class HungerSingleton {
    private static final HungerSingleton INSTANCE = new HungerSingleton();
    private HungerSingleton(){
       /* synchronized(INSTANCE){//构造函数不允许使用synchronized关键字，但是构造函数不是线程安全的，因此可以通过这种方式保证线程安全，
                                    // 但是其实可以认为没有必要，因为只要不是初始化INSTANCE的时候，同时有人使用反射创建实例，这个其实就是线程安全的
            if(INSTANCE!=null){
                throw new RuntimeException("单例，不允许使用构造方法创建实例");
            }
        }*/
        if(INSTANCE!=null){//没有必要加锁判断，因为使用反射创建实例前，类一定加载完成，则INSTANCE一定已经实例化好了
            throw new RuntimeException("单例，不允许使用构造方法创建实例");
        }

    }
    public static HungerSingleton getInstance(){
        return INSTANCE;
    }
}
