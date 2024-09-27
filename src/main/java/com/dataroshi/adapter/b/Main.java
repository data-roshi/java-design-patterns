package com.dataroshi.adapter.b;

public class Main {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        var volt = getVolt(socketAdapter, 12);
        System.out.println("volt " + volt.volts());
    }

    // feel convoluted, better tell don't ask, try in c
    private static Volt getVolt(SocketAdapter socketAdapter, int volts) {
        return switch (volts) {
            case 120 -> socketAdapter.get120Volts();
            case 12 -> socketAdapter.get12Volts();
            case 6 -> socketAdapter.get6Volts();
            default -> throw new IllegalStateException("Unexpected value: " + volts);
        };
    }
}