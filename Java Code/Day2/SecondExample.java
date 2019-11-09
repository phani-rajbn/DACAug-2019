//ObjectsDemo.java: About Object Class...
/*
Points:
All data types in Java are derived from a Class called java.lang.Object. 
It provides a common set of operations and features that makes it available for all the data types of Java including the Cujstom times. 
String conversions, Type Information, HashCode Information are some of the common functions available for all the data types of Java. 
Every data type could be implicitly converted to Object. This is called as BOXING. Again every BOXED object could be converted back to its data type using explicit casting. This is called as UNBOXING. BOXING and UNBOXING helps in creating objects that encapsulate the type info about the value that is used within the Object type. 
List of methods of Object class:
toString(): gets the string representation of an Object or used to convert an object to String.
hashCode(): returns the Hash value of the object. For every object, JVM generates an unique no called as HASHCODE. It gives distinct no for distinct objects. JVM internally uses an algorithm to convert a memory address along with the Type info about the object and then generates a number. This value is typically used for searching objects within a collection. 
equals(): Compares the given object(Passed as Arg) with the current object. Current object is refered with this operator. U could override these methods to give UR iwn equality condition.
getClass() : returns the Class Info about the object. This will be used to get the Runtime Class info. 
finalize(): This method is called just before the object is destroyed. Objects are not destroyed by the programmers, rather it will be destroyed by GC(Garbage Collector). Before the GC destroys an Object, it will call the object's finalize method, so technically finalize could be used like Destructor of C++. Unlike Destructors U cannot explicitly call the finalize method for a given object.
*/

class SecondExample{
	public static void main(String[] args) {
		//boxingDemo();
		//equalsDemo();
		//classInfoDemo();
		hashCodeExample();
	}

	static void hashCodeExample(){
		Object value = 123;
		Object other = 123;
		MyConsole.print(value.hashCode() == other.hashCode());
		MyConsole.print(value.hashCode());
		value = "123";//The string gives a different hashcode over the int hashcode. NOTE: hashcode and the value will be same for integral types. 
		MyConsole.print(value.hashCode());
	}
	//getClass gets the Type info about the data type of the value stored in the object...
	static void classInfoDemo(){
		Object data = "Sample Text";
		Class detail = data.getClass();
		MyConsole.print("The Class detail of the object is " + detail.getName());
	}

	static void equalsDemo(){
		int firstValue = 123;
		int secondValue = 123;
		MyConsole.print(firstValue == secondValue);//true

		String name = "Phaniraj";
		String copyname = "Phaniraj";
		MyConsole.print(name.equals(copyname));//equals method is used to compare 2 objects of the same type. This method can be overriden to define UR own equality comparision. 	
	}

	static void boxingDemo(){
		//Same Object is used to store any kind of data in it. The Object class will encapsulate the actual data type of the value that is stored into the Object. U cannot perform any operations on that Object directly even if U R aware of the data type that the Object holds... 
		Object data = 123;//BOXING...
		MyConsole.print(data);
		//data++;
		int temp = (int)data;//UNBOXING..
		temp++;
		data = temp;
		MyConsole.print(data);

		data = "Sample Code";
		MyConsole.print(data);
		data = 45665.34545;
		MyConsole.print(data);
	}
}




