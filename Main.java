import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();

        if(pos>5){
            if(pos%5==0){
                System.out.println(pos/5);
            }
            else{
                System.out.println(pos/5+1);
            }
        }else{
            System.out.println(1);
        }
    }
}

