import java.util.*;
class prog22
{
  public static int add(int[][] arr)
  {
    int sum = 0;
    for (int[] array : arr)
    {
    for(int i: array)
    {
        sum+=i;
    }}
    return sum; 
  }
  public static float add(float[][] arr)
  {
    float sum = 0;
    for (float[] array : arr)
    {
    for(float i: array)
    {
        sum+=i;
    }}
    return sum; 
  }
  public static void main(String args[])
  {
      int n,m;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the dimension of integers 2D array");
      n=sc.nextInt();
      m=sc.nextInt();
      int arr[][]=new int[n][m];
      System.out.println("Enter the elements of integers 2D array"); 
      for(int i=0;i<n;i++)
     {
       for(int j=0;j<m;j++)
       {
          arr[i][j]=sc.nextInt();
       }
     }
      System.out.println("Enter the dimension of floats 2D array");
      n=sc.nextInt();
      m=sc.nextInt();
      float arry[][]=new float[n][m];
      System.out.println("Enter the elements of float 2D array"); 
      for(int i=0;i<n;i++)
     {
       for(int j=0;j<m;j++)
       {
          arry[i][j]=sc.nextFloat();
       }
     }
    int sum;
    float res;
    sum=add(arr);
    res=add(arry);
    System.out.println("Sum of elements of integers 2D array is : "+ sum);
    System.out.println("Sum of elements of floats 2D array is : "+ res);
  }
}