package com.mei.pattern.factory.abstractfactory;

public class FemaleFactory implements IHumanFactory {
    public AbstractBlackHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public AbstractYellowHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public AbstractWhiteHuman createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
