package com.dataroshi.observer.a;

public interface Observable {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);
}
