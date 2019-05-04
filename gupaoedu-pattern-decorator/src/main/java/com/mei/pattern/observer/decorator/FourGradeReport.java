package com.mei.pattern.observer.decorator;

public class FourGradeReport implements IGradeReport {
    public void report() {
        System.out.println("语文 80  数学75  英语65");
    }

    public void sign(String name) {
        System.out.println("签名:"+name+"");
    }
}
