import java.util.*;
interface sum
{  
 void sum(int n);
}  
interface fact
{  
 void comp(int n);
}  
class Multinterface implements sum,fact
{  
   public void sum(int n)
   {
      int s = 0;
      for (int i = 0; i<n; i++)
        {
           s = s+i;
        }
      System.out.println("Sum of "+ n +" natural numbers: "+s);
    }
    public void comp(int n)
     {
        int i,f=1;      
        for(i=1;i<=n;i++)
       {    
          f=f*i;    
        }    
        System.out.println("Factorial of "+n+": "+f);
      }
   public static void main(String args[])
    {  
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("Enter the number :");
         n=sc.nextInt();
         Multinterface obj = new Multinterface();  
         obj.sum(n);  
         obj.comp(n);  
 }  
}
