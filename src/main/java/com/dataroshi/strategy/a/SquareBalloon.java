package com.dataroshi.strategy.a;

public class SquareBalloon implements ScoreAlgoBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
