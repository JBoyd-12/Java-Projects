package Problem1;

//importing necessary classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterGradeConverter 
{
	//private instance variables
	private int[] intGrades = new int[100];
	private char[] LettergradeList = new char[100];
	private int actualLength;
	private File textFile;
	
	//Constructor that read in files and size of arrays
	public LetterGradeConverter(String studentGrades, int sizeOfList)
	{
		textFile = new File(studentGrades);
		readInFile(textFile);
		LetterGradeConverter();
	}
	
	//Protected method that reads in the file into the array
	protected void readInFile(File textFile)
	{
		try 
		{
			Scanner scan = new Scanner(textFile); //Creation of scanner to scan in the text file
			
			actualLength = 0;
			//Loop that uses iterator to read through every line of the text file
			while(scan.hasNext())
			{
				intGrades[actualLength] = scan.nextInt();
				actualLength++;
			}
		} catch (FileNotFoundException f)
		{
			f.printStackTrace(); //Will trace back to any error that occurs within the method
		}
	}
	
	//private method that takes the integer values read in from file and converts them to the proper letter grades
	private void LetterGradeConverter()
	{
		for(int count = 0; count < actualLength; count++)
		{
			int number = intGrades[count];
			char letter = 'A';
			
			if (number >= 90)
			{
				letter = 'A';
			}
			else if ((number >= 80) && (number < 90))
			{
				letter = 'B';
			}
			else if ((number >= 70) && (number < 80))
			{
				letter = 'C';
			}
			else if ((number >= 60) && (number < 70))
			{
				letter = 'D';
			}
			else if (number < 60)
			{
				letter = 'F';
			}
			
			LettergradeList[count] = letter;
		}
	}
	
	//toString to output a table format showing each integer grade and the corresponding letter grade 
	public String toString()
	{
		String values = "";
		
		//for loop that uses a counter variable to cycle through the whole array for the int grades and letter grades
		for(int count = 0; count < actualLength; count++)
		{
			values += "      " + intGrades[count] + " | " + LettergradeList[count] + "\n";
		}
		
		return values;
	}
	
	//protected method that compares the two letter grade arrays and sees if they are equal or not
	protected boolean equals(LetterGradeConverter L1)
	{
		boolean equal = false;
		int counter = 0;
		
		//for loop that compares the grades in each list to each other in order to find out if they are equal
		for(int count = 0; count < actualLength; count++)
		{
			if (LettergradeList[count] == L1.LettergradeList[count])
			{
				counter++;
			}
		}
		
		//if counter is incremented a number of times that is equal to the length of the letter grade list then the two list must be equal
		if(counter == actualLength)
		{
			equal = true;
		}
		else
		{
			equal = false;
		}
		
		return equal;
	}
	
	//getters and setters for all other instance variables
	public int[] getIntGrades() 
	{
		return intGrades;
	}

	public void setIntGrades(int[] intGrades) 
	{
		this.intGrades = intGrades;
	}

	public char[] getLettergradeList() 
	{
		return LettergradeList;
	}

	public void setLettergradeList(char[] lettergradeList) 
	{
		LettergradeList = lettergradeList;
	}

	public int getActualLength() 
	{
		return actualLength;
	}

	public void setActualLength(int actualLength) 
	{
		this.actualLength = actualLength;
	}

}
