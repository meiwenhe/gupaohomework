package com.mei.pattern.factory.factorymethod;

public class FemaleFactory  implements IHumanFactory {
    public IHuman createIHuman() {
        return new Female();
    }
}
