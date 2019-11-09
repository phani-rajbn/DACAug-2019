//SecondExample.java: Basic IO operations using Console


//Name of the file and the class should be PASCAL Casing and methods should be camel casing. 
import java.io.Console;
//If U want to use any external class within UR Java program, U should import it before use. U could either import a single class or the whole group of classes from that package using a wild charecter *.

//Console is an external class used to perform INPUT OUTPUT Operations on the Console Command. The Java.io.Console class contains functions to access string based Console input and output. NOTE: Console class was added in Java 6. It is used to read from and write to the console. It is convenient class for Console IO instead of using System.out and System.in classes. However, U cannot use Console class on IDE based Consoles(Like ECLIPSE).  
//readLine method is used to read the stream of text from the Command prompt. 
class SecondExample{

	public static void main(String[] args) {
		System.out.println("Enter the Name");
		String name = System.console().readLine();
		
		System.out.println("Enter the Address");
		String address = System.console().readLine();

		System.out.println("Enter the Age");
		String age = System.console().readLine();

		System.out.println("The name entered is " + name);
		System.out.println("The address entered is " + address);
		System.out.println("The age entered is " + age);

		System.console().printf("The Name entered is %s\nThe Address is %s\nThe Age is %s", name, address, age);
		//console class has printf function that is used to print text similar to printf of C....

	}
}