/*Simulate a product exchange website mechanism (ex: OLX) by defining a class ‘Seller’ to store Name, age, Address, Contact number,
categories, date of last shipment of a Product seller on the exchange site. 
Create ‘n’ objects of this class for all the regular sellers on the portal and write these objects to a file. 
Read these objects from the file and display only those seller details who sells ‘Electronics’ category and had not shipped a product for the recent six months.*/

java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Seller {
 private String name;
 private String age;
 private String address;
 private String number;
 private String category;
 private String date;
 public static void main(String[] args) throws IOException, ParseException{
 Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the value of n : ");
 	int n = sc.nextInt();
 	Seller arr[] = new Seller[n];
 for(int i=0;i<n;i++)
 {
 arr[i] = new Seller();
 System.out.println("Enter Name : ");
 arr[i].name=sc.next();
 System.out.println("Enter Age : ");
 arr[i].age=sc.next();
 System.out.println("Enter Address : ");
 arr[i].address=sc.next();
 System.out.println("Enter Number : ");
 arr[i].number=sc.next();
 System.out.println("Enter category : ");
 arr[i].category=sc.next();
 System.out.println("Enter Date DD/MM/yyyy format: ");
 arr[i].date=sc.next();
 }
 BufferedWriter bf = new BufferedWriter(new
FileWriter("C:/vit/kandra ksheeraj/DA/file2.txt"));
 for(int i=0;i<n;i++)
 {
 	bf.write(arr[i].name+'\n');
 	bf.write(arr[i].age+'\n');
 	bf.write(arr[i].address+'\n');
 	bf.write(arr[i].number+'\n');
 	bf.write(arr[i].category+'\n');
 	bf.write(arr[i].date+'\n');
 	}
 BufferedReader br = new BufferedReader(new
FileReader("C:/vit/kandra ksheeraj/DA/file2.txt"));
 String a = br.readLine();
 while(a!=null){
 String[] data = new String[6];
 for(int i=0;i<6;i++){
 	data[i]=a;
 	a=br.readLine();
 }
 String dat = data[5];
 Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dat);
 Date now = new Date();
 long difference = (now.getTime()-d.getTime())/86400000;
 long month = difference/30;
 if(data[4].equals("A+") && Math.abs(month)>=6 ){
 System.out.println("details who sells 'Electronics' category and had not shipped a product for the recent six months.");
 System.out.println("Name:"+data[0]);
 System.out.println("Age:"+data[1]);
 System.out.println("Address:"+data[2]);
 System.out.println("Number:"+data[3]);
 System.out.println("Category:"+data[4]);
 System.out.println("Date:"+data[5]);
 	}
 }
 bf.close();
 }
}

