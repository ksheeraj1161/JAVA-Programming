import java.util.*; 
public class prog8{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the elements of the array1: ");  
	int[] array1 = new int[3];
	for(int i=0; i<3; i++)  
	{  
	array1[i]=sc.nextInt();  
	} 
     System.out.println("Enter the elements of the array2: ");  
	int[] array2 = new int[3];
	for(int i=0; i<3; i++)  
	{  
	array2[i]=sc.nextInt();  
	} 

System.out.println("Array1: "+Arrays.toString(array1)); 
System.out.println("Array2: "+Arrays.toString(array2)); 
 int[] array_new = {array1[0], array2[2]};
System.out.println("New Array: "+Arrays.toString(array_new)); 
}
}