package functional_interface;

//PaymentProcessor interface
interface PaymentProcessor {

 void pay(double amount);

 // New feature
 default void refund(double amount) {
     System.out.println("Refund of " + amount + " processed .");
 }
}

//UPI payment provider
class UPIProcessor implements PaymentProcessor {

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using UPI");
 }
 
}

//Credit Card payment provider
class CreditCardProcessor implements PaymentProcessor {

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Credit Card");
 }

 // Custom refund implementation
 @Override
 public void refund(double amount) {
     System.out.println("Refund of " + amount + " processed .");
 }
}

//Wallet payment provider
class WalletProcessor implements PaymentProcessor {

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using Wallet");
 }
 
}

//Main class
public class PaymentGatewayApp {

 public static void main(String[] args) {

     PaymentProcessor upi = new UPIProcessor();
     PaymentProcessor card = new CreditCardProcessor();
     PaymentProcessor wallet = new WalletProcessor();

     upi.pay(1000);
     upi.refund(200);

     card.pay(2000);
     card.refund(500);

     wallet.pay(500);
     wallet.refund(100);
 }
}
