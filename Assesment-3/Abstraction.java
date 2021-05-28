import java.util.*;
abstract class Student 
 {
 String name;
 String status;
 long telephone;
 String fees;
 abstract void amount();  
  void get()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("\nName : ");
    this.name=sc.nextLine();
    System.out.print("\nTelephone: ");
    this.telephone=sc.nextLong();
  } 
 } 
 class FullTimeStudent extends Student
 {
  void amount()
  {
    this.status="Full time student";
    this.fees="$2000.00";
    System.out.println("Name : "+ this.name +"\nStatus : "+ this.status +"\nTelephone: "+ this.telephone + "\nTution-fees: "+this.fees );
  }
 }
  class PartTimeStudent extends Student
  {
   void amount()
   {
     this.status="Part time student";
     this.fees="$200.00";
     System.out.println("Name : "+ this.name +"\nStatus : "+ this.status +"\nTelephone: "+ this.telephone +"\nTution-fees: "+this.fees);
   }
  }
class Abstraction 
{

   public static void main(String args[])
 {  
   System.out.println("1.Full time student\n2.Part time student\nselect your status :");
    int ch;
    Scanner sc=new Scanner(System.in);
    ch=sc.nextInt();
    switch(ch)
   {
      case 1:
        Student fc =new FullTimeStudent();
        fc.get();
        fc.amount();
        break;
      case 2:
        Student tc =new PartTimeStudent();
        tc.get();
        tc.amount();
        break;
    }  
 }  
}