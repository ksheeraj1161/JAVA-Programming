/* Government Vigilance department of india wants to make a check on progress stages of all the major projects in highway and railway lines sector currently under construction in the country. 
Government wants to restrict budget for unimportant project and divert the funding to highly important projects. 
Construct an algorithm using interfaces to collect details and display progress and speed on a scale of 5. */

import java.io.*;
interface Project {
	void increaseBudget(int a);
	void decreaseBudget(int a);
}
class Highway implements Project{
	int speed;
	int progress;
	public void changeprogress(int newprogress){
		progress = newprogress;
	}
	public void increaseBudget(int increment){
		speed = speed + increment;
	}
	public void decreaseBudget(int decrement){
		speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("speed: " + speed + " progress: " + progress);
	}
}
class Railway implements Project {
	int speed;
	int progress;
	public void changeprogress(int newprogress){	
		progress = newprogress;
	}
	public void increaseBudget(int increment){	
		speed = speed + increment;
	}
	public void decreaseBudget(int decrement){	
		speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("speed: " + speed
			+ " progress: " + progress);
	}
	
}
class Budget {
	public static void main (String[] args) {
		Highway Highway = new Highway();
		Highway.changeprogress(2);
		Highway.increaseBudget(3);
		Highway.decreaseBudget(1);
		System.out.println("Highway present progress :");
		Highway.printStates();
		Railway Railway = new Railway();
		Railway.changeprogress(1);
		Railway.increaseBudget(4);
		Railway.decreaseBudget(3);
		System.out.println("Railway present progress :");
		Railway.printStates();
	}
}
