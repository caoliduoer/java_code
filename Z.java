class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
    public static String   reverse(String str,int begin,int end){
        char[] st=str.toCharArray();
        while(begin<=end){
            st[begin]^=st[end];
            st[end]^=st[begin];
            st[begin]^=st[end];
            begin++;
            end--;
        }

        return new String(st);
    }
    public static void main(String[] args) {
        //new Z();
        String str="sfrtgh";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}