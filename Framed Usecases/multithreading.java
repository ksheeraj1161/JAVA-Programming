/*10.	The Pearson company book printing publication manufacturing factory prints books and stacks it up in shelf, 
and the distributor takes each book from the shelf and sends to the final quality check team. 
The max capacity of shelf is 10 books. If books in the container is empty, distributor waits for the machine to print new books. 
Write a Java program to illustrate the given scenario using multithreading.*/

import java.util.*;
class shelf{
int n;
public shelf() {
n=0;
}
public synchronized void addbook() {
if(n<10){
n++;
System.out.println("made book "+n);
try {notify();}catch(Exception e) {};
}
else {
try {wait();}catch(Exception e) {};
}
}
public synchronized void takebook() {
if(n>0) {
n--;
System.out.println("book sent "+(n+1));try {notify();}catch(Exception e) {};
}
else {
try {wait();}catch(Exception e) {};
}
     }
}
class machine implements Runnable{
shelf c;
public machine(shelf c) {
this.c=c;
Thread t=new Thread(this,"machine");
t.start();
}
public void run() {
while(true) {
c.addbook();
try {Thread.sleep(1000);}catch(Exception e) {};
}
     }
}
class distributor implements Runnable{
shelf c;
public distributor(shelf c) {
this.c=c;
Thread t=new Thread(this,"distributor");
t.start();
}
public void run() {
while(true) {
c.takebook();
try {Thread.sleep(3000);}catch(Exception e) {};
        	}
    }
}
class pearson{
public static void main(String args[]) {
shelf c=new shelf();
new machine(c);
new distributor(c);
}
}
