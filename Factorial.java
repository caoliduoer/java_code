import java.util.Scanner;
public class Factorial{
	public static int Sum(int n){
		int sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}return sum;
	}
	public static void main(String[] args) {
		System.out.println("请输入你的一个数字：");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Sum(num));
		
}
}