package com.mei.pattern.singleton.hungersingleton;

public class HhungerStaticBlockPatternTest {
    public static void main(String[] args){
        HungerStaticBlockSingleton singleton = HungerStaticBlockSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerStaticBlockSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerStaticBlockSingleton.getInstance();
        System.out.println(singleton);
        singleton = HungerStaticBlockSingleton.getInstance();
        System.out.println(singleton);
    }
}
