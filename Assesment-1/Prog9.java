import java.util.*;
public class Prog9
{
	public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value:");
 	int n=sc.nextInt();
 	int temp=n;
 	String s=Integer.toString(n);
 	int l=s.length();
 	int sum=0;
 	while(n!=0) {
 	  sum=sum+(int)Math.pow(n%10,l);
 	  n=n/10;
	}
 	if(temp==sum)
 		System.out.println("Yes it is Amstrong");
 	else
 		System.out.println("Not Amstrong");
	}
}
