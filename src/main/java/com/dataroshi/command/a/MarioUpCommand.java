package com.dataroshi.command.a;

public class MarioUpCommand implements Command {

    private final MarioCharacterReceiver mario;

    public MarioUpCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveUp();
    }
}
