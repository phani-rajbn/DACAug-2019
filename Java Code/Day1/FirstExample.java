//FirstExample.java: Program on simple Java code.
//The classname and the file name should be same. 
class FirstExample{
	public static void main(String[] args) {
		System.out.println("Testing Java App");
		//U will use the Java Class called System that provides the output stream object on which we print a line on the default output stream of the Application, in this case the Console. 		
	}	
}
/*
Compilation process:
Files saved with extension .java will be compiled using javac command..
To execute the Program we use java command followed by the name of  the Class to execute. 
*/
/*
Rules of creating a class in java:
A file is recommended to have only one class and the class should be public. If the file has multiple classes in it, then the public should be specified to that class which matches the filename. 
If a class is not marked as public then its access specifier will be default. It means that it is accessible within the Package. 
NOTE: Classes are usually grouped into packages to avoid naming conflicts. Packages are similar to Namespace of CPP. packages are created to avoid naming conflicts. 
------------------main function--------------------
Entry point of the program. The main function should return void. it must be public and static. It will take String Array as arg. U cannot have any other type as arg for the main function. this is typically used as Command line args for the program. main is case sensitive. 
When the main returns the Program exits. main method typically contain statments, expressions and functions calls to other methods. Every statement ends witha  ;.
For modularity purpose, statments are grouped into functions and will be called by the main program. 
*/