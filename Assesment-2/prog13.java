import java.util.*; 
public class prog13{
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
System.out.println("Original Array: "+Arrays.toString(arr)); 
int max_val = arr[0];
if(max_val <= arr[arr.length-1])
max_val = arr[arr.length-1];
if(max_val <= arr[arr.length/2])
max_val = arr[arr.length/2];
System.out.println("Largest element between first, last, and middle values: "+max_val); 
}
}
