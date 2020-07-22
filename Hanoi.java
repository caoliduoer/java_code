public class Hanoi {
    public static void hanoi(int n, char a ,char b,char c) {//从a->b借助c
        if (n == 1) {
            System.out.println(a+"-->"+c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println(a+" -->"+c);
            hanoi(n - 1, b, a, c);

        }
    }
    public static int fabi(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return fabi(n-1)+fabi(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fabi(5)) ;

    }
}
