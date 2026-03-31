package scenerioBased2;

import java.util.ArrayList;
import java.util.List;

public class StudentReportGenerator {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            String[] subjects = {"Math", "Science", "English"};

            int[] marks1 = {85, 78, 90};
            students.add(new Student("Utkarsh", subjects, marks1));

            int[] marks2 = {65, 72, 60};
            students.add(new Student("Aditya", subjects, marks2));

        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        for (Student student : students) {
            student.printReport();
            System.out.println();
        }
    }
}

class Student {

    private String name;
    private String[] subjects;
    private int[] marks;

    Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {

        this.name = name;
        this.subjects = subjects;
        validateMarks(marks);
        this.marks = marks;
    }

    private void validateMarks(int[] marks) throws InvalidMarkException {

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid marks found");
            }
        }
    }

    private double calculateAverage() {

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    private String getGrade(double average) {

        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public void printReport() {

        double average = calculateAverage();
        String grade = getGrade(average);

        System.out.println("Student Name: " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

class InvalidMarkException extends Exception {

    InvalidMarkException(String message) {
        super(message);
    }
}

