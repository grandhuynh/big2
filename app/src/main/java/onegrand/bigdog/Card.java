package com.example.richardpham.myfirstapp;

/**
 * Created by Richard Pham on 6/16/2017.
 */

public class Card {

    private Suit suit;

    private Rank rank;

    private boolean played;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        played = false;
    }

    public Suit suit() {
        return suit;
    }

    public Rank rank() {
        return rank;
    }

    public boolean getPlayed() {
        return played;
    }

    public void play() {
        played = true;
    }
}
