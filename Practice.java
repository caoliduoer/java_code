import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int [] arr={1,4,2,3,45,50};
        System.out.println(isSorted(arr));
        bufferSort(arr);
        System.out.println(Arrays.toString(arr));
       // sort(arr);
       // System.out.println(Arrays.toString(arr));
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));
    }
    public static void reverse1(int start,int end){

    }
    public static void bufferSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                arr[j]^=arr[j+1];
                arr[j+1]^=arr[j];
                arr[j]^=arr[j+1];
            }
        }
    }
    public  static boolean isSorted(int [] arr){
        if(arr==null||arr.length==0){
            return false;
        }
        boolean t=true;
        for(int i=0;i<arr.length-1;i++){
            t=true;
            if(arr[i]>arr[i+1]){
                t=false;
            }
        }return t;

    }
    public static  void reverse(int [] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            a[start]^=a[end];
            a[end]^=a[start];
            a[start]^=a[end];
            start++;
            end--;
        }

    }
    public  static void sort(int [] a){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;)
           if(a[j]>a[j+1]){
                a[j]^=a[j+1];
                a[j+1]^=a[j];
                a[j]^=a[j+1];
           }
        }
    }
}
