
import java.util.Scanner;
public class MulList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("你想看几乘几的乘法表：");
		int  num=sc.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("%d*%d=%d   ",j,i,i*j);
			}
			System.out.println();
		}
			sc.close();
	}
}