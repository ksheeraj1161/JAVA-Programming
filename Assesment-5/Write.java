import java.util.*;
import java.io.*;
class Write implements Serializable
{  
 public static void main(String args[])
 { 
  Student n=new  Student();
  try{  
  FileInputStream filein = new FileInputStream("f.ser");
  ObjectInputStream in=new ObjectInputStream(filein);  
  n=(Student)in.readObject();  
  in.close();  
  }catch(Exception e){System.out.println(e);} 
  if(n.cgpa>90)
  {
  n.grade='A';
  }
  else if(n.cgpa<90 &&n.cgpa>70 )
  {
  n.grade='B';
  }
  else if(n.cgpa>50 && n.cgpa<70)
  {
  n.grade='C';  
  }
  else
  {
  n.grade='F';  
  }
  System.out.println("Grade of the student is "+n.grade);
 }  
}  