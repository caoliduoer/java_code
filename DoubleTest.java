public class DoubleTest {
    public static void main(String[] args){
        DoubleDirectionLinkList list=new DoubleDirectionLinkList();
        list.AddFirst(1);
        list.AddLast(4);
        list.AddFirst(2);
        list.AddLast(9);
        list.addIndex(1,88);
        list.addIndex(4,66);
       list.delete(2);
        list.display();
    }
}
