package com.oops.onlineexamsystem;

import java.util.ArrayList;

public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(ArrayList<Question> questions, ArrayList<String> studentAnswers) {

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {

            Question question = questions.get(i);
            String correctAnswer = question.getCorrectAnswer();
            String studentAnswer = studentAnswers.get(i);

            if (correctAnswer.equalsIgnoreCase(studentAnswer)) {
                score = score + question.getMarks();
            }
        }

        return score;
    }
 }
