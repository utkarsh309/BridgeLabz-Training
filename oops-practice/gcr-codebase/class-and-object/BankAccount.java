package oopsPractice;

//Class BankAccount to manage bank details
public class BankAccount {

	//Attributes
	private String accountHolder;
	private int accountNumber;
	private double balance;
	double depositingAmount;
	double withdrawingAmount;
	
	//Constructor
	public BankAccount(String accountHolder,int accountNumber,double balance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//Method to deposit money
	public void depositeMoney(double depositeAmount) {
		depositingAmount=depositeAmount;
		balance+=depositeAmount;
		System.out.println("Deposited: "+depositingAmount);
		this.displayBalance();
	}
	
	//Method to withdraw money
	public void withdrawMoney(double withdrawAmount) {
		withdrawingAmount=withdrawAmount;
		if(withdrawAmount<=balance) {
			balance-=withdrawAmount;
			System.out.println("Withdrwal :"+withdrawingAmount);
			this.displayBalance();
		}else {
			System.out.println("Insufficient balance");
		}
		
	}
	
	//Method to display current balance
	public void displayBalance() {
		System.out.println("Current Balance: "+balance);
	}
	
	
	
	public static void main(String[] args) {
		
		BankAccount customer1=new BankAccount("Utkarsh",852912,2000);
		
		customer1.displayBalance();
		customer1.depositeMoney(200);
		customer1.withdrawMoney(1500);
		customer1.withdrawMoney(1000);
		
		
		

	}

}
