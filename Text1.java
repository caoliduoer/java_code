class Test{

    public static void main(String[] args) {

        LinkList list=new LinkList();
        list.addFrist(66);
        list.addEnd(69);
        list.addIndex(1,55);
        list.addIndex(1,55);
        list.addIndex(1,55);
        list.removeAllKeys(55);
        //list.remove(66);
        System.out.println( list.contains(69));
        list.display();

    }
}