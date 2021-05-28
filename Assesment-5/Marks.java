import java.util.*;
class Professor extends Exception
{
  Professor(String s)
   {
     super(s);
   }
}
class Marks
{
  int[] catarray;
  int[] Quizarray;
  void n() throws Professor
  {
    throw new Professor("cat marks range should be  0 to 100");
  };
  void m() throws Professor
  {
    throw new Professor("Quiz marks range should be  0 to 10");
  }
  public void mn()
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter no.of students:");
    n=sc.nextInt();
    catarray=new int[n];
    Quizarray=new int[n]; 
    System.out.println("enter cat marks of students:");
    for(int i=0;i<n;i++)
    {
       catarray[i]=sc.nextInt();
       if(catarray[i]<0||catarray[i]>100)
       {
          try
           {
            n();  
           }catch(Exception e){System.out.println(e);}
       }
    }
    System.out.println("enter Quiz marks of students:");
    for(int i=0;i<n;i++)
    {
       Quizarray[i]=sc.nextInt();
       if(Quizarray[i]<0||Quizarray[i]>10)
       {
          try
           {
            m();  
           }catch(Exception e){System.out.println(e);}
        }
     }
   }
   public static void main(String args[])
   {
       Marks ob =new Marks();
       ob.mn();
   }
}