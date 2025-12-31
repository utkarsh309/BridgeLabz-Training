package constructor;

//Parent class
class Student {

 // Public variable
 public int rollNumber;

 // Protected variable
 protected String name;

 // Private variable
 private double cgpa;

 // Constructor
 public Student(int rollNumber, String name, double cgpa) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.cgpa = cgpa;
 }

 // Getter for CGPA
 public double getCgpa() {
     return cgpa;
 }

 // Setter for CGPA
 public void setCgpa(double cgpa) {
     this.cgpa = cgpa;
 }
}

//Child class
public class PostgraduateStudent extends Student {

 private String specialization;

 // Constructor
 public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
     super(rollNumber, name, cgpa);
     this.specialization = specialization;
 }

 // Method to display details
 public void displayDetails() {
     System.out.println("Roll Number   : " + rollNumber); // public
     System.out.println("Name          : " + name);       // protected
     System.out.println("CGPA          : " + getCgpa());  // private via getter
     System.out.println("Specialization: " + specialization);
 }

 // Main method
 public static void main(String[] args) {

     PostgraduateStudent student =new PostgraduateStudent(101, "Utkarsh", 8.6, "Computer Science");

     student.displayDetails();

     // Modify CGPA using public method
     student.setCgpa(9.0);
     System.out.println("\nUpdated CGPA: " + student.getCgpa());
 }
}
