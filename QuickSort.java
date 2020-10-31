package sort;

public class QuickSort {
    public static void quickSort(int[] arr){
        sortInternal(arr,0,arr.length-1);
    }
    public static void sortInternal(int[] arr,int lowIndex,int highIndex){
        int size=highIndex-lowIndex+1;
        if(size<=1){
            return;
        }
        int keyIndex=partition(arr,lowIndex,highIndex);
        sortInternal(arr,lowIndex ,keyIndex-1);
        sortInternal(arr,keyIndex+1,highIndex);
    }


    public static int partition(int[] arr, int lowIndex, int highIndex){
        int headIndex=lowIndex;
        int tailIndex=highIndex;
        int key=arr[lowIndex];
        while(headIndex<tailIndex){
            if(arr[tailIndex]>key&&headIndex<tailIndex){
                tailIndex--;
            }else if(arr[tailIndex]<=key&&headIndex<tailIndex){
                if(arr[headIndex]>key&&headIndex<tailIndex){
                    swap(arr,headIndex,tailIndex);
                    headIndex++;
                    tailIndex--;
                }
                else if(arr[headIndex]<=key&&headIndex<tailIndex){
                    headIndex++;
                }
            }
        }
        swap(arr,lowIndex,tailIndex);
        return tailIndex;
    }
    public static void swap(int[] arr,int index1,int index2){
        int tmp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tmp;
    }

}
