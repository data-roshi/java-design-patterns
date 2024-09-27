package com.dataroshi.adapter.a;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVoltage(getVolt(), 10);
    }

    @Override
    public Volt get6Volts() {
        return convertVoltage(getVolt(), 20);
    }

    private Volt convertVoltage(Volt volt, int i) {
        return new Volt(volt.volts() / i);
    }
}
