package Problem2;

//importing classes necessary to create scene for application
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Coins extends Application
{
	public void start(Stage primaryStage)
	{
		Font font1 = new Font(45); //Font size for quarter
		Font font2 = new Font(20); //Font size for dime
		Font font3 = new Font(35); //Font size for nickel
		Font font4 = new Font(27); //Font size for penny
		
		Text twenty_five = new Text(43,112,"25\u00A2"); //Creates text to say 25 cents
		twenty_five.setFont(font1); //Sets proper font size to the text
		
		Text ten = new Text(170,106,"10\u00A2"); //Creates text to say 10 cents
		ten.setFont(font2); //Sets proper font size to the text
		
		Text five = new Text(273,110,"5\u00A2"); //Creates text to say 5 cents
		five.setFont(font3); //Sets proper font size to the text
		
		Text one = new Text(385,108,"1\u00A2"); //Creates text to say 1 cent
		one.setFont(font4); //Sets proper font size to the text
		
		Circle quarter = new Circle (75,100,55); //Creates circle for size of a quarter
		quarter.setFill(Color.SILVER); //Sets color for quarter
		quarter.setStroke(Color.BLACK);
		
		Circle dime = new Circle (185,100,25); //Creates circle for size of a dime
		dime.setFill(Color.SILVER); //Sets color for dime
		dime.setStroke(Color.BLACK);
		
		Circle nickel = new Circle (290,100,40); //Creates circle for size of a nickel
		nickel.setFill(Color.SILVER); //Sets color for nickel
		nickel.setStroke(Color.BLACK);
		
		Circle penny = new Circle (400, 100, 32); //Creates circle for size of a penny
		penny.setFill(Color.BROWN); //Sets color for penny
		penny.setStroke(Color.BLACK);
		
		Group cents = new Group(quarter,dime,nickel,penny,twenty_five,ten,five,one); //Groups together all created objects
		Scene scene = new Scene(cents,450,200,Color.GREEN); //Shows what objects will be put in the scene
		
		primaryStage.setTitle("Coins"); //Creates title for window
		primaryStage.setScene(scene); //Creates scene
		primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);

	}

}
