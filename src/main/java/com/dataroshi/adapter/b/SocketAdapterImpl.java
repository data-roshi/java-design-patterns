package com.dataroshi.adapter.b;

public class SocketAdapterImpl implements SocketAdapter {

    // composition instead of inheritance for the socket class
    private final Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVoltage(socket.getVolt(), 10);
    }

    @Override
    public Volt get6Volts() {
        return convertVoltage(socket.getVolt(), 20);
    }

    private Volt convertVoltage(Volt volt, int i) {
        return new Volt(volt.volts() / i);
    }
}
