package com.dataroshi.command.a;

public class MarioLeftCommand implements Command{

    private final MarioCharacterReceiver mario;

    public MarioLeftCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveLeft();
    }
}
