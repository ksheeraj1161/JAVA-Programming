import java.util.*; 
class Southernrailway extends Exception
{
   Southernrailway (String s)
  {
    super(s);
  }
}
 class Railway
{
 int ch;
 String name;
 int age;
 String gender;
 void n() throws  Southernrailway
 {
   throw new Southernrailway  ("age and gender of the person is not matching with the norms of the agency for offer"); 
 };
 public void m()
  { 
   Scanner sc=new Scanner(System.in);
   System.out.print("\n1.Solo travel\n2.Couples\n");
   ch=sc.nextInt();
  switch(ch)
  {
    case 1:
        System.out.print("------enter details-----\n");
        sc.nextLine();
        System.out.print("enter name of passanger: ");
        this.name=sc.nextLine(); 
        System.out.print("enter gender of passanger: "); 
        this.gender=sc.nextLine();
        System.out.print("enter age of passanger: ");
        this.age=sc.nextInt();
        if(this.gender.equals("male") && this.age>=65)
        {
          System.out.println("Southern railway   offers 25% off on travel");
        }
        else if(this.gender.equals("female") && this.age>=60)
        {
        System.out.println("Southern railway  offers 10% off on travel");
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
         System.out.println("----enter details-----");
         Railway obm=new Railway(),obf=new Railway();   
         sc.nextLine();
         System.out.print("enter name of male passanger :   ");
         obm.name=sc.nextLine(); 
         System.out.print("enter age of male passanger :");
         obm.gender="male";
         obm.age=sc.nextInt();
         sc.nextLine();
         System.out.print("\nenter name of female passanger :   ");
         obf.name=sc.nextLine(); 
         System.out.print("enter age of female passanger :");
         obf.gender="female";
         obf.age=sc.nextInt();
         if(obf.age>=19 && obm.age>21)
         {
          System.out.println("Southern railway offers 5% off on travel");
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
    Railway ob =new Railway();
    ob.m();
  }
}