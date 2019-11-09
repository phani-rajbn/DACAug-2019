//Recap.java
//Function to find a Square of a number...
//Function to create a String array and display the elements of the Array.
//Create a class called Patient with fields of Id, Name, PhoneNo and BillAmount. Create an object of this class in the createAnDisplayObject method which displays all the values of the fields of the Patient object...
class Patient{
	int Id;
	String Name;
	long PhoneNo;
	double BillAmount;
	public void setDetails(int Id, String Name, long PhoneNo, double BillAmount)
	{
		this.Id = Id;
		this.Name  = Name;
		this.PhoneNo = PhoneNo;
		this.BillAmount = BillAmount;
	}
	
	public int getId()
	{
		return Id;
	}
	public String getName()
	{
		return Name;
	}
	public long getPhone()
	{
		return PhoneNo;
	}
	public double getBill()
	{
		return BillAmount;
	}
}
class Example{
	static int findSquare(int number){
		return number*number;
	}
	static void simpleStringArrayExample(){
		//create the Array
		String str[]=new String[2];
		//set values to the elements of the Array
		for(int i=0;i<str.length;i++)
		{
			str[i]=System.console().readLine();
		}
		//display the elements using foreach statement.
		for(String s : str)//U dont need an index, it will always be within the bounds of the array. 
		{
			System.out.println(s);
		}		
	}

	static void createAndDisplayObject(){
		Patient p= new Patient();
		p.setDetails(12,"Animesh",999998888, 5000);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPhone());
		System.out.println(p.getBill());
	}
	public static void main(String args[]){
		// System.out.println("enter the number");
		// int number=Integer.parseInt(System.console().readLine());
		// int result=findSquare(number);
		// System.out.println(result);
		//simpleStringArrayExample();
		createAndDisplayObject();
	}
}