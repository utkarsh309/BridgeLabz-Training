package com.oops.onlineexamsystem;

import java.util.ArrayList;

interface EvaluationStrategy {

    int evaluate(ArrayList<Question> questions, ArrayList<String> studentAnswers);
}