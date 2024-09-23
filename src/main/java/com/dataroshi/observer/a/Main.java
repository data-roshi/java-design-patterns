package com.dataroshi.observer.a;

public class Main {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("first observer");
        Observer secondObserver = new EmailTopicSubscriber("second observer");
        Observer thirdObserver = new EmailTopicSubscriber("third observer");

        // depends  could also be set in constructor
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.update();
        thirdObserver.update();

        topic.postMessage("Hello subscribers");

        topic.unregister(thirdObserver);

        topic.postMessage("Hello subscribers bis");
    }
}