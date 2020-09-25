package com.caoliduo.Queue;

import java.util.NoSuchElementException;

public interface Deque extends Queue{
    boolean offerFirst(Integer e);

    boolean offerLast(Integer e);
    Integer peekFirst();
    Integer pollFirst();
    default void addFirst(Integer e){
        if (offerFirst(e) == false) {
            return;
        }
        throw new IllegalStateException();

    }
    default Integer getFirst(){
        Integer e=peekFirst();
        if(e==null){
            throw new NoSuchElementException();
        }
        return e;
    }
}
