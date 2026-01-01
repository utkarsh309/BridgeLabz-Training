package keywords;

public class Student {

	//Static variable
	private static String universityName="Global University";
	private static int totalStudent=0;
	
	//Instance variable
	private String name;
	private char grade;
	
	
	//final variable
	private final int rollNumber;
	
	public Student(int rollNumber,String name,char grade) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.grade=grade;
		totalStudent++;
	}
	
	//Static method to display totalStudent
	public static void displayTotalStudent() {
		System.out.println("Total Student: "+totalStudent);
	}
	
	//Static method to display University name
	public static void displayUniversityName() {
		System.out.println("University Name: "+universityName);
	}
	
	
	
	public void displayStudentDetails() {
		if(this instanceof Student) {
		System.out.println("University Name: "+universityName);
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		}else {
			System.out.println("Invalid Object");
		}
	}
	
	
	public static void main(String[] args) {
		
		Student student1=new Student(101,"Utkarsh",'A');
		Student student2=new Student(102,"Sharmila",'A');
		
		Student.displayTotalStudent();
		student1.displayStudentDetails();
		student2.displayStudentDetails();
		
	
}
}
