package Inheritance;

//Class Definition
class BankAccount{
	
	//Attributes
	protected long accountNumber;
	protected int balance;
	
	BankAccount(long accountNumber,int balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void displayInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}

//Class Definition
class SavingAccount extends BankAccount{
	
	//Attributes
	protected double interestRate;
	
	SavingAccount(long accountNumber,int balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	
	//Override display method
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Interest Rate: "+interestRate);
	}
	
	
}

//Class Definition
class CheckingAccount extends BankAccount{
	
	//Attributes
	protected double withdrawalLimit;
	
	//Constructor
	CheckingAccount(long accountNumber,int balance,double withdrawalLimit){
		super(accountNumber, balance);
		this.withdrawalLimit=withdrawalLimit;
	}
	
	//Override display method
		@Override
		public void displayInfo() {
			super.displayInfo();
			System.out.println("Withdrawal Limit: "+withdrawalLimit);
		}
	
	
}

//Class Definition
class FixedDepositAccount extends BankAccount{
	
	//Attributes
	protected double fixedBalance;
	
	//Constructor
	FixedDepositAccount(long accountNumber,int balance,double fixedBalance){
		super(accountNumber, balance);
		this.fixedBalance=fixedBalance;
	}
	
	//Override display method
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fixed Balance: "+fixedBalance);
	}
	
}


public class Bank {

	public static void main(String[] args) {
		
		SavingAccount savingAccount=new SavingAccount(569856,20080,4.5);
		CheckingAccount checkingAccount=new CheckingAccount(567854,30050,10000);
		FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(659854,25634,5000);
		
		//Display details
		savingAccount.displayInfo();
		checkingAccount.displayInfo();
		fixedDepositAccount.displayInfo();
		
	}

}
