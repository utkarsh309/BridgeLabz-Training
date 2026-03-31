package lambda_expressions;

import java.util.*; 

class Invoice {

    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice generated for Transaction ID: " + transactionId;
    }
}

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds =Arrays.asList(1001, 1002, 1003);

        // Constructor reference
        transactionIds.stream()
                      .map(Invoice::new)
                      .forEach(System.out::println);
    }
}
