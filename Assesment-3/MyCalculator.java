import java.util.*;
class MyCalculator
{
  public long power(int n, int p)throws Exception
  {
    long pow;
    if(n<0 || p<0)
     {
       try
        {
            throw new Exception("n and p should not be negative");
        }
        catch(Exception e)
        {
            throw e; 
        }
     }
    else if(n==0 || p==0)
     {
       try
        {
            throw new Exception("n and p should not be be zero");
        }
        catch(Exception e)
        {
            throw e;
        }
     }
    else
    {
      return((long)Math.pow(n,p));
    }
  }
  public static void main(String args[])
  {
    long temp;
    int p,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n");
    n=sc.nextInt();
    System.out.println("Enter value of p");
    p=sc.nextInt();
    MyCalculator obj =new MyCalculator();
    try
    {
       temp=obj.power(n,p);
       System.out.println(n+"  to the power of  "+ p + " =  "+ temp);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
 
}
