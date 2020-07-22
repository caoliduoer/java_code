public class Swap{
	 

	public static void main(String[] args) {
		int []str={1,2,3,4,4,5,6,98,4,77};
		int start=0;
		int end=str.length-1;
		while(start<end){
			if(str[start]%2==0){//偶数
				if(str[end]%2==1){//奇数
					str[start]^=str[end];
					str[end]^=str[start];
					str[start]^=str[end];
				}
				else{
					end--;
				}
			}else{start++;}
		}
		for(int i=0;i<str.length;i++){
		System.out.printf("%d   ",str[i]);
	}
	}
}