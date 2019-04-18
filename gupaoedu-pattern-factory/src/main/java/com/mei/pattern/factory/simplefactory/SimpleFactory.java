package com.mei.pattern.factory.simplefactory;

public class SimpleFactory {
    public static <T extends IHuman> T  createHuman(Class<T> c){
        try {
            return (T)c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }
}
