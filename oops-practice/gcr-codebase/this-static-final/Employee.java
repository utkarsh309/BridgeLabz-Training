package keywords;
//Class Definition
public class Employee {
	
	//Static variable
	private static String companyName="Tech Solutions Inc.";
	private static int totalEmployee=0;
	
	//Instance variable
	private String name;
	private String designation;
	
	//final variable
	private final int id;
	
	public Employee(String name,int id,String designation) {
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployee++;
	}
	
	//Static method to display totalEmployee
	public static void displayTotalEmployee() {
		System.out.println("Total Employee: "+totalEmployee);
	}
	
	//Static method to display Company name
	public static void displayCompanyName() {
		System.out.println("Comapany Name: "+companyName);
	}
	
	
	
	public void displayEmployeeDetails() {
		
		if(this instanceof Employee) {
		System.out.println("Company Name: "+companyName);
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		}else {
			System.out.println("Invalid Object");
		}
	}
		
	
	
	public static void main(String[] args) {
		
		Employee employee1=new Employee("Utkarsh",101,"Software Engineer");
		Employee employee2=new Employee("Rohan",102,"Project Manager");
		
		Employee.displayTotalEmployee();
		employee1.displayEmployeeDetails();
		employee2.displayEmployeeDetails();
		
	}

}
