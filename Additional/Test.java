import java.util.*;
import alphabets.*;
public class Test {
	public static void main(String args[]) {
alphabets.Consonents ons= new alphabets.Consonents();
alphabets.Vowels bns= new alphabets.Vowels();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int alpha_type=sc.nextInt();
		if(alpha_type==1) 
			bns.print(s);
		else 
			ons.print(s);
	}
}