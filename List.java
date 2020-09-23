package com.caoliduo.LinkedList;

import java.util.Iterator;

public interface List extends Iterable {//接口里面都是方法，但是没有实现
        boolean add(Integer e);
        void add(int index,Integer e);
        Integer remove(int index);//根据下标删除
        boolean remove(Integer e);//删除第一个遇到的
        Integer get(int index);
        Integer set(int index,Integer e);
        int size();
        void clear();
        boolean isEmpty();
        boolean contains(Integer e);
        int indexOf(Integer e);
        int lastIndexOf(Integer e );
}
