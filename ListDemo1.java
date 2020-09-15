
package com.caoliduo.list;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
public class ListDemo1 {
        public static void main(String[] args){
            List<String> list=new ArrayList<>();
            list.add("hello");
            list.add("hello");
            list.add("我是");
            list.add("中国人");
            list.add(3,"吃了吗");
            System.out.println(list);
            String s=list.get(2);
            System.out.println(s);
           list.set(4,"好的");
            System.out.println(list);
            System.out.println(list.size());
            list.remove("中国人");
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.isEmpty());
            list.clear();
            System.out.println(list.isEmpty());
            System.out.println(list.contains("中国人"));
            System.out.println(list.contains("我是"));
            System.out.println(list.indexOf("我是"));

        }

}
