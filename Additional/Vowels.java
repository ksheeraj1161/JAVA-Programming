package alphabets;

public class Vowels {
	public void print(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) !='a' || s.charAt(i)!='e' || s.charAt(i) !='i' || s.charAt(i) !='o' || s.charAt(i) !='u')
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}