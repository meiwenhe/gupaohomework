package com.mei.pattern.singleton.lazysingleton;

public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args){
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(singleton);
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerClassSingleton);

    }
}
