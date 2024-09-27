package com.dataroshi.facade.a;

public class ComputerFacade {

    private final CPU cpu;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade(CPU cpu, Memory ram, HardDrive hd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        cpu.freeze();
        ram.load(132, hd.read(3487L, 88));
        cpu.jump(132);
        cpu.execute();
    }
}
