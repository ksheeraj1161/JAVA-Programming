import java.util.*;
public class prog4
{
	 public static void main (String[] args)
     {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements inside array : ");
        n=sc.nextInt();
        int array[] = new int [n];
        System.out.println("Enter elements in the array : ");

        for(int i=0;i<array.length;i++)
        {
          array[i]=sc.nextInt();
        }
        array = separate_odd_even(array);
        System.out.println("Array after separation of even and odd numbers ");
        for(int i=0;i<array.length;i++)
        {
        System.out.println(array[i]);
        }
    }
    static int [] separate_odd_even(int arr[])
    {
        int left_side = 0, right_side = arr.length - 1;
        while (left_side < right_side)
        {
            while (arr[left_side]%2 == 0 && left_side < right_side)
                left_side++;
 
            while (arr[right_side]%2 == 1 && left_side < right_side)
                right_side--;
 
            if (left_side < right_side)
            {
                int temp = arr[left_side];
                arr[left_side] = arr[right_side];
                arr[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        return arr;
    }
}