/*String
3.	An Artificial Learning model training process includes data cleaning to store only useful data eliminating all the anomalies. 
The data is encrypted by reversing the whole data as the data is confidential and is to be stored safely.
Write java program to feed only alphabets removing anomalies to the model and also make ethe data encrypted. */


import java.util.*;
public class aimodel
{
 public static String reverseWord(String str){ 
 String words[]=str.split("\\s"); 
 String reverseWord=""; 
 for(String w:words){ 
 	StringBuilder sb=new StringBuilder(w);  sb.reverse(); 
 	reverseWord+=sb.toString()+" "; 
 } 
 return reverseWord.trim(); 
} 
public static void main(String args[])
{
String btr,ctr;
int i, j;
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the string : ");
btr = sc.nextLine();
for (i = 0; i < btr.length(); i++){
if (btr.charAt(i) < 'A' || btr.charAt(i) > 'Z' && btr.charAt(i) < 'a' || btr.charAt(i) > 'z')
{
btr = btr.substring(0, i) + btr.substring(i + 1);
i--;
}
}
System.out.print("\nRefined data : ");
System.out.print(btr);

ctr=reverseWord(btr);
System.out.println("\nData is Stored as:"); 
System.out.println(ctr); 
}
}
