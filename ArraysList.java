import java.util.Arrays;

public class ArraysList {
    public int[] elem;
    public int usedSize;
    public ArraysList(){
        this.elem=new int[10];
        this.usedSize=0;
    }
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
    }
    public boolean contains(int toFind){
        boolean boo=false;
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                boo=true;
                return boo;
            }
        }
        return boo;
    }
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        if(pos<this.usedSize){
            return this.elem[pos];
        }else{
            return -1;
        }
    }
    public void setPos(int pos,int value){
        if(pos<this.usedSize){
            this.elem[pos]=value;
        }else{
            return;
        }
    }
    public void remove(int toRemove){
        int i=0;
        for( i=0;i<this.usedSize;i++){
            if(this.elem[i]==toRemove){
                break;
            }
        }if(i==this.usedSize){
            System.out.println("没有该元素！");
            return;
        }
        for(int j=i;j<this.usedSize-1;j++){
            this.elem[j]=this.elem[j+1];
        }this.usedSize--;
    }
    public void add(int pos,int data ){
        if(pos>this.usedSize||pos<0){
            System.out.println("该位置不合法！");
           return;
        }if(this.usedSize==this.elem.length){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);

        }
            for(int i=this.usedSize-1;i>=pos;i--){
                this.elem[i+1]=this.elem[i];
            }
            this.elem[pos]=data;
            this.usedSize++;
        }
    public static void main(String[] args) {
        ArraysList arr=new ArraysList();
        arr.add(0,1);
        arr.add(1,9);
        arr.add(2,3);
        arr.add(3,5);
        System.out.println(arr.getPos(3));
        System.out.println(arr.contains(9));
        System.out.println(arr.search(5));
        arr.remove(2);
        arr.remove(9);
        arr.display();
    }

}
