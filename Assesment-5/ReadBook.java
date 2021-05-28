import java.util.*;
class Book
{
  String bookid;
  String author;
  String publisher;
 void get()
 {
   Scanner sc =new Scanner(System.in);
   System.out.print("enter Book Id : ");
   this.bookid=sc.nextLine();
   System.out.print("enter Book Author :");
   this.author=sc.nextLine();
   System.out.print("enter Book publisher :");
   this.publisher=sc.nextLine();
 }
 void print()
 {
   System.out.println("Book Id : " + this.bookid);
   System.out.println("Book Author : " +this.author);
   System.out.println("Book publisher : "+this.publisher);
 }
}
class ReadBook
{
 public static void main(String args[])
 {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter no of Books :");
    int n =sc.nextInt();
    ArrayList <Book> bok =new ArrayList<Book>();
    for(int i=0;i<n;i++)
    {
      Book now =new Book();
      System.out.println("enter details of Book "+(i+1));
      now.get();
      bok.add(now);
    }
     Iterator itr=bok.iterator(); 
    while(itr.hasNext())
    {  
    Book bk=(Book)itr.next();
    bk.print();  
    }  
 }
}