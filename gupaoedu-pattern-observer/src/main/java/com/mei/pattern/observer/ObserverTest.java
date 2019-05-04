package com.mei.pattern.observer;

public class ObserverTest {
    public static void main(String[] args){
        Hanfeizi hanfeizi = new Hanfeizi();
        IObserver lisi = new Lisi();
        //只通知李斯
        hanfeizi.addObserver(lisi);
        hanfeizi.eat();

        System.out.println("=========通知李斯和王五===========");
        IObserver wangwu = new Wangwu();
        hanfeizi.addObserver(wangwu);
        hanfeizi.drink();
        System.out.println("========删除李斯，只通知王五===========");
        hanfeizi.deleteObserver(lisi);
        hanfeizi.eat();
    }
}
