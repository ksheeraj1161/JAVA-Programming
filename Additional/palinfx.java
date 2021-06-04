import java.util.*;
public class palinfx {

public static void main(String[] args) {
int r=0 ;
int rem, num; 
Scanner s = new Scanner(System.in);
System.out.print("Enter number that has to be checked:");
num = s.nextInt();

int temp = num;

for( ;num != 0; num /= 10 )
{
rem = num % 10; 
r = r * 10 + rem;
}

if (temp == r)
{
System.out.println(temp + " is input number");
System.out.println(r + " is the reversed number");
System.out.println("Since they are equal " + temp + " is a palindrome number");
}
else
{
System.out.println(temp + " is input number");
System.out.println(r + " is the reversed number");
System.out.println("Since they are not equal " + temp + " is not a palindrome number");
}
}
}



package application;  
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;  
public class palinfx extends Application {  
  
      
public static void main(String[] args) {  
launch(args);     
}  
  
@Override  
public void start(Stage primaryStage) throws Exception {  
     
    Label Number=new Label("Number");  
    
    TextField tf1=new TextField();  
     
    Button b = new Button("Submit");  

    Label Result=new Label("Result");  
    
    TextField tf1=new TextField();  
     

    b.setOnAction(e->System.out.println("You entered: User_ID: "+tf1.getText()+"");  
    GridPane root = new GridPane();  
    root.addRow(0, user_id, tf1);  

    root.addRow(2, b);  
	
	for( ;b != 0; b /= 10 )
	{
	rem = num % 10; 
	r = r * 10 + rem;
	}

if (temp == r)
{
System.out.println(temp + " is input number");
System.out.println(r + " is the reversed number");
System.out.println("Since they are equal " + temp + " is a palindrome number");
}
else
{
System.out.println(temp + " is input number");
System.out.println(r + " is the reversed number");
System.out.println("Since they are not equal " + temp + " is not a palindrome number");
}
}
}

    Scene scene=new Scene(root,300,200);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Text Field Example");  
    primaryStage.show();  
}  
}