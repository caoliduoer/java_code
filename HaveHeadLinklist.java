class Node2{
    int data;
    Node2 next;
    Node2 prev;
    public Node2(int data){
        this.data=data;
    }
}
public class HaveHeadLinklist {
    public Node2 head=new Node2(-1);
    public Node2 tail;
    public void addFirst(int data){
        Node2 node =new Node2(data);
        if(head.next==null){
            head.next=node;
            node.prev=head;
            tail=node;
        }else{
            head.next.prev=node;
            node.next=head.next;
            node.prev=head;
        }
    }
    public void addLast(int data){
        Node2 node=new Node2(data);
        if(head.next==null){
            this.head.next=node;
            node.prev=this.head;
            this.tail=node;
        }else{
            node.prev=this.tail;
            this.tail.next=node;
            tail=node;
        }
    }
    public int size(){
        Node2 cur=this.head.next;
        int count=0;
        while(cur!=tail.next){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public  void display(){
        Node2 cur=this.head.next;
        while(cur!=tail.next){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }System.out.println();
    }
    public void addIndex(int index,int data){

        if(index<0||index>size()){
            System.out.println("位置错误！");
        }else if(index==0){
            addFirst(data);
        }else if(index==size()){
            addLast(data);
        }else{
            Node2 cur=this.head.next;
            while(index>0){
                cur=cur.next;
                index--;
            }

        }
    }

}
