package functional_interface;

//Interface
interface Payment {
 void pay();
}

//UPI payment
class UPI implements Payment {

 @Override
 public void pay() {
     System.out.println("Payment done using UPI");
 }
}

//Credit Card payment
class CreditCard implements Payment {

 @Override
 public void pay() {
     System.out.println("Payment done using Credit Card");
 }
}

//Wallet payment
class Wallet implements Payment {

 @Override
 public void pay() {
     System.out.println("Payment done using Wallet");
 }
}

//Main class
public class DigitalPaymentSystem {

 public static void main(String[] args) {

     Payment upi = new UPI();
     Payment card = new CreditCard();
     Payment wallet = new Wallet();

     upi.pay();
     card.pay();
     wallet.pay();
 }
}
