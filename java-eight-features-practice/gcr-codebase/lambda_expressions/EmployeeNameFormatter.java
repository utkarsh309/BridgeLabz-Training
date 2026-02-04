package lambda_expressions;

import java.util.*;

public class EmployeeNameFormatter {

    public static void main(String[] args) {

        List<String> employeeNames =Arrays.asList("rahul", "anita", "suresh");

        // Convert names to uppercase
        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);
    }
}
