import java.util.*;
public class prog18
{
public static void main(String[] args) {
int i, j, rows,nuum; 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number of rows : "); 
 rows = sc.nextInt(); 
 for (i= 0; i<= rows-1; i++) 
 { 
 for (j=0; j<=i; j++) 
 { 
 System.out.print(j+1+ " "); 
 } 
 System.out.println(""); 
} 
 for (i=rows-1; i>=0; i--) 
 { 
 for(j=0; j <= i-1;j++) 
 { nuum=j+1;
 System.out.print(nuum+ " "); 
 } 
 System.out.println(""); 
 } 
}
}
