import java.util.*;
class ReverseArray
{
 public static <T> T[] reverseArray(T[] array)
 {
      Collections.reverse(Arrays.asList(array));
      return array;
 }
 public static void main(String args[])
  {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.of elements in array :");
        n=sc.nextInt();
        Integer[] array =new Integer[n];
        System.out.println("enter elements of  array :");
        for(int i=0;i<n;i++)
        {
          array[i]=sc.nextInt();
        }
        System.out.println("original Array:" + Arrays.asList(array));
        array=reverseArray(array);
        System.out.println("reversed Array:" + Arrays.asList(array));
  }
}