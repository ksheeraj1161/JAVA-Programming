/* Implement a Medication app for Alzheimer's patients creating a User Defined Exception. 
Assign different values to the String variable based on the value of time in hours. 
Greet patient Good Morning, Good Afternoon and Good Night by showing the current time. 
Prompt medication remainder if time is between 7 and 12, set String variable to “Have Breakfast and take Donepezil pills”. 
Raise Exception “Have Lunch and take Galantamine pills”, if time is between 12 and 16. If time is between 16.00 and 17.30, set String variable as “Go for a walk” and finally, if String variable does not satisfy all the above condition, prompt “Take Rivastigmine pills before going to sleep”.
*/

import java.lang.*;
import java.util.*;
import java.text.SimpleDateFormat;
class MedicApp{
public static void main(String[] arg){
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 SimpleDateFormat HourFormatter = new SimpleDateFormat("HH");
 SimpleDateFormat MinFormatter = new SimpleDateFormat("mm");
 Date date = new Date();
 int Hours=Integer.parseInt(HourFormatter.format(date));
  int Min=Integer.parseInt(MinFormatter.format(date));
 try{
 	if(Hours>=7 && Hours<12){
 	System.out.print("Good Morning ");
 	System.out.print(formatter.format(date));
 throw new MedicationException("Have Breakfast and take Donepezil pills");
 }
 else if(Hours>=12 && Hours<16){
 	System.out.println("Good Afternoon ");
 	System.out.print(formatter.format(date));
 throw new MedicationException("Have Lunch and take Galantamine pills");
 }
 else if(Hours>=16 && (Hours+(Min+30)/60)<19){
 	System.out.print("Good Evening ");
 	System.out.print(formatter.format(date));
 throw new MedicationException("Go for a walk");
 }
 else{
 	System.out.print("Good Night ");
 	System.out.print(formatter.format(date));
 throw new MedicationException("Take Rivastigmine pills before going to sleep");
 }
 }
 catch(MedicationException e){
 	System.out.println("\n\n\tTake Medication :");
 	System.out.println("\t"+e);
 }
}
}
class MedicationException extends Exception{
MedicationException(String s){
super(s);
}
}
