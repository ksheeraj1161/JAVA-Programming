import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.*;

class DataRetrive{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
try{
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
  List<member> list=new ArrayList<member>();
  List<member> l0=new ArrayList<member>();
  List<member> l15=new ArrayList<member>();
  List<member> l30=new ArrayList<member>();
  int n;
  System.out.print("Enter no. of members in the list: ");
  n=sc.nextInt();
  int i=0;
  while(i<n){
    list.add((member)in.readObject());
    i++;
  }
  //System.out.println(list);
  Iterator it=list.iterator();
  while(it.hasNext()){
    member m=(member)it.next();
    if(m.Dpercent==0){
      l0.add(m);
    }
    if(m.Dpercent==15){
      l15.add(m);
    }
    if(m.Dpercent==30){
      l30.add(m);
    }
  }

  Iterator x=l0.iterator();
  System.out.println("Members having 0 percent Discount");
  while(x.hasNext()){
    member m1=(member)x.next();
    System.out.println("\t"+m1.name);
  }

  Iterator y=l15.iterator();
  System.out.println("Members having 15 percent Discount");
  while(y.hasNext()){
    member m2=(member)y.next();
    System.out.println("\t"+m2.name);;
  }

  Iterator z=l30.iterator();
  System.out.println("Members having 30 percent Discount");
  while(z.hasNext()){
    member m3=(member)z.next();
    System.out.println("\t"+m3.name);
  }


  in.close();
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