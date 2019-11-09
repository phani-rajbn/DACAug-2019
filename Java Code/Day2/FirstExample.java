//FirstExample.java:Example on Arrays....
/*
Points:
In Java, Arrays are reference Types. They are always allocated dynamically. 
All Arrays are objects of Array Class defined in java.lang package. 
U get functions and member variables to get info about the array, length which is used to get the no of elements within the array.
Usually array objects need to be instantiated using new operator. 
Index within the Array always starts with 0. U cannot change the lower bound value of the array.
The size of the Array will be always an int, not long or short or any other type.
Arrays could be of primitive as well as non primitive types. In case of primitive data types, the actual values within the array are stored in contiginous memory locations. But in case of non-primitive types, the actual objects will be stored in the heap area. 
Elements within the array will be set to their default values when created. 0 for numeric types, false for boolean and null for objects. 
Array creation is a 2 step process: Declaration and Memory Allocation. Memory Allocation is done using new operator.  
U have multi dimensional as well as Jagged Arrays in Java. 
*/
class FirstExample{
	public static void main(String[] args) {
		//simpleArrayExample();
		//otherSyntaxExample();
		//usingForEachLoop();
		//multiDimensionalArrayExample();
		jaggedArrayExample();	
	}


	static void jaggedArrayExample(){
		//Array of Arrays is called as Jagged Array. It has a fixed no of rows and variable no of columns in each row, in this case, each row will be an array object of different size.
		//A School is an Array of classrooms and each classroom is an array of students in it. Each class has different no of students in it. 
		int [][] school = new int[4][];//4 rows in the Array...
		school[0] = new int[]{67,67,77,77};	
		school[1] = new int[]{67,45,88,66,89,90,77,77};	
		school[2] = new int[]{67,67,77,77,67,54,66,23,66,77,87,67};	
		school[3] = new int[]{67,54,66};

		for (int i =0; i <school.length ; i++ ) {//No of rows.....
			for (int score : school[i]) {//Accesing array of each row....
				System.out.print(score + " ");			
			}
			MyConsole.print("");		
		}	

	}
	static void multiDimensionalArrayExample(){
		int[][] marks = {{45,54,55,45},{65,66,76,63},{78,75,78,84},{87,90,95,81},{88,78,90,85}};

		//Displaying the data in matrix Format...
		for (int i =0; i < 5 ; i++ ) {
			for (int j =0 ; j < 4 ; j++ ) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();	
		}//Using nested For loop to read the elements and display in matrix format...

	}
	static void usingForEachLoop(){
		int [] scores = {56,67,70,65,66,87,89};//New Syntax of Array since Java 5 where no need for new operator if U create it as Array Literal....
		for (int value : scores) {
			MyConsole.print(value);
		}
	}

	static void otherSyntaxExample(){
		int size = MyConsole.getNumber("Enter the no of Fruits");
		String [] fruits = new String[size];
		for (int i=0;i < size ; i++) {
			fruits[i] = MyConsole.getString("Enter the name of the Fruit");	
		}
		int index =0;
		do{
			MyConsole.print(fruits[index]);
			index++;
		}while(index < size);
	}

	static void simpleArrayExample(){
		int values[];//Array Declaration
		values = new int[5];//Array instantiation. 
		for (int i=0; i < 5; i++) {
			values[i] = i + 1;			
		}
		for (int i =0;i < 5 ;i++ ) {
			System.console().printf("%d:%d\n", i, values[i]);			
		}	
	}
}