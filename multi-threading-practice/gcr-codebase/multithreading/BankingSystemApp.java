package multithreading;


import java.time.LocalDateTime;

// BankAccount 
class BankAccount {

    private int balance = 10000;

    // synchronized to avoid race condition
    public synchronized boolean withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        if (balance >= amount) {

            // simulate processing time
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println("Transaction successful: "
                    + customerName
                    + ", Amount: " + amount
                    + ", Balance: " + balance
                    + ", Time: " + LocalDateTime.now());

            return true;
        } else {
            System.out.println("Transaction failed: "
                    + customerName
                    + ", Amount: " + amount
                    + ", Balance: " + balance
                    + ", Time: " + LocalDateTime.now());
            return false;
        }
    }
}

//Transaction
class Transaction implements Runnable {

    private BankAccount account;
    private String customerName;
    private int amount;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {

        // Display thread state before processing
        System.out.println(customerName + " - Thread State: "
                + Thread.currentThread().getState());

        account.withdraw(customerName, amount);
    }
}

// Main class
public class BankingSystemApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

