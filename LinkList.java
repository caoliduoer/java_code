class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
    }
}
public class LinkList {
    public Node head;
    public void addFrist(int data){//
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }
    public void display(){
        Node cur=this.head;
        if(head==null){
            System.out.println("链表为空");
            return;
        }
        else{
            while(cur!=null){
                System.out.println(cur.data+" ");
                cur=cur.next;
            }
        }
    }
    public void addEnd(int data){
        Node node1=new Node(data);
        if(this.head==null){
            this.head=node1;
           // addFrist(data);
        }
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }cur.next= node1;
    }
    public int getLength(){
        //Node node=new Node();
        Node cur=this.head;
        int count =0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public boolean cheakIndex(int index){
        if(index<getLength()){
            return true;
        }
        return false;
    }
    public Node research(int index) {
        if (cheakIndex(index)) {
            Node cur = this.head;
            while(index-1>1){
                cur=cur.next;
                index--;
            }
            return cur;
        }
        return null;
    }
    public void addIndex(int index,int data){
        Node node1=new Node(data);
        if(index==0){
            addFrist(data);
        }
        else if(index==getLength()){
            addEnd(data);
        }
        else{
            Node node=research(index);
            Node temp=node.next;
            node.next=node1;
            node1.next=temp;
        }
    }
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head == null) return;
        //头节点是删除的节点
        if(this.head.data == key) {
            this.head=this.head.next;
            return;
        }
        else{
            Node node1=searchPrevNode(key);
            node1.next=node1.next.next;

        }
    }
    public void removeAllKeys(int key){
        remove(key);
        while(contains(key)){
            remove(key);
        }

    }
    public boolean contains(int key){
        Node cur=this.head;
        for(int i=0;i<getLength();i++){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }return false;
    }



}
