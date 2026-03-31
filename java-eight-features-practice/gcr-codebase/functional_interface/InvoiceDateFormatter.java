package functional_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Interface with static utility method
interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

// Main class 
public class InvoiceDateFormatter {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateUtils.formatDate(invoiceDate, "dd MMM yyyy");

        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (yyyy/MM/dd): " + format2);
        System.out.println("Invoice Date (dd MMM yyyy): " + format3);
    }
}
