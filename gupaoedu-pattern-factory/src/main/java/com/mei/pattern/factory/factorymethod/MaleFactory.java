package com.mei.pattern.factory.factorymethod;

public class MaleFactory implements IHumanFactory{
    public Female createIHuman() {

        return new Female();
    }
}
