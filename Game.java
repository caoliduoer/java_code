package com.caoliduo.card;

import com.sun.media.jfxmedia.events.PlayerStateListener;

import java.sql.SQLOutput;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Game {
    public static void main(String[] args){
        List<Card> cardList=new ArrayList<>();
        List<Player> playerList=new ArrayList<>();
        playerList.add(new Player("chen"));
        playerList.add(new Player("caoliduo"));
        playerList.add(new Player("jingtiantian"));
        playerList.add(new Player("lichen"));
        initializeCards(cardList);
        //boolean cardList;
        Collections.shuffle(cardList);//就是将顺序 打乱。
        System.out.println("抽牌前，牌组中的牌：");
        System.out.println(cardList);
        int n=4;//每人的牌数
        for(int i=0;i<n;i++){//给每个玩家发牌，发了的牌就从牌组中移除
            for(Player player:playerList){
                Card card=cardList.remove(0);
                player.cardList.add(card);
            }
        }
        for(Player player:playerList){
            System.out.printf("玩家[%s]的手牌是：%s\n",player.name,player.cardList);
        }
        System.out.println("抽牌后，牌组中剩下的牌有：");
        System.out.println(cardList);
        Card tofindcard=new Card("❤",1);
        judgeVictory(playerList,tofindcard);
        System.out.println("进行换牌之后的手牌：");

        changePoker( playerList,tofindcard);
        for(Player player:playerList){
            System.out.printf("玩家[%s]的手牌是：%s\n",player.name,player.cardList);
        }
        judgeVictory(playerList,tofindcard);
    }
    private  static void  initializeCards(List<Card> cards){//牌初始化
        for(String suit:new String[]{"❤","♠","◇","♣"}){
            for(int rank=1;rank<=5;rank++){
                Card card =new Card(suit,rank);
                cards.add(card);
            }
        }
    }

    private static void judgeVictory(List<Player> player,Card tofindcard){//判断谁赢功能
        for(Player play:player){
                if(play.cardList.contains(tofindcard)){
                    System.out.printf("[%s]获胜\n",play.name);
                    return;
            }
        }
        System.out.println("平局");
    }

    public static void changePoker(List<Player> players,Card tofindcard){//换牌功能
        int count=0;
        for(Player player:players){
            if(player.name.equals("chen")){
                for(Card card:player.cardList){
                    if((card.equals(tofindcard))){
                       return; //count++;
                    }
                }Card card1=player.cardList.get(0);//
                player.cardList.set(0,tofindcard);//设置第一个元素的值为令牌
            }
        }

    }

}
