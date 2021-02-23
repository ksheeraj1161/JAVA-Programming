import java.util.*;
public class Prog8
{
	public static void main(String[] args) {
     System.out.println("Enter 4 digit number: ");
 	Scanner sc = new Scanner(System.in);
 	int n=sc.nextInt();
 	String s=Integer.toString(n);
System.out.println("sum : ");
System.out.println(Character.getNumericValue(s.charAt(0))+Character.getNumericValue(s.charAt(s.length()-1)));
	}
}
