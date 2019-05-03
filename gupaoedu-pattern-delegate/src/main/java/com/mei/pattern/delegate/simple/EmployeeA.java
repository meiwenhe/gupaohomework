package com.mei.pattern.delegate.simple;

public class EmployeeA implements IEmployee{
    public void doing(String commond) {
        System.out.println("我是员工A，我正在干活，做"+commond+"相关的工作");
    }
}
