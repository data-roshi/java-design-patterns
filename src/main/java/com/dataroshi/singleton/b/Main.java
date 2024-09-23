package com.dataroshi.singleton.b;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " -> Singleton instance hashcode: " + singleton.hashCode());
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task, "Thread-" + i);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Singleton singleton = Singleton.getInstance();
        System.out.println("Final Singleton instance hashcode: " + singleton.hashCode());
    }
}