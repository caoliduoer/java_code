import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[] ;
        s=str.split("[;,]");
        long number=Long.parseLong(s[0]);
        double score1=Double.parseDouble(s[1]);
        double score2=Double.parseDouble(s[2]);
        double score3=Double.parseDouble(s[3]);
        System. out.println("The each subject score of  No. "+number+" is "+String.format("%.2f",score1)+", "+String.format("%.2f",score2)+", "+String.format("%.2f",score3)+".");
    }
}