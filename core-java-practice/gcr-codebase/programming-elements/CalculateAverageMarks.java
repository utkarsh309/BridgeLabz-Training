// Create CalculateAverageMarks Class to to compute average marks.

public class CalculateAverageMarks {
    public static void main(String[]args){
        //Create a string variable to store student name
        String name="Sam";

        //Create integer variables to store marks of subjects
        int mathMarks=94,physicsMarks=95,chemistryMarks=96;

        //Create an integer variables to store total number of subjects
        int totalSubjects=3;

        //Create an integer variables to store maximum marks per subject
        int maximumMarksPerSubject=100;

        //Calculate total marks obtained
        int totalMarksObtained=mathMarks+physicsMarks+chemistryMarks;

        //Calculate total maximum marks
        int totalMaximumMarks=totalSubjects*maximumMarksPerSubject;

        //Calculate average percentage marks
        double averagePercentageMarks=(double)totalMarksObtained/totalMaximumMarks*100;

        //Display the result
        System.out.println("Sam's average mark in PCM is " + averagePercentageMarks);

    }
}
