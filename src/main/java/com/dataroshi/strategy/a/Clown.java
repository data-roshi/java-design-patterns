package com.dataroshi.strategy.a;

public class Clown implements ScoreAlgoBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
