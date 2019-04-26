package com.mei.pattern.singleton.register;

public class ContainerSingletonTest
{
    public static void main(String[] args){
        ContainerSingleton singleton =  (ContainerSingleton)ContainerSingleton.getInstance(ContainerSingleton.class);
        System.out.println(singleton);

    }
}
