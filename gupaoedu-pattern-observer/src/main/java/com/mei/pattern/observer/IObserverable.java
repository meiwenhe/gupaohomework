package com.mei.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//被观察者,用抽象类比较好
public interface IObserverable {
     List<IObserver> observers = new ArrayList<IObserver>();
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObserver(String context);
}
