public class accountNumber{
	public static void main(String[] args) {
		double sum=0;
		for(double i=1.0;i<=100;i++){
			if(i%2==0){
				sum-=(1/i);
			}
			else{
				sum+=(1/i);
			}
		}
		System.out.println(sum);
	}
}