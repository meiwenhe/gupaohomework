package com.mei.pattern.observer;

public class Wangwu implements  IObserver{
    public void update(String context) {//回调方法，可以针对被观察者的动作做出相应的动作
        System.out.println("王五收到通知");
        cry(context);
    }

    public void  cry(String context){
        System.out.println("韩非子在"+context + ",王五哭了");
    }
}
