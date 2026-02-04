package functional_interface;

//Marker interface
interface SensitiveData {
 
}

//Sensitive class
class UserCredentials implements SensitiveData {

 private String username;
 private String password;

 public UserCredentials(String username, String password) {
     this.username = username;
     this.password = password;
 }

 public String getData() {
     return "Username: " + username + ", Password: " + password;
 }
}


//Non-sensitive class
class ProductInfo {

 private String productName;

 public ProductInfo(String productName) {
     this.productName = productName;
 }

 public String getData() {
     return "Product: " + productName;
 }
}

//Encryption processor
class EncryptionService {

 public static void process(Object obj) {

     if (obj instanceof SensitiveData) {
         System.out.println("Encrypting data -> " + obj.getClass().getSimpleName());
     } else {
         System.out.println("No encryption needed -> " + obj.getClass().getSimpleName());
     }
 }
}

//Main class
public class SensitiveDataEncryptionApp {

 public static void main(String[] args) {

     UserCredentials user = new UserCredentials("admin", "pass123");
     ProductInfo product = new ProductInfo("Laptop");

     EncryptionService.process(user);
     EncryptionService.process(product);
 }
}
