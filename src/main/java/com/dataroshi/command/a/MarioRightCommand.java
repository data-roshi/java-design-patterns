package com.dataroshi.command.a;

public class MarioRightCommand implements Command {

    private final MarioCharacterReceiver mario;

    public MarioRightCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveRight();
    }
}
