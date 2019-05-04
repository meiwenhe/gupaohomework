package com.mei.pattern.observer;

//韩非子，实际上的被观察者
public class Hanfeizi implements IObserverable{
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver(String context) {
        for (IObserver observer:observers ) {
            observer.update(context);
        }
    }


    public void eat(){
        System.out.println("韩非子在吃饭");
        notifyObserver("韩非子在吃饭");
    }

    public void drink(){
        System.out.println("韩非子在喝水");
        notifyObserver("韩非子在喝水");
    }
}
