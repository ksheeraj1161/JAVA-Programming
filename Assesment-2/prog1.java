import java.util.*;
public class prog1{ 
public static void thirdLargest(int arr[], int arr_size) 
{ 	
    if (arr_size < 3) 
    { 
        System.out.printf(" Invalid Input "); 
        return; 
    } 
  
    int first = arr[0]; 
    for (int i = 1; i < arr_size ; i++) 
        if (arr[i] > first) 
            first = arr[i]; 
  
    int second = Integer.MIN_VALUE; 
    for (int i = 0;  i < arr_size ; i++) 
        if (arr[i] > second &&  
            arr[i] < first) 
            second = arr[i]; 

    int third = Integer.MIN_VALUE; 
    for (int i = 0;  i < arr_size ; i++) 
        if (arr[i] > third &&  
            arr[i] < second) 
            third = arr[i]; 
  
    System.out.printf("The third Largest " +  "element is %d", third); 
} 
  
public static void main(String []args) 
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
    thirdLargest(arr, n); 
} 
} 