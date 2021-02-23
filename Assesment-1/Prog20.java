import java.util.Scanner;
public class Prog20
{
	public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value:");
 	int n=sc.nextInt();
 	for(int i=1;i<11;i++){
 		System.out.println(n+" * "+i+" = "+n*i);
	}
	}
}
