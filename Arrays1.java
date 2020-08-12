package Practice1;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays1 {
    public static boolean  find(int a[][],int n){
        for(int i=0;i<4;i++){
            if(a[i][3]>n){
                for(int j=3;j>=0;j--){
                    if(a[i][j]==n){
                        return true;
                    }
                }return false;
            }
        }
        return false;
    }
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入16个数字");
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Arrays.sort(arr);
        int num=sc.nextInt();
        System.out.println(find(arr, num));

    }

}
