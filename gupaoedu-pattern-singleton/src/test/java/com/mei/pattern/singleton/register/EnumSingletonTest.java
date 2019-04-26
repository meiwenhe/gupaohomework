package com.mei.pattern.singleton.register;

public class EnumSingletonTest {
    public static void main(String[] args){
        EnumSingleton singleton = EnumSingleton.getInstance();
        System.out.println(singleton);
    }
}
