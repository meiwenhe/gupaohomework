package com.mei.pattern.delegate.simple;

public class EmployeeB implements IEmployee{
    public void doing(String commond) {
        System.out.println("我是员工b，我正在干活，做"+commond+"相关的工作");
    }
}
