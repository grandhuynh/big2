package com.example.richardpham.myfirstapp;

/**
 * Created by Richard Pham on 6/16/2017.
 */

public enum Suit {
    SPADES(0),
    CLOVER(1),
    DIAMOND(2),
    HEART(3);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int power() {
        return power;
    }
}
