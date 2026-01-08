package com.EduMentor;

public class Quiz {

    private String[] questions;
    private String[] answers;   // encapsulated
    private int score;
    private String difficulty;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    public void submitAnswers(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;  // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / answers.length;
    }

    public void showResult() {
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Score: " + score + "/" + answers.length);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
