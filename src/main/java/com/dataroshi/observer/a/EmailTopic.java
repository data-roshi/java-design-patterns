package com.dataroshi.observer.a;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Observable {

    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }

        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }

        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("msg posted to topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}
