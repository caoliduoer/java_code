import java.util.Scanner;
public class age{
	public static void main(String[] args) {
		System.out.println("请输入你的年龄：");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<=18){
			System.out.println("当前年龄的人是少年");
		}
		else if(age<=28&&age>18){
			System.out.println("当前年龄的人是青年");
		}
		else if(age<=55&&age>29){
			System.out.println("当前年龄的人是中年");
		}
		else if(age>=56){
			System.out.println("当前年龄的人是老年");
		}
		else{
		System.out.println("输入错误！");
		}
	}
}