import java.util.*;
import java.io.*;
class Student implements Serializable
{
 String name;
 String reg_no;
 float cgpa;
 String proctor;
 char grade;
 void get()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter  name of student : ");
  String name = sc.nextLine();
  System.out.print("\n enter reg number of student : ");
  this.reg_no=sc.nextLine();
  System.out.print("\n enter cgpa : ");
  this.cgpa=sc.nextFloat();
  sc.nextLine();
  System.out.print("Enter name of proctor : ");
  String proctor = sc.nextLine();
 }
 public static void main(String args[])
 {
   Student object=new  Student();
   object.get();
   try
        {
           FileOutputStream file = new FileOutputStream("f.ser");
           ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
   }
}
