package oopsPractice;
//Class Definition
public class Employee {
	
	//Attributes
	private String name;
	private int id;
	private int salary;
	
	//Constructor
	public Employee(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	//Method to display employee details
	public void displayDetails() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Salary: "+salary);
	}
	
	//Main Method
	public static void main(String[] args) {
		
		//Create Employee object
		Employee employee1=new Employee("Rohan",1,500000);
		
		//Display details of each employee
		System.out.println("Employee 1");
		employee1.displayDetails();
		
	}
	
}

