package controlFlow;

//Create StudentGradeCalculator class to calculate percentage, grade, and remarks
import java.util.Scanner;

class StudentGradeCalculator {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take marks input for three subjects
     int physicsMarks = input.nextInt();
     int chemistryMarks = input.nextInt();
     int mathsMarks = input.nextInt();

     // Store constants
     int totalSubjects = 3;
     int maximumMarksPerSubject = 100;

     // Calculate total marks obtained
     int totalMarksObtained = physicsMarks + chemistryMarks + mathsMarks;

     // Calculate total maximum marks
     int totalMaximumMarks = totalSubjects * maximumMarksPerSubject;

     // Calculate percentage using proper formula
     double percentage = (double) totalMarksObtained / totalMaximumMarks * 100;

     // Variables to store grade and remarks
     String grade;
     String remarks;

     // Determine grade and remarks
     if (percentage >= 80) {
         grade = "A";
         remarks = "Level 4, above agency-normalized standards";
     } else if (percentage >= 70) {
         grade = "B";
         remarks = "Level 3, at agency-normalized standards";
     } else if (percentage >= 60) {
         grade = "C";
         remarks = "Level 2, below but approaching agency-normalized standards";
     } else if (percentage >= 50) {
         grade = "D";
         remarks = "Level 1, well below agency-normalized standards";
     } else if (percentage >= 40) {
         grade = "E";
         remarks = "Level 1-, too below agency-normalized standards";
     } else {
         grade = "R";
         remarks = "Remedial standards";
     }

     // Display the result
     System.out.println("The Average Mark is " + percentage + ", Grade is " + grade + " and Remarks are " + remarks);

     // Close the scanner
     input.close();
 }
}

