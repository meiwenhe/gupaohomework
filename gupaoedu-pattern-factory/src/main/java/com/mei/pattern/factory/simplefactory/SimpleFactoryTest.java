package com.mei.pattern.factory.simplefactory;

public class SimpleFactoryTest {
        public static void main(String[] args){
            IHuman male = SimpleFactory.createHuman(Male.class);
            male.getGender();;
            IHuman female = SimpleFactory.createHuman(Female.class);
            female.getGender();;
        }
}
