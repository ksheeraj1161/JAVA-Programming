/*Design a program for securing a vault at bank using two threads.
When someone tries to open vault in an non approved way, One thread displays “Security Breach” every 500 milliseconds and other displays” Call Police” every 1000 milliseconds. 
Create the threads by extending the Thread class.*/

import java.util.*;
class Thread1 extends Thread{
public void run() {
for(int i=0;i<5;i++) {
System.out.println("Security Breach");
try {Thread.sleep(500);}catch(Exception e) {}
}
     }
}
class Thread2 extends Thread{
public void run() {
for(int i=0;i<5;i++) {
System.out.println("Call Police");
try {Thread.sleep(1000);}catch(Exception e) {}
}
}}
class Bank{
public static void main(String args[]) {
Thread1 obj1=new Thread1();
Thread2 obj2=new Thread2();
obj1.start();
obj2.start();
  }
}
