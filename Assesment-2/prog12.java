import java.util.*; 
public class prog12{
public static void main(String[] args)
{
 	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the array: ");  
	int[] arr = new int[3];
	for(int i=0; i<3; i++)  
	{  
	arr[i]=sc.nextInt();  
	} 
System.out.println("Original Array: "+Arrays.toString(arr)); 
int x = arr[0];
arr[0] = arr[2];
arr[2] = x;
System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arr)); 
}
}
