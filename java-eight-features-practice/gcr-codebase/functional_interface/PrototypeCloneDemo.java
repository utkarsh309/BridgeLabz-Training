package functional_interface;

//Prototype class
class Product implements Cloneable {

 private int id;
 private String name;
 private double price;

 public Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 
 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone(); 
 }

 public void display() {
     System.out.println("Product [id=" + id + ", name=" + name + ", price=" + price + "]");
 }
}

//Main class
public class PrototypeCloneDemo {

 public static void main(String[] args) {

     try {
         // Original prototype object
         Product original = new Product(101, "Insurance Policy", 5000);
         original.display();

         // Clone the prototype
         Product copy = (Product) original.clone();
         copy.display();

     } catch (CloneNotSupportedException e) {
         System.out.println("Cloning not supported");
     }
 }
}
