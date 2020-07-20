import java.util.Scanner;
public class SignIn{
	public static void main(String[] args) {
		//String password="new String";
		int i=0;
		for( i=3;i>0;i--){
			Scanner sc=new Scanner(System.in);
			System.out.println("plesse enter your password:");
			String a=sc.nextLine();
			if(a.equals("894871274")){
				System.out.println("sign up succeed!");
				break;
			}else{
				System.out.println("your password is wrong!you own times "+i);
			}

		}if(i==0){
			System.out.println("times runs up!");

		}
	}
}