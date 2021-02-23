import java.util.*;
public class Prog11
{
	public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int fact=2;
	System.out.println("Factorial:");
	for(int i=3;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
  }
}
