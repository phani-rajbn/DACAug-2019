//FourthExample.java:AccessSpecifiers Example
/*
Access Modifiers in java make the functions and objects restrict the scope of the data. 4 Types of access modifiers:
default-No keyword is required, make the member available within the package or namespace. 
private: Accessible only within the class that it is declared.
public: Similar to Cpp, available across the Application.
protected: Accessible within the class and its derived classes. 
NOTE: Package can be a part of an Application. An Application can contain multiple packages. So default will restrict the member within the package only. 
If a class is intended to be used by other programmers, U must try to use the most restrictive access level as possible. Use private unless you have a valid reason of not making it. 
One should avoid public fields expect for contants. 
Classes and interfaces can also have access specifiers: default or public. U cannot have private or protected classes. If U dont specify any access specifier it will be default. A file can have only one public class and that class should share the same name of the file. However U could have multiple default classes.  
*/
class Book{
	//fields will be private. 
	private int bookID;
	private String title;

	//Accessors to read and write the data.
	void setDetails(int id, String title){
		this.bookID = id;
		this.title = title;
		//this operator is used to refer the object of the class. 
	}

	//to get the data, we could create functions with prefix get...
	String getTitle(){
		return title;
	}

	int getBookID(){
		return bookID;
	}//No Access specifiers means its default...

	public String toString(){
		return "BookID: " + bookID + "\tTitle: " + title;
	}
}

class FourthExample{
	public static void main(String[] args) {
		Book bk = new Book();
		bk.setDetails(123, "Professional Java");
		MyConsole.print(bk);
	}	
}
/*Exercises for the Assignment
Create a Program that has the following features. 
Function that takes an int Array as arg and return the max value in the array. 
Function that takes an int Array as arg and return the min value in the array.
Function that takes an int array as arg and return the avg value in the array. 
Function that takes an Array(of any kind) as arg and return an Array object which contain the elements in the reverse order. Let the name of the function be Reverse. 
Create a Class called Travelogue that has the following info in it: TravelID, Title, Destination, Keywords, Information. 
Create a Function that takes the args required for creating the object of the Travelogue class and the function should create the object of the Travelogue class and it should return the object.
U should not create the object with new operator, rather use this function for creating the Travelogue objects(Factory pattern).  
*/