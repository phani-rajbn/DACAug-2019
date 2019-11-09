//SecondExample.java: Method Overriding
/*Points:
Every method in Java can be overriden in the sub class.
U dont have virtual keyword in java, which implies every method is virtual. However, if u want to stop the sub class from overriding UR method, U could mark the method as final. final makes the method non-overridable. 
In IDEs U could use a directive @Override to ensure the rules of method overriding is enforced. The method signature of the subclass should match the method signature of the super class if the superclass's method is to be overriden. 
*/
class ParentClass{
	public void parentFunc(){
		MyConsole.print("Parent func");
	}	
}

class ChildClass extends ParentClass{
	@Override//Optional but good practise, compiler will raise an error of overriding rules are not met....
	public void parentFunc(){
		MyConsole.print("Child func");
	}

	//If the sub class has new functions, the runtime polymorphic object will not be able to notice this new function. U should type cast it to its Subtype and then invoke the method. This feature is called as Object Slicing...
	public void newFunc(){
		MyConsole.print("New Func in child class");
	}
}

class SecondExample{
	public static void main(String[] args) {
		ParentClass cls = new ParentClass();
		cls.parentFunc();

		cls = new ChildClass();
		cls.parentFunc();

		//Use typecasting to cast the super class object to the subclass type and then call the newer function...
		((ChildClass)cls).newFunc();
		//compile error if not typecasted..
	}
}