import java.util.Scanner;
public class Jump {
    public static  int jump(int n){
        if(n==1){
            return 1;
        }if(n%2==1){
            return jump(n-2)+1;
        }return jump(n-1)+1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
        System.out.println(jump(num));
    
    }
}
