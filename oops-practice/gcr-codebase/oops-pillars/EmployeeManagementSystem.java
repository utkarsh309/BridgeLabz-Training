package oopsPillars;

// Abstract Class
abstract class Employee {

    // Encapsulated Attributes
    private int employeeId;
    private String name;
    private double baseSalary;

    // Common Setter
    public void setDetails(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Interface
interface Department {

    void assignDepartment(String department);

    void getDepartmentDetails();
}

// SubClass
class FullTimeEmployee extends Employee implements Department {

    private static final int WORK_HOUR = 8;
    private String department;

    // Constructor
    FullTimeEmployee(int employeeId, String name, double baseSalary) {
        setDetails(employeeId, name, baseSalary);
    }

    // Overriding Method
    @Override
    public double calculateSalary() {
        return WORK_HOUR * getBaseSalary();
    }

    // Setter
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Getter
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// SubClass
class PartTimeEmployee extends Employee implements Department {

    private static final int WORK_HOUR = 4;
    private String department;

    // Constructor
    PartTimeEmployee(int employeeId, String name, double baseSalary) {
        setDetails(employeeId, name, baseSalary);
    }

    // Overriding Method
    @Override
    public double calculateSalary() {
        return WORK_HOUR * getBaseSalary();
    }

    // Setter
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Getter
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// Main Class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Parent reference pointing to child objects
        Employee employee1 = new FullTimeEmployee(101, "Utkarsh", 2000);
        Employee employee2 = new PartTimeEmployee(102, "Aditya", 1500);

        // Store employees in an array 
        Employee[] employees = { employee1, employee2 };

        // Assign departments
        ((Department) employee1).assignDepartment("Software");
        ((Department) employee2).assignDepartment("Testing");

        // Process employees using Employee reference
        for (Employee emp : employees) {
            
            ((Department) emp).getDepartmentDetails();
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
        }
    }
}
