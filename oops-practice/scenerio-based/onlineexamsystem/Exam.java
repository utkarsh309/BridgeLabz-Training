package com.oops.onlineexamsystem;


import java.util.ArrayList;
class Exam {

	private String examName;
    private ArrayList<Question> questions;

    public Exam(String examName) {
        this.examName = examName;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public String getExamName() {
        return examName;
    }
}
