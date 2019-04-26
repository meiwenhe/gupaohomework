package com.mei.pattern.singleton.lazysingleton;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyInnerClass.INSTANCE!=null){
            throw new RuntimeException("单例，不允许通过反射创建实例");
        }

    }
    public static LazyInnerClassSingleton getInstance(){
        return LazyInnerClass.INSTANCE;
    }

    private static class  LazyInnerClass{
        private static  final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
