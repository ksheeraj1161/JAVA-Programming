import java.util.Scanner;
public class Prog19
{
	public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value:");
 	int n=sc.nextInt();
  System.out.println("Sum of squares till n:");
 	System.out.println(n*(n+1)*(2*n+1)/6);
	}
}
