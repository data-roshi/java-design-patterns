package com.dataroshi.command.a;

public class Main {

    public static void main(String[] args) {

        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        MarioUpCommand marioUp = new MarioUpCommand(mario);
        MarioDownCommand marioDown = new MarioDownCommand(mario);
        MarioLeftCommand marioLeft = new MarioLeftCommand(mario);
        MarioRightCommand marioRight = new MarioRightCommand(mario);


        KirbyDownCommand kirbyDown = new KirbyDownCommand(kirby);
        KirbyUpCommand kirbyUp = new KirbyUpCommand(kirby);
        KirbyLeftCommand kirbyLeft = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRight = new KirbyRightCommand(kirby);

        GameBoy gameBoyMario = new GameBoy(marioUp, marioDown, marioLeft, marioRight);
        gameBoyMario.arrowDown();

        GameBoy gameBoyKirby = new GameBoy(kirbyUp, kirbyDown, kirbyLeft, kirbyRight);
        gameBoyKirby.arrowLeft();
    }
}