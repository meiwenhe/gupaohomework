package com.mei.pattern.prototype;

public class PrototypeTest {
    public static void main(String[] args){
        Prototype p = new Prototype();
        p.setName("mei");
        p.setAge(25);
        Prototype copeP = null;
        try {
             copeP = (Prototype) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("p is "+p+" copeP is "+ copeP + "p is equal copeP ?"+(p == copeP));
    }
}
