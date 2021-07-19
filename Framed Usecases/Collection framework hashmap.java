/* 14.	Assume only a maximum of 3 players can be bought by a Table tennis team in an auction for upcoming tournament. 
Create a hashmap ‘h1’ with ‘n’ key-value pairs where keys are the names of teams and values are the players registered for the tournament. 
Create another hashmap ‘h2’ with ‘m’key-value pairs where keys are the names of players participating and values are the names of coaches handling the players. 
Write appropriate code to add or remove a team from h1 and Iterate over the maps and display the key-value pairs stored in them.*/

// Sport.java
import java.lang.*;
import java.util.*;
class Sport{
static void AddTeamPlayer(HashMap<String,List<String>> map1){
 Scanner sc=new Scanner(System.in);
 int n,m;
 String Sname,Player;
 System.out.println("Enter number of new teams: ");
 n=sc.nextInt();
 sc.nextLine();
 for(int i=0;i<n;i++){
 	System.out.print("\tEnter team name: ");
 	Sname=sc.nextLine();
 	map1.put(Sname,new ArrayList<>());
 	System.out.print("\tEnter number of Players registered by "+Sname+" : ");
 	m=sc.nextInt();
 	if(m<=3){
 	sc.nextLine();
 for(int j=0;j<m;j++){
 	System.out.print("\t\tEnter Player "+(j+1)+" : ");
 	Player=sc.nextLine();
 	map1.get(Sname).add(Player);
 	}
 }
 else{
 	System.out.println("\tOnly 3 Players allowed atmost");
 	}
 }
 System.out.println("New Teams Successfully added!");
}
static void AddPlayerCoach(HashMap<String,List<String>> map2){
 	Scanner sc=new Scanner(System.in);
 	int n,m;
 	String Fname,Player;
 	System.out.println("Enter number of new Players: ");
 	n=sc.nextInt();
 	sc.nextLine();
 for(int i=0;i<n;i++){
 	System.out.print("\tEnter Player name: ");
 	Player=sc.nextLine();
 	map2.put(Player,new ArrayList<>());
 	System.out.print("\t\tEnter Coach: ");
 	Fname=sc.nextLine();
 	map2.get(Player).add(Fname);
 }
 System.out.println("New Players Successfully added!");
}
static void RemoveTeam(HashMap<String,List<String>> map1){
Scanner sc=new Scanner(System.in);
String Sname;
System.out.print("Enter the Team name to be deleted: ");
Sname=sc.nextLine();
map1.remove(Sname);
System.out.println("Details of Team * "+Sname+" * is deleted Successfully!");
}
static void DisplayAll(HashMap<String,List<String>>
map1,HashMap<String,List<String>> map2){
 System.out.println("\nDetails of Teams and their bought players: \n");
 for(Map.Entry<String,List<String>> entry:map1.entrySet()){
 	String key=entry.getKey();
 	List l=entry.getValue();
Iterator i=l.iterator();
 System.out.println("\tList of Players Registered by "+key+" : ");
 while(i.hasNext()){
 	System.out.println("\t\t"+i.next());
 }
 }
 System.out.println("\nDetails of Players and Coaches: \n");
 for(Map.Entry<String,List<String>> entry:map2.entrySet()){
 	String key=entry.getKey();
 	List l=entry.getValue();
 	Iterator i=l.iterator();
 	System.out.println("\tList of Coaches "+key+" : ");
 	while(i.hasNext()){
 System.out.println("\t\t"+i.next());
}
  }
}
static void CoachDetails(HashMap<String,List<String>>
map1,HashMap<String,List<String>> map2){
 	Scanner sc=new Scanner(System.in);
 	String Sname;
 	System.out.print("Enter the Player Name: ");
 	Sname=sc.nextLine();
 	List l=map1.get(Sname);
 	Iterator i=l.iterator();
 	System.out.println("\tCoaches of "+Sname+" : ");
 	while(i.hasNext()){
String c=(String)i.next();
 List L=map2.get(c);
 Iterator j=L.iterator();
 while(j.hasNext()){
 System.out.println("\t\t"+j.next());
 }
 }
}
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
 	HashMap<String,List<String>> map1=new HashMap<String,List<String>>();
 HashMap<String,List<String>> map2=new HashMap<String,List<String>>();
 while(true){
 int choice;
 System.out.println("***************************************************");
 System.out.println("\tEnter 1 to add Team to the list");
 System.out.println("\tEnter 2 to add Players to the list");
 System.out.println("\tEnter 3 to remove a Team from the list");
 System.out.println("\tEnter 4 to Display Team and Player lists");
 System.out.println("\tEnter 5 to fetch Coach details of a Team");
 System.out.print("Enter your choice: ");
 choice=sc.nextInt();
 switch(choice){
 case 1:
 {
 AddTeamPlayer(map1);
 break;}
 case 2:
 {
 AddPlayerCoach(map2);
 break;}
 case 3:
 {
 RemoveTeam(map1);
 break;}
 case 4:
 {
 DisplayAll(map1,map2);
 break;}
 case 5:
 {
 CoachDetails(map1,map2);
 break;}
 }
 System.out.println("***************************************************");
 	}
}   }
