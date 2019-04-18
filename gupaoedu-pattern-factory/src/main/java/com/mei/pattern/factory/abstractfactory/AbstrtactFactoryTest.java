package com.mei.pattern.factory.abstractfactory;

public class AbstrtactFactoryTest {
    public static void main(String[] args){
        IHumanFactory maleFactory = new MaleFactory();
        System.out.println("\n\n------男性黑人------");
        IHuman maleBlackHuman = maleFactory.createBlackHuman();
        maleBlackHuman.getGender();
        maleBlackHuman.getColor();
        System.out.println("\n\n---------男性黄人------");
        IHuman maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.getGender();
        maleYellowHuman.getColor();
        System.out.println("\n\n--------男性白人---------");
        IHuman maleWhiteHuman = maleFactory.createWhiteHuman();
        maleWhiteHuman.getGender();
        maleWhiteHuman.getColor();


        IHumanFactory femaleFactory = new FemaleFactory();
        System.out.println("\n\n------女性黑人------");
        IHuman femaleBlackHuman = femaleFactory.createBlackHuman();
        femaleBlackHuman.getGender();
        femaleBlackHuman.getColor();
        System.out.println("\n\n---------女性黄人------");
        IHuman femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.getGender();
        femaleYellowHuman.getColor();
        System.out.println("\n\n-------女性白人----------");
        IHuman femaleWhiteHuman = femaleFactory.createWhiteHuman();
        femaleWhiteHuman.getGender();
        femaleWhiteHuman.getColor();





    }
}
