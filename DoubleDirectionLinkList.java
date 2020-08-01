class Node1{
    int data;
    Node1 next;
    Node1 prev;
    public Node1(int data){
        this.data=data;
    }
}
public class DoubleDirectionLinkList {
    public Node1 head;
    public Node1 tail;
    public void AddFirst(int data){
        Node1 node =new Node1(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
        }
        else{
            head.prev=node;
            node.next=head;
            this.head=node;
        }
    }
    public void AddLast(int data){
        Node1 node=new Node1(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
        }else{
            this.tail.next=node;
            node.prev=this.tail;
            this.tail=node;
        }
    }
    public void display(){
        if(this.head==null){
            System.out.println("链表中没有元素！");
            return;
        }
        Node1 cur=this.head;
        while(cur!=tail.next){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public int getLength(){
        Node1 cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public void addIndex(int index,int data){
        Node1 node =new Node1(data);
        if(index>getLength()||index<0){
            System.out.println("位置错误！插入失败！");
            return;
        }
        else if(index==0){
            AddFirst(data);
            return;
        }
        else if(index==getLength()){
            AddLast(data);
            return;
        }
        else{
            Node1 cur=this.head;
            while(index>0){
                cur=cur.next;
                index--;
            }
            cur.prev.next=node;
            node.prev=cur.prev;
            cur.prev=node;
            node.next=cur;
        }

    }
    public void delete(int key){
        Node1 cur=this.head;
        if(key==this.head.data){
            head=head.next;
            return;
        }
        if(key==this.tail.data){
            tail=tail.prev;
            return;
        }
        while(cur!=null){
            if(cur.data==key){
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
                return;
            }
            cur=cur.next;
        }
        System.out.println("没有该值！");
    }

}
