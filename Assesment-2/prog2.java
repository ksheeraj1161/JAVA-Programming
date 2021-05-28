import java.util.*;
class prog2
{
      String name;
      String reg_no;
      float cgpa;
      String programe;
      String school;
      String proctor;
      public void get()
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter first name of student : ");
      String firstName = sc.nextLine();
      System.out.print(" Enter middle name of student : ");
      String middleName = sc.nextLine();
      System.out.print(" Enter last name of student : ");
      String lastName = sc.nextLine();
      StringBuffer fullName = new StringBuffer();
      fullName.append(firstName);
      fullName.append(" ");  
      fullName.append(middleName);
      fullName.append(" ");
      fullName.append(lastName);
      this.name=fullName.toString();

       System.out.print("\n Enter regno of student : ");
       this.reg_no=sc.nextLine();

       System.out.print("\n Enter CGPA : ");
       this.cgpa=sc.nextFloat();

       System.out.print("\n Enter programme : ");
       sc.nextLine();
       this.programe=sc.nextLine();

       System.out.print("\n Enter school : ");
       this.school=sc.nextLine();

      System.out.print(" Enter first name of proctor : ");
      String firstNamep = sc.nextLine();
      System.out.print(" Enter middle name of proctor : ");
      String middleNamep = sc.nextLine();
      System.out.print(" Enter last name of proctor : ");
      String lastNamep = sc.nextLine();
      StringBuffer fullNamep = new StringBuffer();
      fullNamep.append(firstNamep);
      fullNamep.append(" ");  
      fullNamep.append(middleNamep);
      fullNamep.append(" ");
      fullNamep.append(lastNamep);
      this.proctor=fullNamep.toString();
    }
     public void display()
    {
       System.out.println("Name of Student : " + this.name + "\nregno :"+ this.reg_no +"\ncgpa : " + this.cgpa + "\nprograme : " + this.programe +"\nschool : "+ this.school + "\n proctor : " + this.proctor+ "\n");
    }
  static public void main(String args[])
  {
    int n;
    System.out.println("Enter number of students ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    Student array[]= new Student[n];
    sc.nextLine();
    for(int i=0;i<n;i++)
    {
       array[i]=new Student();
    }
    for(int i=0;i<n;i++)
    {
       System.out.print("\n Enter Student Details - "+(i+1));
       array[i].get();
    }  
    for(int i=0;i<n;i++)
    {
       System.out.println("\nStudent Details  - "+ (i+1));
       array[i].display();
    }
  }
}