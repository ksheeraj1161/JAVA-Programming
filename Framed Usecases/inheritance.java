/* A crypto currency (ex: pi) maintains two kinds of ledger for miners. The first ledger provides compound interest and coins withdrawal facilities at any time. 
The second ledger provides no interest on coins and in this ledger, should maintain a minimum coin balance and if the balance falls below this level, a service charge is imposed. 
Create a class ledger that stores miner name, hash number and type of ledger. Check for the minimum coin balance, 
impose penalty and update the coin balance. Accept mining from a miner and update the coin balance displaying the coin balance. 
Compute and coin share interest and Permit coin withdrawal updating the coin balance. */

import java.util.Scanner;
class ledger {
int ano;
float bal;
public float getBal() {
return bal;
}
public void setBal(float balance) {
bal = balance;
}}
class first extends ledger {
first(int hashnum) {
ano = hashnum;
bal = 0;
System.out.println("--first ledger created--");
System.out.println("Hash No.: " + ano);
System.out.println("Balance: " + bal);}
public static void compound(float rate, float time, float principle) {
float compoundInterest = (float) (principle * Math.pow((1 + rate / 100), time));
System.out.println("The Compound Interest of the coins is : " + compoundInterest);
}
}
class second extends ledger{
float min;
second(int hashnum, float amt){
ano = hashnum;
bal = 0;
min = amt;
System.out.println("--second ledger created--");
System.out.println("Hash No.: " + ano);
System.out.println("Coins Balance: " + bal + " (Please add coins)");
System.out.println("Minimum Coin Balance: " + min);
}
public void withdraw(float amt) {
if (bal < min)
System.out.println("Below minimum Coin balance!");
else {
bal = bal - amt;
System.out.println("New Coin Balance: " + this.getBal());
}
   }
}
public class crypto {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
first s1 = new first(1);
System.out.print("Enter Coins: ");
float amt = sc.nextFloat();
s1.setBal(amt);
System.out.println("New Coins Balance: " + s1.getBal());
System.out.println("\n" + "--Calculating Compound Interest for the Crypto--");
System.out.print("Enter principle: ");
float principle = sc.nextFloat();
System.out.print("Enter rate: ");
float rate = sc.nextFloat();
System.out.print("Enter time: ");
float time = sc.nextFloat();
first.compound(rate, time, principle);
System.out.println("\n" + "--Creating a second Crypto Currency ledger--");System.out.print("Enter minimum Coin Balance: ");
amt = sc.nextFloat();
second c1 = new second(2, amt);
System.out.print("Enter a balance: ");
float b = sc.nextFloat();
c1.setBal(b);
System.out.println("New Balance: " + c1.getBal());
System.out.print("Enter a withdraw Number of coins: ");
amt = sc.nextFloat();
c1.withdraw(amt);
sc.close();
}
}
