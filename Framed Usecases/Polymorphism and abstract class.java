/* Different categories of cars are available for sale in a car showroom. Design an abstract class to have methods like billing, 
stock availability for a specific product, printSaleReport. 
Create the subclasses according to category of products like hatchback, sedan, minisuv, suv, minihatchbacks. 
Redefine the methods in abstract class appling the dynamic polymorphism concept and override the printSaleReport method of the abstract class*/

import java.util.*;
abstract class operations{
abstract public void billing(String[] item,int[] cost);
abstract public void availability(String item);
public void printSaleReport() {
System.out.println("Printing sales report");
}
}
class hatchback extends operations{
String items[]={"Celerio","Swift","Baleno"};
public void billing(String[] item,int[] cost) {
System.out.println("------------Billing-----------");
System.out.println("ITEM---------------------COST");
int total=0;
for(int i=0;i<item.length;i++) {
System.out.println(item[i]+"---------------------"+cost[i]);
}
System.out.println("total :"+total);
}
public void availability(String item) {
for(int i=0;i<item.length();i++) {if(item.equals(items[i])) {
System.out.println("Available");
break;}
    }
}
public void printSalesReport() {
System.out.println("Print sales report overided");}
}
class sedan extends operations{
String items[]={"Ciaz","Dzire","Sx4"};
public void billing(String[] item,int[] cost) {
System.out.println("------------Billing-----------");
System.out.println("ITEM---------------------COST");
int total=0;
for(int i=0;i<item.length;i++) {
System.out.println(item[i]+"---------------------"+cost[i]);
}
System.out.println("total :"+total);
}
public void availability(String item) {
for(int i=0;i<item.length();i++) {
if(item.equals(items[i])) {
System.out.println("Available");
break;
}
    }
}
public void printSalesReport() {
System.out.println("Print sales report overided");
}
}
class minisuv extends operations{
String items[]={"Scross"};
public void billing(String[] item,int[] cost) {
System.out.println("------------Billing-----------");
System.out.println("ITEM---------------------COST");
int total=0;
for(int i=0;i<item.length;i++) {
System.out.println(item[i]+"---------------------"+cost[i]);
}
System.out.println("total :"+total);
}
public void availability(String item) {
for(int i=0;i<item.length();i++) {
if(item.equals(items[i])) {
System.out.println("Available");
break;
}
    }
}public void printSalesReport() {
System.out.println("Print sales report overided");
}
}
class suv extends operations{
String items[]={"Breeza"};
public void billing(String[] item,int[] cost) {
System.out.println("------------Billing-----------");
System.out.println("ITEM---------------------COST");
int total=0;
for(int i=0;i<item.length;i++) {
System.out.println(item[i]+"---------------------"+cost[i]);
}
System.out.println("total :"+total);
}
public void availability(String item) {
for(int i=0;i<item.length();i++) {
if(item.equals(items[i])) {
System.out.println("Available");
break;
}
    }
}
public void printSalesReport() {
System.out.println("Print sales report overided");
}
}
class minihatchback extends operations{
String items[]={"Ignis","Alto"};
public void billing(String[] item,int[] cost) {
System.out.println("------------Billing-----------");
System.out.println("ITEM---------------------COST");
int total=0;
for(int i=0;i<item.length;i++) {
System.out.println(item[i]+"---------------------"+cost[i]);
}
System.out.println("total :"+total);
}
public void availability(String item) {
for(int i=0;i<item.length();i++) {
if(item.equals(items[i])) {
System.out.println("Available");
break;}
     }
}
public void printSalesReport() {
System.out.println("Print sales report overided");}
}
class cars{
public static void main(String args[]) {
hatchback c=new hatchback();
minihatchback ch=new minihatchback();
sedan g=new sedan();
minisuv k=new minisuv();
suv s=new suv();}
}
