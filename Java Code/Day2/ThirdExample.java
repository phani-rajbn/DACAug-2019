//ThirdExample.java: Classes And Objects
class Employee{
	private int empID;
	private String empName;
	private String empAddress;

	public Employee(int id, String name, String address){
		empID = id;
		empName = name;
		empAddress = address;
	}

	public String getName(){
		return empName;		
	}
	public String getAddress(){
		return empAddress;		
	}
	
	public int getID(){
		return empID;
	}
	//Override the toString method of the Object class from which Employee is implicitly derived from......
	public String toString(){
		return "The Name:" + empName + "\nThe Address:" + empAddress;	
	}
}

class ThirdExample{
	public static void main(String[] args) {
		Employee emp = new Employee(123, "Phaniraj", "Bangalore");
		MyConsole.print(emp);//Object itself is being print..
	}
}