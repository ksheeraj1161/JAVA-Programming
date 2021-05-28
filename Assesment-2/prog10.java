import java.util.*; 
public class prog10{
public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);

    System.out.println("Enter the elements of the array: ");  
	int[] arr = new int[3];
	for(int i=0; i<3; i++)  
	{  
	arr[i]=sc.nextInt();  
	} 

System.out.println("Original Array: "+Arrays.toString(arr)); 
int[] new_arr = {arr[1], arr[2], arr[0]};
System.out.println("Rotated Array: "+Arrays.toString(new_arr)); 
}
}
