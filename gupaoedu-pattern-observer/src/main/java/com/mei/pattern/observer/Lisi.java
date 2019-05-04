package com.mei.pattern.observer;

public class Lisi implements  IObserver{
    public void update(String context) {//回调方法，可以针对被观察者的动作做出相应的动作
        System.out.println("李斯准备向老板报告了");
        report(context);
    }

    public void  report(String context){
        System.out.println("报告老板：韩非子在"+context + ",我们要怎么办");
    }
}
