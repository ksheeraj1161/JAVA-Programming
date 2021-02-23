import java.util.*;
public class Prog13
{
	public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
     System.out.println("Enter n value:");

		int n=sc.nextInt();
System.out.println("Enter power value:");
		int p=sc.nextInt();
		int ans=1;
		for(int i=0;i<p;i++){
 		ans=ans*n;
	}
  System.out.println("Pth power of n");
	System.out.println(ans);
	}
}
