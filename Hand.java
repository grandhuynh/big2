package com.example.richardpham.myfirstapp;

/**
 * Created by Richard Pham on 6/16/2017.
 */

public class Hand {

    private final int MAX_HAND_SIZE = 13;

    private Card[] hand;

    public Hand(Card[] hand) {
        hand = new Card[MAX_HAND_SIZE];
        for(int i = 0; i < MAX_HAND_SIZE; i++) {
            this.hand[i] = hand[i];
        }
    }

    public Card[] hand() {
        return hand;
    }

}
