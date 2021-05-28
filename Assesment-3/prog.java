import pack1.Words;
import pack1.pack2.Length;
import java.util.*;
class prog
{
   public static void main(String args[])
    {  
        String s;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string :");
        s=sc.nextLine();
	Words obj = new Words();
	obj.countNumWords(s);
	Length abc = new Length();
	abc.strLength(s);
     }
}
