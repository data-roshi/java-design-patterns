package com.dataroshi.command.a;

public class KirbyRightCommand implements Command {

    private final KirbyCharacterReceiver kirby;

    public KirbyRightCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveRight();
    }
}
