import java.util.*; 
public class prog11{
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
int max_val = arr[0];
if(arr[2] >= max_val)
max_val = arr[2];
System.out.println("Larger value between first and last element:"+max_val); 
}
}