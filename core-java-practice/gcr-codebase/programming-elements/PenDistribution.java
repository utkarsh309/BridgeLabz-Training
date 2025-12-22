//Create PenDistribution class to calculate pen distribution among students

public class PenDistribution {
    public static void main(String[] args) {
        
        //Create variable to store total pens and total students
        int totalPens=14,totalStudents=3;

        //Calculate pens per student
        int pensPerStudent=totalPens/totalStudents;

        //Calculate pens un-distributed
        int remainingPen=totalPens%totalStudents;

        //Display result
        System.out.println("The Pen Per Student is "+ pensPerStudent+
            " and the remaining pen not distributed is " + remainingPen
        );
    }
}
