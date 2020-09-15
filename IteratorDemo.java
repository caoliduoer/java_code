package com.caoliduo.list;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        List <String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator<String> it=list.listIterator();
        while(it.hasNext()){
            String next=it.next();
            System.out.println(next);
        }
        for(String next:list){
            System.out.println(next);
        }
        Iterator<String> it1=list.iterator();
        while(it1.hasNext()){//使用迭代器删除当前迭代到的元素。如果使用for循环进行迭代删除当前元素，会变得很乱，不建议使用。
            String next=it.next();
            if(next.equals("c")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
