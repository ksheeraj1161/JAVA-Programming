/* Lenovo multimedia companies testing team collects the new releasing laptop specifications (product id, screen size, RAM, weight) 
for quality test and sends it to the quality assurance (QA) department in a serialized manner. The QA departments deserialize the 
samples and checks if the length=15.6 inches, RAM= 4 Gb, weight=2 kgs. The product id of defective samples is stored in a set. 
The product id of correct samples is stored in another sort. Sort the correct samples in list.*/


// Serial.java
import java.io.*;
import java.lang.*;
import java.util.*;
public class Serial
{
 	public static void main(String[] args) {
int n;
 	System.out.println("Enter no of products :");
 	Scanner input=new Scanner(System.in);
 	n=input.nextInt();
 	List<product> list=new ArrayList<product>();
 for(int i=0;i<n;i++)
 {
 	System.out.println("Enter product "+(i+1)+" details");
 	product obj=new product();
 	obj.product_input();
 	list.add(obj);
 }
 try
 {
File file=new File("file.txt");
 FileOutputStream fileOutputStream=new FileOutputStream(file);
 ObjectOutputStream objOut=new ObjectOutputStream(fileOutputStream);
 objOut.writeObject(list);
 objOut.close();
 fileOutputStream.close();
 System.out.println("Serialized data is saved\n");
 } catch (Exception e) {
 System.out.println(e);
 }
 }
}
class product implements Serializable
{
 	private static final long serialVersionUID=1L; 
 	int id;
 	double screen_size;
 	double weight;
 	double RAM;
 void product_input()
 {
 	Scanner input=new Scanner(System.in);
System.out.print("\tEnter id:");
 	this.id=input.nextInt();
 	System.out.print("\tEnter screen_size:");
 	this.screen_size=input.nextDouble();
 	System.out.print("\tEnter RAM:");
 	this.RAM=input.nextDouble();
 	System.out.print("\tEnter weight:");
 	this.weight=input.nextDouble();
 }
 void Product_details()
 {
 	System.out.println("id : "+this.id);
 	System.out.println("length : "+this.screen_size);
 	System.out.println("weight: "+this.weight);
 }
}

// Deserial.java
import java.io.*;
import java.lang.*;
import java.util.*;
public class Deserial{
 public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
 	HashSet<Integer> Defectset=new HashSet();
 	HashSet<Integer> NoDefectset=new HashSet();
 try{
 ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));
 List<product> list=(List<product>)in.readObject();
 Iterator i=list.iterator();
 while(i.hasNext()){
 product p=(product)i.next();
 if(p.screen_size==15.6 && p.RAM==4 && p.weight==2){
 NoDefectset.add(p.id);
 }
 else{
 	Defectset.add(p.id);
 	}
 }
 Iterator ds=Defectset.iterator();
 System.out.println("Product ID of Defective products: ");
 while(ds.hasNext()){
 System.out.println("\t"+ds.next());
 }
 Iterator nds=NoDefectset.iterator();
 System.out.println("Product ID of Non Defective products: ");
 while(nds.hasNext()){
 System.out.println("\t"+nds.next());
 }
 in.close();
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
}
class product implements Serializable
{
 	private static final long serialVersionUID=1L;
 	int id;
 	double screen_size;
 	double weight;
 	double RAM;
 	void product_input()
 {
 Scanner input=new Scanner(System.in);
 System.out.print("\tEnter id:");
 this.id=input.nextInt();
 System.out.print("\tEnter screen_size:");
 this.screen_size=input.nextDouble();
 System.out.print("\tEnter RAM:");
 this.RAM=input.nextDouble();
 System.out.print("\tEnter weight:");
 this.weight=input.nextDouble();
 }
 void Product_details()
 {
 	System.out.println("id : "+this.id);
 	System.out.println("length : "+this.screen_size);
 	System.out.println("weight: "+this.weight);
 	}
}
