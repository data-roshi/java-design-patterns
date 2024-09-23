package com.dataroshi.strategy.a;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Balloon Tap Score:");
        scoreBoard.scoreAlgoBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clow Tap Score:");
        scoreBoard.scoreAlgoBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("Square Balloon Score:");
        scoreBoard.scoreAlgoBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
        System.out.println("Hello world!");
    }
}