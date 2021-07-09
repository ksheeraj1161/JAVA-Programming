/*
Input Format
There are two lines of input. The first line contains B : the breadth of the parallelogram. The next line contains H: the height of the parallelogram.


Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
1
3

Sample output 1
3
*/

import java.util.Scanner;

public class Solution {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
