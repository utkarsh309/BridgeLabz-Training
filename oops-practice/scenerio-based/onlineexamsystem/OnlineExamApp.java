package com.oops.onlineexamsystem;

import java.util.ArrayList;

public class OnlineExamApp {

    public static void main(String[] args) {

        // Create exam
        Exam exam = new Exam("Java Test");

        exam.addQuestion(new Question(1, "What is JVM?", "Virtual Machine", 10));
        exam.addQuestion(new Question(2, "Java is platform independent?", "Yes", 10));

        // Student
        Student student = new Student(101, "Utkarsh");

        // Student answers
        ArrayList<String> answers = new ArrayList<>();
        answers.add("Virtual Machine");
        answers.add("Yes");

        // Choose evaluation type
        EvaluationStrategy strategy = new ObjectiveEvaluation();
        OnlineExamService service = new OnlineExamService(strategy);

        try {
            int result = service.submitAnswers(exam, answers, false);
            System.out.println("Student: " + student.getStudentName());
            System.out.println("Score: " + result);
            
        } catch (ExamTimeExpiredException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}