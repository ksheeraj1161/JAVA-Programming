import java.util.*;

public class Prog3
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

   		 System.out.print("Enter Two Numbers : ");
    		int a =sc.nextInt();
    		int b =sc.nextInt();
	
		int c=0;
		for(int i=0;i<b; i++){
 			c=c+a;
		}
		System.out.println(c);
	}
}
