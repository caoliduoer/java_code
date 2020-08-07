package Practice1;

public class StringOption {
    public static void printArray(char[] st,int start,int end){
        System.out.print("[");
        for(int i=start;i<=end;i++){
            System.out.print(st[i]+" ");
        }System.out.println("]");
    }
    public static  void mySplit(String str,char ch){
        if(str==null){
            return;
        }
        char[] st=str.toCharArray();
        int i=0;
        int s=0;
        for(;i<st.length;i++){
            if (st[i] == ch) {
                if(i==0){
                    s=1;
                    continue;
                }
                printArray(st,s,i-1);
                s=i+1;
            }
        }if(s<st.length){
            printArray(st,s,st.length-1);
        }

    }
    public static String replace(String str,char a,char b){
        if(str==null){
            return null;
        }
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==a){
                ch[i]=b;
            }
        }return new String(ch);
    }
    public  int indexOf(String str,int ch){
        if(str==null){
            return -1;
        }
        char[] ch1=str.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==ch){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(String st1,String st2){//st2是要判断的子串
        if(st1==null||st2==null){
            return false;
        }
        char[] ch1=st1.toCharArray();
        char[] ch2=st2.toCharArray();
        int i=0, j=0;
        while(i!=ch1.length&&j!=ch2.length){
            if(ch1[i]==ch2[j]){
                    j++;
                    i++;
            }else{
                i++;
            }
        }if(j==ch2.length){
            return true;
        }else {
            return false;
        }
    }
    public int compareTo(String st1,String st2){
        if(st1==null||st2==null){
            return -1;
        }
        char[] ch1=st1.toCharArray();
        char[] ch2=st2.toCharArray();
        int i=0, j=0;
        while(i!=ch1.length&&j!=ch2.length){
            if(ch1[i]==ch2[j]){
                i++;
                j++;
            }else{
                return ch1[i]-ch2[j];
            }
        }
        return ch1.length-ch2.length;
    }


}
