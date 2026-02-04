package functional_interface;

//Marker Interface
interface BackupSerializable {
 // No methods
}

//Class eligible for backup
class UserData implements BackupSerializable {

 private String username;
 private String email;

 public UserData(String username, String email) {
     this.username = username;
     this.email = email;
 }

 public String getDetails() {
     return "User: " + username + ", Email: " + email;
 }
}

//Another eligible class
class TransactionData implements BackupSerializable {

 private int transactionId;
 private double amount;

 public TransactionData(int transactionId, double amount) {
     this.transactionId = transactionId;
     this.amount = amount;
 }

 public String getDetails() {
     return "Transaction ID: " + transactionId + ", Amount: " + amount;
 }
}

//NOT eligible for backup
class TemporaryCache {

 private String cacheData;

 public TemporaryCache(String cacheData) {
     this.cacheData = cacheData;
 }

 public String getDetails() {
     return "Cache: " + cacheData;
 }
}

//Backup processor
class BackupService {

 public static void processBackup(Object obj) {

     if (obj instanceof BackupSerializable) {
         System.out.println("Backing up data -> " + obj.getClass().getSimpleName());
     } else {
         System.out.println("Backup skipped -> " + obj.getClass().getSimpleName());
     }
 }
}

//Main class
public class BackupSystem {

 public static void main(String[] args) {

     UserData user = new UserData("Utkarsh", "user@email.com");
     TransactionData txn = new TransactionData(101, 2500);
     TemporaryCache cache = new TemporaryCache("Temp session data");

     BackupService.processBackup(user);
     BackupService.processBackup(txn);
     BackupService.processBackup(cache);
 }
}