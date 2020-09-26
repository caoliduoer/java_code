package com.caoliduo.Queue;

import java.util.LinkedList;
import java.util.Deque;
public class DequeDemo {
    public static void main(String[] args){
        Deque <Integer> deque =new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.contains(9));
        System.out.println(deque.getFirst());
        System.out.println(deque.peekLast());
        while(deque!=null){

            if(!deque.isEmpty()){
                System.out.println(deque.peekFirst());
                System.out.println(deque.removeFirst());
            }
            if(!deque.isEmpty()){
                System.out.println(deque.peekLast());
                System.out.println(deque.removeLast());
            }
        }
    }
}
