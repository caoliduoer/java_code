import java.util.Arrays;
public class Sum {
    public static void sum(int n){
        if(n<10){
            System.out.println(n);
        }else{
            sum(n/10);
            System.out.println(n%10);
        }
    }
    public static int getMul(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static int [] getArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
            return arr;
    }
    public static void printArrays(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr1={1,8,4,2,4,5};
        int []arr=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
