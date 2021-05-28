import java.util.*;
class Simple
{
 synchronized void fib() 
 {
    int n=50;
    long firstTerm = 0, secondTerm = 1;
    for (int i = 1; i <= n; ++i) 
     {
      System.out.print(firstTerm + ", ");
      long nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
      if(i==29)
       {
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        try{wait();}catch(Exception e){}
       }
     }
 }
 synchronized void natural()
 {
  System.out.print("\n");
  for(int i=0;i<15;i++)
  {
    System.out.print((i+1)+" ");
  }
   System.out.print("\n");
   notify();
  }
} 
class Fibonacci
{
 public static void main(String args[])
 {
  final Simple sa =new Simple();
  Thread t1=new Thread()
  {
    public void run()
    {
       sa.fib();
    }
  };
  Thread t2=new Thread()
  {
    public void run()
    {
       sa.natural();
    }
  };
  t1.setPriority(9);
  t2.setPriority(5);
  t1.start();
  t2.start();
 }
}