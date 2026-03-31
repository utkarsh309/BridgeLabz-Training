package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	
	private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    } 
	
}


public class EmployeeSalaryCategorization {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", "IT", 60000));
        employees.add(new Employee("Anita", "IT", 70000));
        employees.add(new Employee("Mohan", "HR", 50000));
        employees.add(new Employee("Sneha", "HR", 55000));
        employees.add(new Employee("Vikas", "Finance", 80000));
        
        Map<String,Double> averageSalaryByDepart=
        		employees.stream()
        			.collect(Collectors.groupingBy(
        					employee->employee.getDepartment(),
        					Collectors.averagingDouble(
        							employee->employee.getSalary()
        							)
        					
        					));
        
        averageSalaryByDepart.forEach((dept,avgSalary)->
        	System.out.println(dept + " → Average Salary: " + avgSalary)
        		);
	}
}
