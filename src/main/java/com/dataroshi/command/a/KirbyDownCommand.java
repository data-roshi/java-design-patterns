package com.dataroshi.command.a;

public class KirbyDownCommand implements Command {

    private final KirbyCharacterReceiver kirby;

    public KirbyDownCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveDown();
    }
}
