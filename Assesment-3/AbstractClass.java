import java.util.*;
abstract class Student2 
 {
 String name;
 String status;
 long telephone;
 String fees;
 abstract void amount();  
  void get()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Name : ");
    this.name=sc.nextLine();
    System.out.print("Telephone: ");
    this.telephone=sc.nextLong();
  } 
 } 
 class FullTimeStudent2 extends Student2
 {
  void amount()
  {
    System.out.println("Name : "+ this.name +"\nStatus : "+ this.status +"\nTelephone: "+ this.telephone + "\nTution fees: "+this.fees );
  }
 }
  class PartTimeStudent2 extends Student2
  {
   void amount()
   {
     System.out.println("Name : "+ this.name +"\nStatus : "+ this.status +"\nTelephone: "+ this.telephone +"\nTution fees: "+this.fees);
   }
  }
class AbstractClass
{

   public static void main(String args[])
 {  
   System.out.println("1.Full time student\n2.Part time student\nselect your status :");
    int ch;
    Scanner sc=new Scanner(System.in);
    ch=sc.nextInt();
    Student2 fc =new FullTimeStudent2();
    Student2 tc =new PartTimeStudent2();
    switch(ch)
   {
      case 1:
        fc.status="Full time student";
        fc.fees="$2000.00";
        fc.get();
        break;
      case 2:
        tc.status="Part time student";
        tc.fees="$200.00";
        fc.get();
        break;
    } 
  System.out.println("------------------");
  System.out.println("FullTimeStudent:");
  fc.amount();
  System.out.println("------------------");
  System.out.println("PartTimeStudent:");
  tc.amount(); 
 }  
}