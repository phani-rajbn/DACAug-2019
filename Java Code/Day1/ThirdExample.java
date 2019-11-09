//ThirdExample.java: Program on Data types.
//Java provides 2 types of data: Primitive types and Non-Primitive types. Primitive types are also called as VALUE types(8) that include std data types like: 
/*
integral: byte(8), short(16), int(32), long(64)
floating: float(Single), double(Double).
other types: char(16), boolean(true or false).
*/

//integer related operations for int data type could be done thro a Wrapper class called Integer.  Its parseInt function could be used to convert a string to a integer value. Similarly Double, Float, Byte, Short and other data types too have an appropriate Wrapper class. Members of the wrapper class are static. U could access the members without an object. Integer.parseInt is called with the classname. 
//Most of the Wrapper classes have some common operations and methods:
//valueOf: Used to create a Wrapper object for the given string. 
//parseXXX: Used to convert a String to its type. 
//toString: Convert the value to a String. 
//xxxValue: Get the primitive part for a given Wrapper object. 


//Non-primitive types are custom types: Classes, Arrays, Interfaces, String. 
//All primitive data types have Wrapper classes that are used to perform data conversions among the types. These Wrapper classes make the data types behave like objects.  
import java.lang.*;
import java.io.*;//If U want to import multiple classes from the a given package, U could use * after giving the package name and .

class Score{
	static int mathScore;
	static int scienceScore;
	static int socialScore;
	static int engScore;
	static int kanScore;
}

class ThirdExample{
	static Console con = System.console();
	//create the object of the console class so that U dont need to call the object every time...

	public static void main(String[] args) {
		/*int age = 42;//creating a integer value...
		con.printf("The Age is %d", age);
		String myAge = Prompt.getString("Enter the Age");
		con.printf("The age is %s", myAge);

		double salary = 54000.234;
		con.printf("The Salary is %f", salary);//Float and double values. 

		boolean possible = true;//false could be tried...
		if(possible)
			con.printf("Its possible");
		else
			con.printf("Its not possible");*/

/*		Score.mathScore = 56;
		Score.scienceScore = 66;
		Score.socialScore = 76;
		Score.engScore = 66;
		Score.kanScore = 67;
*/		
		Score.mathScore = Integer.parseInt(Prompt.getString("Enter the Marks for Math"));
		Score.scienceScore = Integer.parseInt(Prompt.getString("Enter the Marks for Science"));;
		Score.socialScore = Integer.parseInt(Prompt.getString("Enter the Marks for Social"));;
		Score.engScore = Integer.parseInt(Prompt.getString("Enter the Marks for English"));;
		Score.kanScore = Integer.parseInt(Prompt.getString("Enter the Marks for Kannada"));;

		String result = "The Maths Score is " + Score.mathScore + "\n";
		result += "The Science Score is " + Score.scienceScore + "\n";
		result += "The Social Score is " + Score.socialScore + "\n";
		result += "The Kannada Score is " + Score.kanScore + "\n";	
		result += "The English Score is " + Score.engScore + "\n";	

		con.printf(result);
	}
}
//Write a program that displays the range of every primitive data type starting from Largest to the smallest.
//Write a calc program to 


//Custom Class created to perform IO operations....
class Prompt{
	private static Console con = System.console();
	static String getString(String question){
		con.printf(question);
		return con.readLine();
	}
}