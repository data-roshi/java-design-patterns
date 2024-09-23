package com.dataroshi.strategy.a;

public class Balloon implements ScoreAlgoBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
