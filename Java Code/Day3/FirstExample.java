//FirstExample.java:Inheritance Example
/*
Points:
There is only single inheritance in Java. U cannot have multiple base classes at the same level to a Java class. 
However, U could have multi-level Inheritance. Class A extended to Class B and B could be further extended to Class C.
Java uses extends keyword to define inheritance.  
*/
class Parent{
	public void parentFunc(){
		MyConsole.print("Parent function");
	}
}
//Inheritance in Java...
class ChildClass extends Parent{
	public void childFunc(){
		MyConsole.print("Child Function");
	}
}

class FirstExample{
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.parentFunc();

		ChildClass cls = new ChildClass();
		cls.parentFunc();
		cls.childFunc();

	}
}
/*
Every class in java will have java.lang.Object as its Superbase class. The base class is usually refered as Super Class in java. For any given class, U can have only one Super Class. 
The Subclass will inherit all the members(Fields, functions) from its super class. Constructors are not inherited but can be invoked using super keyword. 
Java does not support private inheritance like in Cpp.
U can call the super class version of the function using super keyword. super infers to the base class just like this infers to the current class. 
*/
