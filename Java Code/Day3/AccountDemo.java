//This Example to show the Abstract class concept....

abstract class Account{
	int accNo;
	String accHolder;
	protected double balance;
	void creditAmount(double amount){
		balance += amount;
	}

	void debitAmount(double amount) throws Exception{
		if(amount > balance){
			throw new Exception("Insufficient Funds");
		}
		balance -= amount;
	}
	double getBalance(){
		return balance;
	}
	abstract void calculateInterest();	
}

class SBAccount extends Account{
	
}
class AccountDemo{
	public static void main(String[] args) {
		
	}
}