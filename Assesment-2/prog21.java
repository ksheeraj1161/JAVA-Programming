import java.util.*;
class prog21
{
  String emp_name;
  int emp_id;
  float salary;
  String date;
  public void get()
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("\n Enter employee name :");
   this.emp_name=sc.nextLine();
   System.out.print("\n Enter employee id :");
   this.emp_id=sc.nextInt();
   System.out.print("\n Enter employee salary :");
   this.salary=sc.nextFloat();
   System.out.print("\n Enter employee joining date :");
   sc.nextLine();
   this.date=sc.nextLine();
 }
  public void displayless()
  {
    if(this.salary<100000.00f)
    {
       System.out.println("Name of employee :"+ this.emp_name);
       System.out.println("Employee id  : "+ this.emp_id);
    }
  }

  public void display()
  {
     System.out.println("name of employee :"+ this.emp_name);
     System.out.println("employee id  : "+ this.emp_id);
     System.out.println("employee salary : "+ this.salary);
  }
  public static void main(String args[])
  {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.print("\n enter number of employee:");
     n=sc.nextInt();
     prog21[] obj= new prog21[n];
     for(int i=0;i<n;i++)
    {
      System.out.println("\n employee no :"+ (i+1));
      obj[i]=new prog21();
      obj[i].get();
    }
     System.out.println("\nEmployee whose salary is less than INR 100000/-");
     for(int i=0;i<n;i++)
    {
      obj[i].displayless();
    }
     System.out.println("employees list after sorting --------");
     prog21 temp=new prog21();
    for(int i=0;i<n;i++)
     {
       for(int j=0;j<n;j++)
      {
       if(obj[i].salary<obj[j].salary)
        {
            temp=obj[i];
            obj[i]=obj[j];
            obj[j]=temp;
        }
      } 
    }
     for(int i=0;i<n;i++)
    {
      obj[i].display();
    }
  }
}