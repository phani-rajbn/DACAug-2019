//ThirdExample.java: Abstract Classes Demo
/*Points:
Abstract classes are those that have atleast one abstract method. 
abstract keyword is used to mention the class as abstract as well method as abstract.
Abstract methods dont have a body. A Class that is derived from the Abstract class must implement the abstract methods.
The Abstract classes will have non-implemented methods, there by the class becoming incomplete, so incomplete classes cannot be instantiated. Abstract classes cannot be instantiated.
An Abstract class can have normal methods as well as overriden methods in it. 
*/

abstract class TestClass{
	public abstract void testFunc();//Will not have a body
	public final void normalFunc(){ MyConsole.print("Normal Func");}
}

class TestImplementor extends TestClass{
	@Override
	public void testFunc(){
		MyConsole.print("testFunc from the subclass");
	}

	/*@Override
	public void normalFunc(){
		MyConsole.print("Normal func of the derived class");
	}*/
}
class ThirdExample{
	public static void main(String[] args) {
		TestClass instance = new TestImplementor();
		instance.testFunc();
		instance.normalFunc();
	}
}

