package com.mei.pattern.factory.abstractfactory;

public class MaleFactory implements IHumanFactory{
    public AbstractBlackHuman createBlackHuman() {
        return new MaleBlackHuman();
    }

    public AbstractYellowHuman createYellowHuman() {
        return new MaleYellowHuman();
    }

    public AbstractWhiteHuman createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
