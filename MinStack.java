package com.caoliduo.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class MinStack {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public MinStack() {
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();

    }

    public void push(int x) {
        s1.push(x);
    }
}
