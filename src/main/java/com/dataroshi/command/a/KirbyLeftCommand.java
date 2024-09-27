package com.dataroshi.command.a;

public class KirbyLeftCommand implements Command {

    private final KirbyCharacterReceiver kirby;

    public KirbyLeftCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveLeft();
    }
}
