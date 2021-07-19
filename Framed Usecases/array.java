/* Construct an ATM pin re-validation for increasing the security. When card is inserted the login pin will be entered as first element by system. 
Allowing user to enter his pin for maximum of times. 
After user enters correct password and system lets him do the transaction, the system in backend computes second time if his passcode is same as the ATM pin popped 
from the system internally.*/

import java.util.*; 
public class ATM
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);  
System.out.print("System enters user Pin ");  

int[] array = new int[10];  

for(int i=0; i<5; i++)  
{  
System.out.print("Enter Your ATM Pin: ");  
array[i]=sc.nextInt();  
}  
System.out.println("After re-validation the pin is:");  

System.out.println (array[0] == array[array.length]); 
}
 }
