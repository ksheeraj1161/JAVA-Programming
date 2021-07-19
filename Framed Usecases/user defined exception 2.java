/*8.	Design a class to display the schedule of flytes in samshabad international airport. 
The class has its own member variable like flyte_no, src, dest, time, traveltime, terminalno, traveltype (A-Arrival, D-Departure). 
Create an array of objects in main function with possibility to take flyteno as input and perfrom a search with all objects. 
If found display all variable details of the class like flyte_no, src, dest, time, traveltime, terminalno, traveltype. 
If not found throw arrayIndexOutofBound exception and handle it.  Also include taking the input of sorting type based on time & flyte. 
If the user enters other sorting type, throw arithematic or arrayIndexOutofBound exception and handle it.
*/

import java.util.Scanner;
class Flyte {
int flyte_no;
String source;
String dest;
int time;
 int travel_time;
 int terminal_no;
 char travel_type;
 public Flyte(int flyte_no, String source, String dest, int time, int travel_time, 
int terminal_no, char travel_type) 
{
 this.flyte_no = flyte_no;
 this.source = source;
 this.dest = dest;
 this.time = time;
 this.travel_time = travel_time;
 this.terminal_no = terminal_no;
 this.travel_type = travel_type;
 	}
}
public class airport 
{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Flyte arr[] = new Flyte[5];
 for (int i = 0; i < 5; i++) {
 System.out.println("Enter the flyte no for"+(i+1));
 int flyte_no = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter the Source"+(i+1));
 String source = sc.nextLine();
 System.out.println("Enter the destination"+(i+1));
 String dest = sc.nextLine();
 System.out.println("enter the time"+(i+1));
 int time = sc.nextInt();
 System.out.println("enter the travel time"+(i+1));
 int travel_time = sc.nextInt();
 System.out.println("enter the terminal number"+(i+1));
 int terminal_no = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter the tavel type Arrival/Departure");
 char travel_type = sc.nextLine().trim().charAt(0);
 arr[i] = new Flyte(flyte_no, source, dest, time, travel_time, terminal_no, travel_type); 
 }
 System.out.println("Enter the flyte number to search for the flyte");
 int flytesearch=sc.nextInt();
 airport we=new airport();
 we.SearchFunction(flytesearch,arr);
 System.out.println("Enter a flyte number to sort in accordance with it");
 flytesearch=sc.nextInt();
 we.SortFunction(flytesearch,arr);
 }
 public boolean SearchFunction(int flyte,Flyte arr[])
 {
 	int count=0;
 for(int i=0;i<5;i++)
 {
 	if(arr[i].flyte_no==flyte)
 {
 count=1;
 System.out.println(arr[i].flyte_no);
 System.out.println(arr[i].source);
 System.out.println(arr[i].dest);
 System.out.println(arr[i].time);
 System.out.println(arr[i].travel_time);
 System.out.println(arr[i].travel_type);
 return true;
 }
 }

 try {
 if (count == 0) {
 throw new ArrayIndexOutOfBoundsException();
 	}
 }
 catch (ArrayIndexOutOfBoundsException e)
 {
 System.out.println("The givenn flyte number was not found");
 return false;
 }
 return false;
 }
 public void SortFunction(int flyte,Flyte arr[])
 {
 boolean a=SearchFunction(flyte,arr);




 if(a) {
 for (int i = 0; i < 5; i++) {
 for(int j=i+1;j<4;j++)
 {
 if(arr[j].flyte_no<arr[i].flyte_no)
 {
 Flyte swap=arr[i];
 arr[i]=arr[j];
 arr[j]=swap;
 		}
 	}
 }
 System.out.println("Sorted Succesfully");
 System.out.println("Printing the sorted array");
 for(int i=0;i<5;i++)
 {
 	System.out.println(arr[i].flyte_no);
 	System.out.println(arr[i].source);
 	System.out.println(arr[i].dest);
 	System.out.println(arr[i].time);
 	System.out.println(arr[i].travel_time);
 	System.out.println(arr[i].travel_type);
 	}
 }
 else
 {
 try
 {
 throw new ArithmeticException();
 }
 catch (ArithmeticException e)
 {
 System.out.println("The given entry was invalid");
 		}
 		}
 	} 
}
