import java.util.*;
public class prog14{
 public static void main(String[] args){
 String result = ""; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
	int n =sc.nextInt();
    System.out.println("Enter the elements of the array1: ");  
	int[] array1 = new int[4];
	for(int i=0; i<n; i++)  
	{  
	array1[i]=sc.nextInt();  
	} 
     System.out.println("Enter the elements of the array2: ");  
	int[] array2 = new int[4];
	for(int i=0; i<n; i++)  
	{  
	array2[i]=sc.nextInt();  
	} 

 System.out.println("\nArray1: "+Arrays.toString(array1)); 
 System.out.println("\nArray2: "+Arrays.toString(array2)); 
 for (int i = 0; i < array1.length; i++) {
int num1 = array1[i];
int num2 = array2[i];
result += Integer.toString(num1 * num2) + " "; 
}
System.out.println("\nResult: "+result); 
}
}
