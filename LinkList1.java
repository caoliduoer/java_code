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
                System.out.print(cur.data+"  ");
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
    public void removeAllKeys(int key) {
        //remove(key);
        //while(contains(key)){
        //   remove(key);
        // }
        Node cur=this.head.next;
        Node prev=this.head;

        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
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
    public Node reverse(){
        Node pre=this.head;
        Node cur=pre.next;
        this.head.next=null;
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                head=cur;

            }
            cur.next=pre;
            pre=cur;
            cur=curNext;
           // curNext=curNext.next;
        }
        return head;
        /*Node newHead=null;
        Node cur=this.head;
        Node prev=null;

        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
                //return;
            }cur.next=prev;
            prev=cur;
            cur=curNext;

        }return newHead;*/
    }
    public Node getMid(){
        Node fast=this.head;
        Node slow=this.head;
        if(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;

    }
   public int findLastK(int k){
       if (k <= 0|this.head==null) {
           System.out.println("位置错误！");
       }
        Node fast=this.head;
        Node slow=this.head;
        while(k-1>0){
            if(fast.next==null){
                System.out.println("k值过大！");
                return-1;
            }else {
                fast = fast.next;
                k--;
            }
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
   }
   /*public Node devideByKey(int key){
        Node bs=null;
        Node be=null;
        Node as=null;
        Node ae=null;
        Node cur=this.head;
        while(cur!=null){
            if(cur.data<key){
                if(bs==null){
                    bs=cur;
                    bs.next=be;
                }else{
                    be.next=cur;
                    be=cur;
                    //be=cur.next;
                }
            }
            else{
                if(as==null){
                    as=cur;
                    ae=as;
                }
                *//*bs=cur;
                cur=cur.next;*//*
                else{
                    ae.next=cur;
                    ae=cur;


                }
            }
        }cur=cur.next;
        if()
   }

*/
    public Node deleteSame() {
        Node cur=this.head;
        Node newHead=new Node(-1);
        Node temp=newHead;
        while(cur!=null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                temp.next = cur;
                temp = cur;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
    public boolean chickPalink(){//是否回文
        if(this.head==null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        Node slow=this.head;
        Node fast=this.head;
        while(fast.next!=null&&fast!=null){//找中点
            fast=fast.next;
            if(fast.next!=null){
                fast=fast.next;
            }
            slow=slow.next;
        }
        Node cur=slow.next;
        Node tem=cur.next;
        cur.next=slow;

        while( cur!=null){//反转
            Node curNext=tem;
            if(curNext==null){
                break;
            }tem=curNext.next;
            curNext.next=cur;
            cur=curNext;
        }
        while(fast.data!=slow.data){
            if(head.data!=fast.data){
                return false;
            }
            head=head.next;
            fast=fast.next;
        }if(head.data==fast.data){
            return true;
        }else{
            return false;
        }

    }
    public boolean haveCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public Node cheakCyclePoint(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }else{
            slow=this.head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }return fast;

    }
    }
}
