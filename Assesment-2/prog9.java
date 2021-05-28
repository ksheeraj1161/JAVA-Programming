import java.util.*; 
public class prog9{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter the elements of the array: ");  
	int[] arr = new int[2];
	for(int i=0; i<2; i++)  
	{  
	arr[i]=sc.nextInt();  
	} 

System.out.println("Original Array: "+Arrays.toString(arr)); 
if(arr[0] == 4 || arr[0] == 7)
System.out.println("True");
else
 System.out.println(arr[1] == 4 || arr[1] == 7);
}
}