package Problem1;

//importing of scanner class
import java.util.Scanner;

public class LetterGradeDisplayer 
{
	public static void main(String[] args) 
	{
		//Creation of various variables to retrieve user information
		Scanner scan = new Scanner(System.in);
		String GradesFile;
		int size;
		String GradesFile2;
		int size2;
		
		//Output statements that ask for information along with scanner statements that read in user data
		System.out.println("Enter name of first file:");
		GradesFile = scan.nextLine();
		System.out.println("How many grades are within this file (100 Maximum)?");
		size = scan.nextInt();
		System.out.println("\nEnter name of second file:");
		scan.nextLine();
		GradesFile2 = scan.nextLine();
		System.out.println("How many grades are within this file (100 Maximum)?");
		size2 = scan.nextInt();
		
		//creation instances of LetterGradeConverter
 		LetterGradeConverter GradesList = new LetterGradeConverter(GradesFile, size);
		LetterGradeConverter GradesList2 = new LetterGradeConverter(GradesFile2, size2);
		
		//Outputs a table containing the integer and letter grades
		System.out.println("\n   Grades List\n-------------------");
		System.out.println(GradesList.toString());
		System.out.println("   Grades List 2\n-------------------");
		System.out.println(GradesList2.toString());
		
		//uses method within LetterGradeConverter to see if the tables are equal
		if (GradesList.equals(GradesList2))
		{
			System.out.println("\nThe lists are equal");
		}
		else
		{
			System.out.println("\nThe lists are not equal");
		}
	}

}
