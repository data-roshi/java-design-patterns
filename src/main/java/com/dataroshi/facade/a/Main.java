package com.dataroshi.facade.a;

public class Main {

    public static void main(String[] args) {

        var computerFacade = new ComputerFacade(new CPU(), new Memory(), new HardDrive());
        computerFacade.start();
    }
}