import java.util.*; 
interface Newspaper
{
   public void news();
}
class Magazine implements Newspaper
{
    String title;
    int ISBN;
    String editor;
   public void news()
  {
    System.out.println("Title of Magazine : "+ this.title +"\nISBN of Magazine : "+ this.ISBN +"\nEditor of Magazine : "+ this.editor);
  }
   public void get()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter title of Magazine : ");
    this.title=sc.nextLine();
    System.out.print("\nEnter ISBN  of Magazine : ");
    this.ISBN=sc.nextInt();
    sc.nextLine();
    System.out.print("\nEnter Editor of Magazine : ");
    this.editor=sc.nextLine();
  }
}
class Brochure implements Newspaper
{
     String title;
     int year;
     int page_number;
  public  void news()
  {
    System.out.println("Title of Brochure : " + this.title +"\nYear of Brochure : "+ this.year +"\nPage number of Brochure : "+ this.page_number);
  }
  void getc()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter title of Brochure : ");
    this.title=sc.nextLine();
    System.out.print("\nEnter year  of Brochure : ");
    this.year=sc.nextInt();
    System.out.print("\nEnter page number of Brochure : ");
    this.page_number=sc.nextInt();
  }
}
class Newspapers
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      Magazine obj = new Magazine();
      Brochure abc = new Brochure();
      obj.get();
      abc.getc();
      obj.news();
      abc.news();
  }

}
