/* 15.	Write a program to simulate the situation of a self-service restaurant which displays order numbers on screen and call the order 
numbers on speakers once completed after worker enter the data into a machine called announcer. 
announcer takes 5 order details at a time and displays all those 5 details on screen and also calling them. 
Details of orders include starters main course Deserts mentioned by S, M, D. */

import java.util.*;
public class Restaurant{  
  
   public static < E > void printArray(E[] elements) 
{  
        for ( E element : elements)
	 {          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
    public static void main( String args[] ) 
	{  
        Integer[] intArray = { 171, 165, 174, 180, 179 };  
        Character[] charArray = { 'D', 'M', 'D', 'S', 'M' };  
  
	System.out.println( "Kindly collect your order" );
        System.out.println( "---ORDER NUMBERS---" );  
        printArray( intArray  );   
  
       System.out.println( "Starter or Maincourse or Desert:" );  
        printArray( charArray );   
    }   
}  
