package Problem2;

//importing classes necessary to create everything
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class Circles extends Application
{
	public void start(Stage primaryStage)
	{
		Random random = new Random(); //Creation of random number generator
		Group circles = new Group(); //Creation of group to hold all circles
		
		for (int count = 0; count < 100; count++) //For loop that will create 100 circles of random size, color and location
		{
			//Random number generators for the three color sections
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
			
			//Random number generators for the centerX and centerY values of each circle
			int x = random.nextInt(425) + 40;
			int y = random.nextInt(425) + 40;
			
			//Random number generator for the radius of each circle
			int radius = random.nextInt(40) + 1;
			
			Color fill = null; //Creation of variable to hold fill color
			if (radius <= 30) //If statement to generate random color based on radius of circle
			{
				fill = Color.rgb(r, g, b);
			}
			
			Circle circle = new Circle (x, y, radius); //Creation of circle object
			circle.setStroke(Color.BLACK); //Sets the stroke color for all circles
			circle.setFill(fill); //Sets fill color of all circle
			
			circles.getChildren().add(circle); //Puts all the generated circles into one group
		}
		
		Scene scene = new Scene(circles, 500, 500, Color.WHITE); //Creates the scene
		
		primaryStage.setTitle("Circles");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) 
	{
		launch(args); //launches the program
	}
}
