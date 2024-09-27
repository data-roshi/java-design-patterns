package com.dataroshi.command.a;

public class KirbyUpCommand implements Command {

    private final KirbyCharacterReceiver kirby;

    public KirbyUpCommand(KirbyCharacterReceiver kirby) {
        this.kirby = kirby;
    }

    @Override
    public void execute() {
        kirby.moveUp();
    }
}
