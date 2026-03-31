package com.oops.onlineexamsystem;

import java.util.ArrayList;

class OnlineExamService {

	private EvaluationStrategy evaluationStrategy;

    public OnlineExamService(EvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy;
    }

    public int submitAnswers(Exam exam, ArrayList<String> answers, boolean timeExpired)
            throws ExamTimeExpiredException {

        if (timeExpired) {
            throw new ExamTimeExpiredException("Exam time expired. Submission rejected.");
        }

        return evaluationStrategy.evaluate(exam.getQuestions(), answers);
    }
}
