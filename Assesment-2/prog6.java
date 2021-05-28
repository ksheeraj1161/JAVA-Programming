import java.util.*;
public class prog6{
public static void main(String[] args)
{    
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
	int n =sc.nextInt();
    System.out.println("Enter the elements of the array: ");  
	int[] arr = new int[10];
	for(int i=0; i<n; i++)  
	{  
	arr[i]=sc.nextInt();  
	} 
 System.out.println (arr.length >= 2 && arr[0] == arr[arr.length-1]);
}
}