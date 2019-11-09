//FifthExample.java:ExpenseManager...
import java.util.*;
//import java.time.*;//for date and time...
class Expense{
	private int id;
	private double amount;
	private String details;
	private Date date;

	//What is function?
	Expense(int id, double amount, Date date, String info){
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.details = info;
	}

	public String toString(){
		return String.format("Details: %s\nAmount: %f\nExpenseID:%d", details, amount, id);
	}
	//todo: create get Accessors to all the fields....
	public int getId(){ return id;}
	public int getAmount(){ return amount;}
	public int getDetails(){ return details;}
	public int getDate(){ return date;}
}
//////////////////Manager class////////////////////////////
class ExpenseManager{
	protected Expense [] _allExpenses;
	int size = 0;
	
	ExpenseManager(int size){
		_allExpenses = new Expense[size];
		this.size = size;
	}

	public void addNewExpense(Expense ex){
		for (int i =0;i <size ;i++ ) {
			if(_allExpenses[i] == null){
				_allExpenses[i] = new Expense(ex.getId(), ex.getAmount(), ex.getDate(), ex.getDetails());
				return;//exit the function once the insertion is completed...
			}else continue;			
		}
	}

	public void updateExpense(Expense ex){
		for (int i =0; i < size ; i++ ) {
			if((_allExpenses[i] != null) && (_allExpenses[i].getId() == ex.getId())){
				_allExpenses[i] = new Expense(ex.getId(), ex.getAmount(), ex.getDate(), ex.getDetails());//Updating the location with new details
				return;
			}else continue;
		}
	}

	public void deleteExpense(int id){
		for (int i =0; i < size ; i++ ) {
			if((_allExpenses[i] != null) && (_allExpenses[i].getId() == id)){
				//There is no delete operator in Java....
				_allExpenses[i] = null;//Makes the object unusable....
				return;
			}
		}
	}
	public Expense[] findExpense(String detail){
		int loc = 0;
		Expense [] temp = new Expense[0];
		for(Expense ex : _allExpenses){
			if((ex != null) && (ex.getDetails().contains(detail))){
				
			}
		}
	}

}

//////////////////////////Utility Class///////////////////
class ExpenseFactory{
	public static ExpenseManager expenseManager(String type){
		if(type.equals("Array")){//Use equals for comparing reference types....
			int size = MyConsole.getNumber("Enter the no of Expenses to hold");
			return new ExpenseManager(size);
		}
		return null;//No memory is allocated....
	}
}
/////////////////UI Class///////////////////////////////
class FifthExample{
	static ExpenseManager _mgr = ExpenseFactory.expenseManager("Array");

	private static String getMenu(){
		String menu = "~~~~~~EXPENSE MANAGER SOFTWARE~~~~~~~~\n";
		menu += "TO ADD NEW EXPENSE------------->PRESS 1\n";
		menu += "TO DELETE AN EXPENSE----------->PRESS 2\n";
		menu += "TO FIND EXPENSES--------------->PRESS 3\n";
		menu += "NOTE: ANY OTHER KEY IS CONSIDERED AS EXIT";
		return menu;
	}
	public static void main(String[] args) {
		if(_mgr == null){
			MyConsole.print("OOPS! Something wrong happened!!!\n");
			return;
		}
		processProgram();
	}
	private static void processProgram(){
		boolean processing = true;
		String menu = getMenu();
		do{
			int choice = MyConsole.getNumber(menu);
			processing = processMenu(choice);
		}while(processing);
	}

	private static boolean processMenu(int choice){
		switch (choice) {
			case 1:
			 addingExpense();
			 break;
			case 2:
			MyConsole.print("Do it URSelf....");
			break;		
			case 3:
				findingExpense();
				break;
			default:
				return false;
		}
		return true;
	}

	private static void findingExpense(){
		String detail = MyConsole.getString("Enter the detail or part of the detail to find the expenses");
		try{
			Expense [] expenses = _mgr.findExpense(detail);
			for (Expense ex : expenses ) {
				if(ex != null)
					MyConsole.print(ex);
			}
		}catch(Exception ex){
			MyConsole.print(ex.getMessage());
		}
	}
	private static void addingExpense(){
		try{
		int id = MyConsole.getNumber("Enter the ID of the Expense");
		String detail = MyConsole.getString("Enter the Expense Details in brief");
		double amount = MyConsole.getDouble("Enter the Amount spent on that Expense");
		int dd = MyConsole.getNumber("Enter the day");
		int mm = MyConsole.getNumber("Enter the month");
		int yy = MyConsole.getNumber("Enter the year");
		Date dt = new Date(yy,mm, dd);
		Expense ex = new Expense(id, amount, dt, detail);
		_mgr.addNewExpense(ex);
		MyConsole.print("Expense added Successfully");
		}catch(Exception ex){
			MyConsole.print(ex.getMessage());
		}
	}
}.