import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
    }
}
