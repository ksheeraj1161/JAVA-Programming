/* A Shopping company gives membership card points for their customers on each purchase. 
Write a Java program to create a package named shop which has a class named items and include item details. 
Perform series of buying items in the main method using the package.

Banking- shop
Account- item
Trans- buy
*/

// savings.java

package shop;
public class savings
{
private double balance;
private double interest;
public savings()
{
balance = 0;
interest = 0;
}
public savings(double initialBalance, double initialInterest)
{
balance = initialBalance;
interest = initialInterest;
}
public void deposit(double amount)
{
balance = balance + amount;
}public void withdraw(double amount)
{
balance = balance - amount;
}
public void addInterest()
{
balance = balance + balance * interest;
}
public double getBalance()
{
return balance;
}
}

// member.java

import shop.*;
public class member
{
public static void main(String[] args)
{
savings jS = new savings(5000, 0.20);
jS.withdraw(250);
jS.deposit(400);
jS.addInterest();
System.out.println("Balance Points in Membership card:");
System.out.println(jS.getBalance());
}
}
