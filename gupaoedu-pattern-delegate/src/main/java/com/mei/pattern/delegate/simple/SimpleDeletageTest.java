package com.mei.pattern.delegate.simple;

public class SimpleDeletageTest {
    public static void main(String[] args){
        Boss boss = new Boss(new Leader());
        boss.commond("加密");
        boss.commond("架构");
        boss.commond("编程");
    }
}
