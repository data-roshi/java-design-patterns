package com.dataroshi.adapter.c;

public class SocketAdapterImpl implements SocketAdapter {

    private final Socket socket = new Socket();

    // Could probably also just create adapter impl for each voltage instead of switch, irl
    // you normally don't switch voltage on a single adapter
    public Volt getVolt(int volts) {
        var volt = socket.getVolt();
        return switch (volts) {
            case 120 -> volt;
            case 12 -> convertVoltage(volt, 10);
            case 6 -> convertVoltage(volt, 20);
            default -> throw new IllegalStateException("Unexpected value: " + volts);
        };
    }

    private Volt convertVoltage(Volt volt, int i) {
        return new Volt(volt.volts() / i);
    }
}
