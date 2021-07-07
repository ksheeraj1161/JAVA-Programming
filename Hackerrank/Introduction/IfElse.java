/*
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range 2 of 5 to , print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format
A single line containing a positive integer, n.

Constraints
1<=n<=100
Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1)
        System.out.println("Weird");
        else
        {
            if(n>=2 && n<=5)
            System.out.println("Not Weird");
            
            if(n>=6 && n<=20)
            System.out.println("Weird");
            
            else if(n>20)
            System.out.println("Not Weird");
        }
    }
}
