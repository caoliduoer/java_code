package com.caoliduo.card;
import java.util.ArrayList;
import java.util.List;
public class Player {
    public List<Card> cardList= new ArrayList<>();
    public String name;

    public Player(String name){//构造方法一定要写对，否则对对象的初始化有很大的影响
        this.name=name;
        //this.cardList=cardlist;

    }
}
