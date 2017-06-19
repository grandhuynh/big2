package com.example.richardpham.myfirstapp;

/**
 * Created by Richard Pham on 6/16/2017.
 */

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Game {

    public final int DECK_SIZE =  52;

    private boolean on;

    private Card[] deck;

    private Hand hand0;
    private Hand hand1;
    private Hand hand2;
    private Hand hand3;

    private Card[] lastPlayed;

    public Game() {
        on = true;
        deck = new Card[DECK_SIZE];
        int c = 0;
        for(int s = 0; s < 4; s++) {
            for(int r = 0; r < 13; r++) {
                deck[c++] = new Card(Suit.values()[s], Rank.values()[r]);
            }
        }
        List<Card> list = Arrays.asList(deck);
        Collections.shuffle(list);
        initializeHands(deck);

    }

    public void initializeHands(Card[] deck) {
        Card[] hand = new Card[13];
        for(int i = 0; i < 13; i++) {
            hand[i] = deck[i];
        }
        hand0 = new Hand(hand);

        for(int i = 13; i < 26; i++) {
            hand[i] = deck[i];
        }
        hand1 = new Hand(hand);

        for(int i = 26; i < 39; i++) {
            hand[i] = deck[i];
        }
        hand2 = new Hand(hand);

        for(int i = 39; i < 52; i++) {
            hand[i] = deck[i];
        }
        hand3 = new Hand(hand);
    }

    public boolean on() {
        return on;
    }

    public void isOver() {
        on = false;
    }


}
