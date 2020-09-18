package com.caoliduo.card;

public class Card {
    public String suit;
    public int rank;
    public Card(String suit,int rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return String.format("[%s %d]",suit,rank);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||!(obj instanceof Card))return  false;
        Card card=(Card) obj;
        return  rank==card.rank && suit.equals(card.suit);
    }

}
