public class hello{
	public static void main(String[] args){
	System.out.println("great");
	int a=5;
	int b=3;
	int c=a;
	a=b;
	b=c;
	System.out.println("使用三个变量交换值");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("使用二个变量交换值");
	a^=b;
	b^=a;
	a^=b;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
	
}