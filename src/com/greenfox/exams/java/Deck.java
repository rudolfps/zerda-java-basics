package com.greenfox.exams.java;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by gabkamabka on 2016.12.05..
 */
public class Deck extends com.greenfox.exams.java.Card{
        ArrayList<Card> cards = new ArrayList<Card>();

        String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] suit = {"Club", "Spade", "Diamond", "Heart"};

        public Deck(){
            for (int i = 0; i<suit.length; i++) {
                for(int j=0; j<values.length; j++){
                    this.cards.add(new Card(suit[i],values[j]));
                }
            }
            Collections.shuffle(this.cards);

        }

        public ArrayList<Card> getDeck(){
            return cards;
        }

    ArrayList<Card> used = new ArrayList<Card>();


    }

