import java.util.*; 
class TravelException extends Exception
{
   TravelException(String s)
  {
    super(s);
  }
}
 class HandlingExceptions
{
 int ch;
 int age;
 String gender;
 void n() throws TravelException
 {
   throw new TravelException ("The age and gender of the person is not matching with the norms of the agency to give concession"); 
 };
 public void m()
  { 
   Scanner sc=new Scanner(System.in);
   System.out.print("\n1.Solo travel\n2.Couples\n");
   ch=sc.nextInt();
  switch(ch)
  {
    case 1:
        System.out.print("\nEnter details of solo passenger\n");
        sc.nextLine();
        System.out.print("Enter gender of passenger :   "); 
        this.gender=sc.nextLine();
        System.out.print("\nEnter age of passenger :");
        this.age=sc.nextInt();
        if(this.gender.equals("male") && this.age>=65)
        {
          System.out.println("Travel agency offers 15% off on travel");
        }
        else if(this.gender.equals("female") && this.age>=60)
        {
        System.out.println("Travel agency offers 20% off on travel");
        }
       else
       {
         try
         {
          n();
         }
         catch(Exception e)
         {
           System.out.println(e);
         }
        } 
        break;
    case 2:
         System.out.println("Enter details of Couples");
         HandlingExceptions obm=new HandlingExceptions(),obf=new HandlingExceptions();
         System.out.println("Enter age of male passanger :");
         obm.gender="male";
         obm.age=sc.nextInt();
         System.out.println("Enter age of female passanger :");
         obf.gender="female";
         obf.age=sc.nextInt();
         if(obf.age>=19 && obm.age>21)
         {
          System.out.println("Travel agency  offers 10% off on travel");
         }
         else
         {
           try
           {
            n();
           }
         catch(Exception e)
         {    
          System.out.println(e);
         }
        }
        break;   
     }   
  }
   public static void main(String args[])
  {
    HandlingExceptions ob =new HandlingExceptions();
    ob.m();
  }
}
