import java.util.*;
class prog20
{
   public static void main(String args[])
  {
   System.out.println("Enter 0,1 according to attendance");
     Scanner sc=new Scanner(System.in);
     int arr[][]=new int[3][];
     arr[0]=new int[12];
     arr[1]=new int[8];
     arr[2]=new int[6];
     for(int i=0;i<arr.length;i++)
      { for(int j=0;j<arr[i].length;j++)
        {
           arr[i][j]=sc.nextInt();
        }
      }
     float CAT1,CAT2,term;
     int count=0;
     for(int i : arr[0])
     { 
       count=count+i;
     }
     CAT1=100*count/12f;
     System.out.println("Attendance percentage for CAT1: "+ CAT1);
     for(int i : arr[1])
     {
      count=count+i;
     }
     CAT2=100*count/20;
     System.out.println("Attendance percentage for CAT2:"+ CAT2);
     for(int i:arr[2])
     {
      count=count+i;
     }
     term=100*count/26;
     System.out.println("Attendance percentage for term end:"+ term);
  }
}