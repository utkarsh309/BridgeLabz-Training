package oopsPractice;

//Class definition
public class Student {

	//Attributes
	private String name;
	private String rollNumber;
	private double mark1;
	private double mark2;
	private double mark3;
	
	
	
	//Constructor
	public Student(String name,String rollNumber,double mark1,double mark2,double mark3) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	
	//Method to calculate grade
	public char gradeCalculator() {
		char grade = ' ';
		
		double marks=(mark1+mark2+mark3)/3.0;
		if(marks>=90) {
			grade='A';
		}else if(marks>=80&&marks<=89) {
			grade='B';
		}else if(marks>=70&&marks<=79) {
			grade='C';
		}else {
			grade='D';
		}
		return grade;
	}
	
	public void display() {
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
		System.out.println("Student Marks: ");
		System.out.println("Mark1: "+mark1);
		System.out.println("Mark2: "+mark2);
		System.out.println("Mark3: "+mark3);
		System.out.println("Grade: "+gradeCalculator());
		
		
		
	}
	
	public static void main(String[] args) {
		
		Student student1=new Student("Thamarai","ECE001",80.0,70.0,75.0);
		Student student2=new Student("Kannan","CSC002",60.0,65.0,50.0);
		
		student1.display();
		student2.display();

	}

}
