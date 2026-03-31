package scenerioBased2;

//Custom Exception 
class InvalidInvoiceFormatException extends Exception {

public InvalidInvoiceFormatException(String message) {
  super(message);
}
}
//Create InvoiceGenerator class to generate invoice
public class InvoiceGeneratorExceptionHandling {

 public static void main(String[] args) {

     String input = "Logo Design  3000 INR, Web Page - 4500 INR";

     try {
         String[][] taskAndAmount = parseInvoice(input);
         System.out.println("Total Amount: " + getTotalAmount(taskAndAmount[1]));
     } catch (InvalidInvoiceFormatException exception) {
         System.out.println("Error: " + exception.getMessage());
     }
 }

 // Method to separate task and amount
 public static String[][] parseInvoice(String input)
         throws InvalidInvoiceFormatException {

     if (input == null || input.trim().isEmpty()) {
         throw new InvalidInvoiceFormatException("Invoice input is empty.");
     }

     String[] tasks = input.trim().split(",");

     // Dynamic array size based on number of tasks
     String[][] taskAndAmount = new String[2][tasks.length];
     int index = 0;

     for (String task : tasks) {

         // Validate dash
         if (!task.contains("-")) {
             throw new InvalidInvoiceFormatException(
                     "Invalid format: '-' missing in '" + task + "'");
         }

         String[] taskName = task.trim().split("-");

         // Validate amount part
         if (taskName.length < 2 || taskName[1].trim().isEmpty()) {
             throw new InvalidInvoiceFormatException(
                     "Invalid format: amount missing in '" + task + "'");
         }

         String[] amount = taskName[1].trim().split(" ");

         // Validate numeric amount
         if (amount.length == 0 || amount[0].isEmpty()) {
             throw new InvalidInvoiceFormatException(
                     "Invalid format: amount value missing in '" + task + "'");
         }

         taskAndAmount[0][index] = taskName[0].trim();
         taskAndAmount[1][index] = amount[0].trim();
         index++;
     }

     return taskAndAmount;
 }

 // Method to calculate total amount
 public static int getTotalAmount(String[] amounts) {

     int totalAmount = 0;

     for (String amount : amounts) {
         totalAmount += Integer.parseInt(amount);
     }

     return totalAmount;
 }
}


