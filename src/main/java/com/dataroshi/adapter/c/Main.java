package com.dataroshi.adapter.c;

public class Main {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        System.out.println("volt " + socketAdapter.getVolt(12));
    }
}