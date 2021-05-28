import java.util.*;
public class prog7 {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
	int n =sc.nextInt();
    System.out.println("Enter the elements of the array1: ");  
	int[] array1 = new int[7];
	for(int i=0; i<n; i++)  
	{  
	array1[i]=sc.nextInt();  
	} 
     System.out.println("Enter the elements of the array2: ");  
	int[] array2 = new int[7];
	for(int i=0; i<n; i++)  
	{  
	array2[i]=sc.nextInt();  
	} 

 if(array1.length>=2 && array2.length>=2)
 {
 System.out.println(array1[0] == array2[0] || array1[array1.length-1] == array2[array2.length-1]);
 }
 else
 {
 System.out.println("Array lengths less than 2.");
 }
}
}