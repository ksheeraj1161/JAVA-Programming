import java.util.*;
import java.io.*;
class CovaxinVaccineCamp  implements Serializable
{
 int emp_id;
 String name;
 int age;
 String address;
 long mobileno;
 String bgroup;
 String allergy;
 String date;
 void get()
 {
   Scanner sc =new Scanner(System.in);
   System.out.print("\nEnter employee id :");
   this.emp_id=sc.nextInt();
   System.out.print("Enter name of employee :");
   this.name=sc.next();
   System.out.print("Enter age of employee :");
   this.age=sc.nextInt();
   System.out.print("Enter address of employee : ");
   this.address=sc.next();
   System.out.print("Enter mobile no of employee : ");
   this.mobileno=sc.nextLong();
   System.out.print("Enter blood group of employee : ");
   this.bgroup=sc.next();
   System.out.print("Enter yes if employee has any allergies else no ");
   this.allergy=sc.next();
   System.out.print("Enter Date of employee vaccinated : ");
   this.date=sc.next();
 }
 void print()
 {
   System.out.println("employee id : "+this.emp_id);
   System.out.println("name of employee : "+ this.name);
   System.out.println("age of employee : "+this.age);
   System.out.println("address of employee : "+ this.address);
   System.out.println("mobile no of employee : "+this.mobileno);
   System.out.println("blood group of employee : "+this.bgroup);
   System.out.println("previous allergies history : "+this.allergy);
   System.out.println("Date of employee vaccinated : "+this.date);
 }  
}
class Covaxin
{
  public static void main(String args[])
 {
   int n;
   Scanner sc =new Scanner(System.in);
   System.out.println("enter no.of employess :");
   n=sc.nextInt();
   CovaxinVaccineCamp[] v =new CovaxinVaccineCamp[n];
   for(int i=0;i<n;i++)
   {
    v[i]=new CovaxinVaccineCamp();
    System.out.print("\nenter Details of Employee "+ (i+1) );
    v[i].get();
   }
  try
    {
     FileOutputStream fos =new FileOutputStream("abc.ser");
     ObjectOutputStream oos =new ObjectOutputStream(fos);
     for(int i=0;i<n;i++)
     {
       oos.writeObject(v[i]);
     }
      oos.close();
      fos.close();
    }catch(Exception e){
      System.out.println("caught");
    }

  try
    {
     FileInputStream fis =new FileInputStream("abc.ser");
     ObjectInputStream ois =new ObjectInputStream(fis);
     for(int i=0;i<n;i++)
     {
      CovaxinVaccineCamp a= null;
      a=(CovaxinVaccineCamp)ois.readObject();
      if(a.allergy.equals("yes"))
        {
      System.out.print("\n----Details of Employee- has alergies------\n");
          a.print();
        }
     }
      ois.close();
      fis.close();
    }catch(Exception e){
      System.out.println("caught");
    }
 }
}