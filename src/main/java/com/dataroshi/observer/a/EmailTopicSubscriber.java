package com.dataroshi.observer.a;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Observable topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " no new message on this topic");
        } else {
            System.out.println(name + " retrieving message: " + msg);
        }
    }

    @Override
    public void setObservable(Observable topic) {
        this.topic = topic;
    }
}
