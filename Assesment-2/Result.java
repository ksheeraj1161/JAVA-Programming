import java.util.*;
class Student
{
  String reg_num;
  String name;
  public void details()
   {
      Scanner sc =new Scanner(System.in);
      System.out.println("Name of student :");
      this.name =sc.nextLine();
      System.out.println("Regno of student :");
      this.reg_num=sc.nextLine();   
   }
}
class Exam extends Student
{
  float marks[]=new float[6];
  public void get()
   {
      Scanner sc =new Scanner(System.in);
      System.out.println("Marks of student in 6 subjects :");
      for(int i=0;i<6;i++)
      {
        this.marks[i]=sc.nextFloat();
      }
   }
  
}
class Result extends Exam
{
  float total_marks=0.0f;
  public float marks()
 {
  for(int i=0;i<6;i++)
  {
    this.total_marks=this.total_marks+this.marks[i];
  }
  return total_marks;
 } 
 public static void main(String args[])
 {
   int n;
   System.out.println("Number of students :");
   Scanner sc =new Scanner(System.in);
   n=sc.nextInt();
   float fina=0.0f;
   Result[] obj=new Result[n];
   for(int i=0;i<n;i++)
    {
     System.out.println("\nDetails of student " + (i+1) + "\n");
     obj[i]=new Result();
     obj[i].details();
     obj[i].get();
    }
 for(int i=0;i<n;i++)
    {
     fina=obj[i].marks();
     System.out.println("name  of student is : "+obj[i]. name);
     System.out.println("regno of student is : "+ obj[i].reg_num);
     System.out.println("total marks of student is : "+ fina);
     } 
 }
}