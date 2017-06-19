package com.example.richardpham.myfirstapp;

/**
 * Created by Richard Pham on 6/16/2017.
 */

public enum Rank {
    THREE(0), FOUR(1), FIVE(2),
    SIX(3), SEVEN(4), EIGHT(5),
    NINE(6), TEN(7), JACK(8),
    QUEEN(9), KING(10), ACE(11),
    TWO(12);


    private int power;

    Rank(int power) {
        this.power = power;
    }

    public int power() {
        return power;
    }
}
