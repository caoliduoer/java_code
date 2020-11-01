package practice;
import java.util.Stack;
public class Jinzhizhuanhuan {
    public static void main(String[] args){
        Stack s1=getNum(1234,8);
        Stack s2=getNum(1234,16);
        System.out.print("O");
        while(!s1.isEmpty()){
            System.out.print(s1.pop());
        }
            System.out.print(" ");
            System.out.print("OX");
        while(!s2.isEmpty()){
            System.out.print(s2.pop());
        }
    }
    public static Stack getNum(int num,int jinzhi){
        Stack stack=new Stack();
        int s=0;
        if(jinzhi>10){
            while(num>0){
                s=num%jinzhi;
                if(s>9){
                    char c=(char)(55+s);
                    stack.push(c);
                }else{
                    stack.push(s);
                }
                num=num/jinzhi;
            }
        }
        while(num>0){
            s=num%jinzhi;
            stack.push(s);
            num=num/jinzhi;

        }
        return stack;
    }

}
