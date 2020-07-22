import java.util.Scanner;
public class FindMax{
	public static int Get(int a,int b){
		return a>b?a:b;
	}
	public static int GetMax(int x,int y,int z){
		return Get(x,y)>z?Get(x,y):z;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1=sc.nextInt();
		System.out.println("请输入第二个数：");
		int num2=sc.nextInt();
		System.out.println("请输入第三个数：");
		int num3=sc.nextInt();
		System.out.println("最大值："+GetMax(num1,num2,num3));
		
	}
}