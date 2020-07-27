import java.util.Arrays;

public class ChangePosition {
    public static void main(String [] args){
        int [] arr ={1,25,4,2,6,3};
        int [] arr1={2,3,4,5,6,7};
        //change(arr);
        swapInt(arr,arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    public static void swapInt(int [] a1,int [] a2){
        if(a1==null||a1.length==0){
            System.out.println("数组为空！");
        }
        else if(a1.length==a2.length){
            for(int i=0;i<a1.length;i++){
                a1[i]^=a2[i];
                a2[i]^=a1[i];
                a1[i]^=a2[i];

            }
        }
        else{
            System.out.println("数组长度不同");
        }
    }
    public static void change(int [] arr){
        if(arr==null||arr.length==0){
            System.out.println("数组为空！");
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if((arr[start]&1)==0){//偶数
                start++;
            }else{//奇数
                if((arr[end]&1)==0){
                    arr[end]^=arr[start];
                    arr[start]^=arr[end];
                    arr[end]^=arr[start];
                }
                else{
                    end--;
                }
            }
        }

    }
}
