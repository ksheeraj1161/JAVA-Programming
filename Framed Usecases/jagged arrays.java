/* A tourism Cave allows only 5 batches inside for visiting at once to prohibit oxygen suffocation. 
read the count of the tourists who paid for a tourist guide in each batch to know about the history of the place. 
A Tourist Guide should be assigned for every 5 tourists. Create a jagged array with 5 rows to store the count of paid tourists in the 5 batches. 
The number of columns in each row should be equal to the number of groups formed for that particular batch. Determine the number of guides for each batch. 
Use for-each loop to traverse the array and print the details.*/

import java.util.*;
public class cave
{
 public static void main(String arr[])
 {
 	System.out.print("Enter number of Tourists who need a Guide in each batch:");
 Scanner b= new Scanner(System.in);
 int content,z;
 int ans=0;
 int a[][]=new int[5][];
 for(int i=0;i<5;i++)
 {
 content=b.nextInt();
 if(content%5==0)
 	z=content/5;
 else
 	z=content/5+1;
 	a[i]=new int[z];
 for(int j=0;j<z;j++)
 {
 if(content>5)
 {
 	a[i][j]=5;
 	content=content-5;
 }
 else {
 	a[i][j]=content;
 	content=0;
 	}
      }
 }
 
 for(int i=0;i<5;i++)
 {
 for(int n:a[i])
 {
 	System.out.print("Number of Guides needed for batch no."+i+": ");
 	System.out.print(n);
 	if(n==5)
 	ans++;
 }
 System.out.println();
 	}
     }
}
