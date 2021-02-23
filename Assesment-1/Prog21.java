import java.util.Scanner;
public class Prog21
{
	public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
 	while(true){
 	System.out.println("Press 0 to end");
 	System.out.println("Press 1 to add two numbers");
 	int c=sc.nextInt();
 		if(c==0){
 		System.out.println("ended");
 		break;
 	}
System.out.println("Enter 1st number:");
   int a=sc.nextInt();
System.out.println("Enter 2nd number:");
 	int b=sc.nextInt();
System.out.println("sum:");
	System.out.println(a+b);
    }
  }
}
