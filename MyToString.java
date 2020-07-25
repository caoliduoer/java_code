import java.util.Arrays;

public class MyToString {
    public static void main(String[] args) {
        int [] arr={6,7,32,44,29};
        isOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void isOrder(int [] arr){
        if(arr.length==0){
            System.out.println("数组为空");
        }
        int max=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                count=1;
                arr[i]^=arr[j];
                arr[j]^=arr[i];
                arr[i]^=arr[j];
            }
        }
        }
        if(count==0){
            System.out.println("该数组是升序的！");
        }else{
            System.out.println("冒泡排序之后：");
        }

    }
    public static  String toString(int [] arr){
        String str="[";
        for (int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                str+=arr[i]+",";
            }
            else{
                str+=arr[i]+"]";
            }
        }
        return str;
    }
    public static int [] copyOf(int [] arr){
        int [] arr1=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
    public static int binaryRearch(int [] arr,int x){
        int start=0;
        int end=arr.length-1;//4
        int mid=0;
        while(start<end){
            mid=(start+end)/2;//2 3  2
            if(x==arr[mid]){
                    return mid;
            }else if(arr[mid]<x){//32<33
                start =mid+1;//2 2
            }else{
                end=mid-1;//3
            }
        }
        return -1;
    }

    public static double getAvg(int [] arr){
       double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int getMax(int [] arr){
        int max=0;
       for(int i=0;i<arr.length-1;i++){
           max=arr[i]>arr[i+1]?arr[i]:arr[i+1];
       }
       return max;
    }
}
