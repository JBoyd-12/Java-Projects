package Problem2;

//importing classes necessary to create everything
import Problem2.TrafficLight;
import Problem2.TrafficLight.State;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TrafficLightDisplayer extends Application
{
	public TrafficLight trafficLight = new TrafficLight(); //Creates the traffic light object
	public Button Stop = new Button("Stop"); //Creating button to activate the red light
	public Button Caution = new Button("Caution"); //Creating button to activate the yellow light
	public Button Go = new Button("Go"); //Creating button to activate the green light
	
	public void update(State pressedButton) //Function to call the SwitchState method from the TrafficLight class
    {
		trafficLight.SwitchState(pressedButton); //Retrieves the method and variable that acts as the pressed button
    }
	
	public void start(Stage primaryStage)
	{
		GridPane diagram = new GridPane(); //Creates a gridpane to organize items
		
		Stop.setOnAction((event) -> update(State.STOP)); //Connects the button to the action it should perform
		Caution.setOnAction((event) -> update(State.CAUTION)); //Connects the button to the action it should perform
		Go.setOnAction((event) -> update(State.GO)); //Connects the button to the action it should perform
		
		FlowPane buttons = new FlowPane(Stop, Caution, Go); //Creates a flow plane to group all the buttons vertically
		buttons.setAlignment(Pos.BOTTOM_CENTER); //Sets position for flow pane
		buttons.setHgap(10); //Sets a gap in between buttons
		
		diagram.add(trafficLight, 0, 0); //Adds traffic light object to the grid pane
		diagram.add(buttons, 0, 1); //Adds the buttons within the flow pane to the grid pane
		diagram.setVgap(15); //Sets a gap in between the two objects
		
		Scene traffic = new Scene (diagram,450,300,Color.WHITE); //Creates the scene to be displayed
		
		primaryStage.setTitle("Traffic Light"); //Sets title of program
		primaryStage.setScene(traffic); //Sets the scene
		primaryStage.show();
		
	}

	public static void main(String[] args) 
	{
		launch(args); //launches the program
	}
}

