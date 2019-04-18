package com.mei.pattern.factory.abstractfactory;

public interface IHumanFactory {
    AbstractBlackHuman createBlackHuman();
    AbstractYellowHuman createYellowHuman();
    AbstractWhiteHuman createWhiteHuman();
}
