/*A Temple having problem with unmanaged huge crowd wants to sort darshan tickets according to devotee names and also their ticket numbers to decrease crowding at temple. 
  Simulate task of a ticket counter taking input of devotees as list and sorting them separately to allow then in a sorted manner instead of first come first serve basis.*/

import java.util.*;  
public class temple{  
 public static void main(String args[]){  
   
  Scanner sc=new Scanner(System.in);
  	int n;
  	System.out.println("Enter number of devotees: ");
 	n=sc.nextInt();
 	
System.out.print("\nEnter devotee name: ");
  List<String> list1=new ArrayList<String>(); 
 	String d;
	
 	for(int i=0;i<n+1;i++){
	d=sc.nextLine();
 	 list1.add(d); 
}
    
   System.out.print("\nsorted names: \n");
  Collections.sort(list1);  
    
  for(String devotee:list1)  
    System.out.println(devotee);  
      
  List<Integer> list2=new ArrayList<Integer>(); 
  	int m; 
	System.out.print("\nEnter ticket number: ");
  	for(int i=0;i<n;i++){
	m=sc.nextInt();
  	list2.add(m);
}
    
	System.out.print("\nsorted ticket numbers: \n");
  Collections.sort(list2);  
   
  for(Integer number:list2)  
    System.out.println(number);  
 }  
   
}  
