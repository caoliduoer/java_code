package com.caoliduo.Queue;

import java.util.Deque;
import java.util.LinkedList;
public class MyQueue {
    private Deque<Integer>s1;
    private Deque<Integer>s2;
    public MyQueue(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }
    public void push(int x){
        s2.push(x);
    }
    public int pop(){
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.pop();
    }
    public boolean empty(){//判断是否为空
        return s1.isEmpty()&&s2.isEmpty();
    }
}
