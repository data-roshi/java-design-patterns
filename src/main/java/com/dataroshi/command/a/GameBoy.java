package com.dataroshi.command.a;

public class GameBoy {
    private final Command upCommand;
    private final Command downCommand;
    private final Command leftCommand;
    private final Command rightCommand;

    // Todo don't think this is a really good example
    public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
    }

    public void arrowUp() {
       upCommand.execute();
    }

    public void arrowDown() {
        downCommand.execute();
    }

    public void arrowLeft() {
        leftCommand.execute();
    }

    public void arrowRight() {
        rightCommand.execute();
    }
}




