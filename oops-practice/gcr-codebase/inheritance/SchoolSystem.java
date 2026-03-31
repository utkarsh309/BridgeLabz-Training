package Inheritance;

//Superclass
class Persons {

	//Attributes
	protected String name;
	protected int age;

 	// Constructor
 	Persons(String name, int age) {
 		this.name = name;
 		this.age = age;
 	}

 	// Common method
 	public void displayInfo() {
 			System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 	}
}

//Subclass
class Teacher extends Persons {

	//Attributes
	private String subject;
 	//Constructor
 	Teacher(String name, int age, String subject) {
 		super(name, age);
 		this.subject = subject;
 	}

 	public void displayRole() {
 		displayInfo();
 		System.out.println("Role: Teacher");
 		System.out.println("Subject: " + subject);
 	}
}

//Subclass
class Student extends Persons {
	//Attributes
	private String grade;
	//Constructor
	Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void displayRole() {
		displayInfo();
		System.out.println("Role: Student");
		System.out.println("Grade: " + grade);
 }
}

//Subclass
class Staff extends Persons {

	//Attributes
	private String department;
	
	//Constructor
	Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public void displayRole() {
		displayInfo();
		System.out.println("Role: Staff");
		System.out.println("Department: " + department);
	}
}



public class SchoolSystem {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Amit", 18, "12th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}

