import java.lang.*;
import java.util.*;
import java.io.*;

class DataStore{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{
      FileOutputStream fout=new FileOutputStream("f.txt");
      ObjectOutputStream out=new ObjectOutputStream(fout);

      int n;
      System.out.print("Enter no. of members: ");
      n=sc.nextInt();

      String mName;
      int mAge;
      for(int i=0;i<n;i++){
          sc.nextLine();
        System.out.print("Enter name: ");
        mName=sc.nextLine();
        System.out.print("Enter age: ");
        mAge=sc.nextInt();
        out.writeObject(new member(mName,mAge));
      }

      out.flush();
      out.close();
      System.out.println("Successfully stored the objects in the file");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}

class member implements Serializable{
 String name;
 int age,Dpercent;
 member(String name,int age) {
  this.age = age;
  this.name = name;
  if(age>=14 && age<21){
    this.Dpercent=15;
  }
  else if(age<14){
    this.Dpercent=30;
  }
  else{
    this.Dpercent=0;
  }
 }
}