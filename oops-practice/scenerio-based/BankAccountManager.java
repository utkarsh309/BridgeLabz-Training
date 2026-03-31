package scenerioBased2;
//Create BankAccountManager class to  perform operations like deposit, withdraw, and check balance for a user.
public class BankAccountManager {

	//Fields
	private String accountNumber;
	private double balance;
	
	//Constructor
	BankAccountManager(String accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	//Method to deposit money
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Successfully Deposited: "+amount);
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	//Method to Withdraw money
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid Amount");
		}else if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance-=amount;
			System.out.println("Withdrawal Successfull of amount "+amount);
		}
	}
	
	//Method to check balance
	 public void checkBalance() {
	        System.out.println("Current Balance: " + balance);
	    }
	
	
	
	public static void main(String[] args) {
		
		BankAccountManager account1=new BankAccountManager("15698745",2000);
		
		account1.checkBalance();
		account1.deposit(1000);
		account1.withdraw(1500);
		account1.withdraw(2000);
		account1.checkBalance();
		
	}

}
