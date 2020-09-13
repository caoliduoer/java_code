package com.caoliduo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,2,1,23,7,2,5));
        List<Character> list1=new ArrayList<>(Arrays.asList('s','t','u','d','e','n','t'));
        list.remove("2");
        System.out.println(list);
        System.out.println(list1);
    }
}
