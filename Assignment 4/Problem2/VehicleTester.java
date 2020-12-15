package Problem2;

public class VehicleTester 
{

	public static void main(String[] args) 
	{
		//Creation of instances using the vehicle subclasses
		Motorized Vehicle1 = new Motorized("Jeremy Boyd", 4, "Toyota", 1.8);
		Bicycle Vehicle2 = new Bicycle("Jose Jiminez", 2, "Scott Sports");
		Vehicle Vehicle3 = new Motorized("Kageman Mason", 4, "Chrysler", 3.6);
		Vehicle Vehicle4 = new Bicycle("Richard Wilson", 2, "Trek");
		
		//Using each classes toString method, displays the information for each vehicle
		System.out.println(Vehicle1.toString());
		System.out.print("\n");
		System.out.println(Vehicle2.toString());
		System.out.print("\n");
		System.out.println(Vehicle3.toString());
		System.out.print("\n");
		System.out.println(Vehicle4.toString());
	}

}
