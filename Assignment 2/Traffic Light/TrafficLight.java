package Problem2;

// importing classes necessary to create everything
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;

public class TrafficLight extends Pane //Creates pane that traffic light will be created using
{
	public static Circle redLight = new Circle(210,90,25); //Creates circle for red light
	public static Circle yellowLight = new Circle(210,150,25); //Creates circle for yellow light
	public static Circle greenLight = new Circle(210,210,25); //Creates circle for green light
	public static Rectangle background = new Rectangle(161,50,100,200); //Creates rectangle for background of traffic light
	
	public TrafficLight() //constructor for TrafficLight
	{	
		redLight.setFill(Color.RED); //Sets initial color to red for red light
		yellowLight.setFill(Color.GREY); //Sets initial color to grey for yellow light
		greenLight.setFill(Color.GREY); //Sets initial color to grey for green light
		background.setFill(Color.BLACK); //Sets color to black for background of traffic light
		
		getChildren().addAll(background,redLight,yellowLight,greenLight); //Adds all components to the pane to be displayed
	}
	
	public enum State {STOP,CAUTION,GO}; //Variables to use as reference when to what changes each button should do
	
	public void SwitchState(State pressedButton) //Class that defines the action of switching the lights when a button is pushed
	{	
       	if (pressedButton == State.STOP) //Action for the stop button being pushed
		{
			TrafficLight.redLight.setFill(Color.RED); //Changes color of circle to red
			TrafficLight.yellowLight.setFill(Color.GREY); //Changes color of circle to grey
			TrafficLight.greenLight.setFill(Color.GREY); //Changes color of circle to grey
		}	
		else if (pressedButton == State.CAUTION) //Action for the caution button being pushed
		{
			TrafficLight.redLight.setFill(Color.GREY); //Changes color of circle to grey
			TrafficLight.yellowLight.setFill(Color.YELLOW); //Changes color of circle to yellow
			TrafficLight.greenLight.setFill(Color.GREY); //Changes color of circle to grey
		}
		else if (pressedButton == State.GO) //Action for the go button being pushed
		{
			TrafficLight.redLight.setFill(Color.GREY); //Changes color of circle to grey
			TrafficLight.yellowLight.setFill(Color.GREY); //Changes color of circle to grey
			TrafficLight.greenLight.setFill(Color.GREEN); //Changes color of circle to green
		}
	}
}
