package com.dataroshi.strategy.a;

public class ScoreBoard {

    public ScoreAlgoBase scoreAlgoBase;

    public void  showScore(int taps, int multiplier) {
        System.out.println(scoreAlgoBase.calculateScore(taps, multiplier));
    }
}
