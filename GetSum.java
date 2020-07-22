import java.util.Scanner;
public class GetSum{
	public static int Sum(int n){
		int i=0;
		int sum=0;
		for(i=1;i<=n;i++){
			int mul=1;
			for(int j=1;j<=i;j++ ){
					mul*=j;
			}
			 sum+=mul;
		}return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Sum(num));
		

	}
}