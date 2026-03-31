package csvdatahandling;

import java.io.*;
import java.util.*;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id +
               ", Name=" + name +
               ", Department=" + department +
               ", Salary=" + salary + "]";
    }
}

public class SortCSVBySalary {

    public static void main(String[] args) {
        String filePath = "employees.csv";
        printTop5HighestPaid(filePath);
    }

    public static void printTop5HighestPaid(String filePath) {

        List<Employee> employeeList = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                employeeList.add(new Employee(id, name, department, salary));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
            return;
        }

        // Sort by salary descending
        employeeList.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("Top 5 Highest-Paid Employees:");
       

        int limit = Math.min(5, employeeList.size());

        for (int i = 0; i < limit; i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
