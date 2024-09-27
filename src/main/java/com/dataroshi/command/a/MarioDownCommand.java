package com.dataroshi.command.a;

public class MarioDownCommand implements Command{

    private final MarioCharacterReceiver mario;

    public MarioDownCommand(MarioCharacterReceiver mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveDown();
    }
}
