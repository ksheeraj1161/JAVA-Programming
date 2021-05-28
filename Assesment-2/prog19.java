import java.util.*;
class prog19
{
 public static void main(String args[])
 {
   int x,y,z,w;
   float count;
   int arr[][]=new int[4][];
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the slow learners in batch 1 :");
   x=sc.nextInt();
   allocate(arr,x,0);
   System.out.println("Enter the slow learners in batch 2 :");
   y=sc.nextInt();
   allocate(arr,y,1);
   System.out.println("Enter the slow learners in batch 3 :");
   z=sc.nextInt();
   allocate(arr,z,2);
   System.out.println("Enter the slow learners in batch 4 :");
   w=sc.nextInt();
   allocate(arr,w,3);
   for(int i=0;i<4;i++)
   {
    System.out.println("For batch "+ (i+1) +" no of tutors required :"+ arr[i].length);
   }
   for(int[] r:arr)
  {
    for(int s:r)
    {
      System.out.print(s +" ");
    }
     System.out.println();
  }
   int sum=0;
   for(int[] r:arr)
  {
    for(int s:r)
    {
      if(s==4)
      {
        sum++;
      } 
    }
  }
   System.out.println(sum + " batches in which all tutors have exactly 4 students");
  }
  public static void allocate(int arr[][],int x,int p)
 {
   int count=x/4;
   if(x%4>0)
   {
     arr[p]=new int[count+1];
   }
   else
  {
     arr[p]=new int[count];
  }
   int i=0;
   while(count>0)
   { 
      arr[p][i]=4;
      i++;count--;
   }
   if(x%4!=0)
   {
     arr[p][i]=x%4;
   }
  }
}