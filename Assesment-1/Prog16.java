import java.util.*;
public class Prog16
{
public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
 	int n=sc.nextInt();
 	if(n%3==0 && n%5==0){
 	System.out.println("Yes,it is divisible by 3 and 5");
 	}
 else{
 	System.out.println("Not divisible by 3 and 5");
 	}
    }
}
