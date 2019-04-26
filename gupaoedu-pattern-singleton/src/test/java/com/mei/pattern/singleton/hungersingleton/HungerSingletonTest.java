package com.mei.pattern.singleton.hungersingleton;

public class HungerSingletonTest {
    public static void main(String[] args){
        HungerSingleton singleton = HungerSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerSingleton.getInstance();
        System.out.println(singleton);
    }

}
