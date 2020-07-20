import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int lar=num>num1?num:num1;
		for(int i=lar;i<=num*num1;i++){
			if(i%num==0&&i%num1==0){
				System.out.println("最大公约数："+i);
				break;
			}
		}

	}
}