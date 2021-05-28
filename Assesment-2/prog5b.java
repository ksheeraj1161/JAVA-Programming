import java.util.*;
public class prog5b{ 
public static void toBinary(int decimal){    
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();//new line  
}    
public static void main(String args[]){   
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter a decimal number:");
            int n=s.nextInt();

System.out.println("correaponding binary: ");  
toBinary(n);    
}} 

