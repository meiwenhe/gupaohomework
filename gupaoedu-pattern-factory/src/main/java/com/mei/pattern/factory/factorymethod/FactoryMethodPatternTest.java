package com.mei.pattern.factory.factorymethod;

public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        IHuman male = new MaleFactory().createIHuman();
        IHuman female = new FemaleFactory().createIHuman();
        male.getGender();;
        female.getGender();
    }
}
