class Chapathi
{
  int n=10;
  synchronized void child()
   {
    for(int i=0;i<=this.n;i++)
     {
       if(this.n<1)
       {
          System.out.println("wait for mother there are no chapathis");
          try{
              wait();
             }catch(Exception e){}
       }
       else
       {
         System.out.println("chapathi is taken from stack");
         this.n=this.n-n;
        }
      }
   }
   synchronized void mother()
   {
      System.out.println("mother places chapathi");
      this.n=this.n+1;
      notify();
    }
}
class Chapathinew
{
   public static void main(String args[])
   {
       Chapathi c=new Chapathi();
       Thread t1 =new Thread()
       {
         public void run()
         {
           c.child();
          }
       };
       Thread t2 =new Thread()
       {
          public void run()
         {
           c.mother();
          }
       };
      t1.start();
      t2.start();
   }
}