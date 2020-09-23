package com.caoliduo.LinkedList;

public class LinkList implements List {
    public Node head;
    public Node last;
    public int size;
    @Override
    public void add(int index, Integer e) {
        if(index<0||index>this.size){
            throw new IndexOutOfBoundsException("下标越界");
        }if(index==size){
            add(e);
        }else if(index==0){//头插
            Node newNode=new Node(e);
            newNode.next=this.head;
            this.head.prev=newNode;
            this.head=newNode;
            size++;
        }else{//0和size之间的位置
            Node prev;
            if(index-1<size/2){
               prev =head;
               for(int i=0;i<index-1;i++){
                   prev=prev.next;
               }
            }
            else{
                prev=last;
                for(int i=0;i<size-index;i--){
                    prev=prev.prev;
                }
            }
            Node next=prev.next;
            Node newNode=new Node(e);
            newNode.prev=prev;
            newNode.next=next;
            prev.next=newNode;
            next.prev=newNode;
            size++;
        }
    }

    @Override
    public Integer remove(int index) {
        if(index<0||index>this.size){//下标约束
            throw new IndexOutOfBoundsException("下标越界");
        }Integer v=0;
        if(index==0){//要删除的是第一个节点
            this.head=this.head.next;
            this.head.prev=null;
            size--;
            if(size==0){
                head=null;
            }
        }else if(index==size-1){//删除最后一个节点
            v=last.element;
            this.last=last.prev;
            last.next=null;
            size--;
        }
        else{//头节点和尾结点之间的节点
            Node prev=null;
            if(index-1<size/2){
                for(int i=0;i<index-1;i++){
                    prev=head.next;
                }
            }
            else{
                prev=last;
                for(int i=0;i<size-index;i++){
                    prev=prev.prev;
                }
            }
            Node toRemove=prev.next;
            v=toRemove.element;
            prev.next=toRemove.next;
            toRemove.next.prev=prev;
            size--;
        }
        return v;
    }

    @Override
    public boolean remove(Integer e) {
        Node cur=this.head;
        while(cur!=null){
            if(cur.element==e){
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.element;
    }

    @Override
    public Integer set(int index,Integer e) {
        if(index<0||index>size-1){
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node cur=head;
        for(int i=0;i<index+1;i++){
            cur=cur.next;
        }
        cur.element=e;
        return null;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void clear() {
        head=null;
        last=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
         Node cur=this.head;
         while(cur!=null){
             if(cur.element==e){
                 return true;
             }
             cur=cur.next;
         }
        return false;
    }

    @Override
    public int indexOf(Integer e) {
        int count=0;
        for(Node cur=this.head;cur!=null;cur=cur.next,count++){
            if(cur.element==e){
                return count;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        int i=size-1;
        for(Node cur=this.last;cur!=null;cur=cur.prev,i--){
            if(cur.element==e){
                return i;
            }
        }
        return -1;
    }

    public boolean add(Integer e){
        Node newNode =new Node(e);
        if(size==0){
            this.head=this.last=newNode;
        }else{//在最后一个节点后面插入节点
            this.last.next=newNode;
            newNode.prev=this.last;
            this.last=newNode;
        }
        this.size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");
        for(Node cur=head;cur!=null;cur=cur.next){
            sb.append(cur.element);
            if(cur!=last){
                sb.append(",");
            }
        }
        sb.append("]");
        return super.toString();
    }
}
