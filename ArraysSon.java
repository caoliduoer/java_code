import java.util.Scanner;
public class ArraysSon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                count++;
            }
        }
        if(count>0){
            int max=arr[0]+arr[1];
            int i=1;
            for(i=1;i<num-2;i++){
                if(max<(arr[i]+arr[i+1])){
                    max=arr[i+1]+arr[i];
                }
                else{
                    max+=arr[i+1];
                }

            }
            if(arr[i+1]>0)System.out.println(max+arr[i+1]);
            else System.out.println(max);
        }
        else{
            int sum=0;
            for(int i=0;i<num;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}