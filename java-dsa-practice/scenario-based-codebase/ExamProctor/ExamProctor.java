package com.ExamProctor;

import java.util.*;
public class ExamProctor {
	//questionId -> answer
	Stack<Integer> navigationStack = new Stack<>();
	//mapto store answer: 
	HashMap<Integer ,String> answerMap = new HashMap<>();
	
	//now wewill store answer in hashmap (correct answer);
	HashMap<Integer ,String> correctAnswers = new HashMap<>();
	ExamProctor(){
		correctAnswers.put(1 , "A");
		correctAnswers.put(2 , "B");
		correctAnswers.put(3 , "C");
		correctAnswers.put(4 , "A");
	}
	//visit the questions
	void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question " + questionId);
	}
	void submitAnswer(int questionId ,String answer) {
		answerMap.put(questionId , answer);
		System.out.println("Answer saved for Q" + questionId);
	}
	void goBack() {
		if(!navigationStack.isEmpty()) {
			int lastquestion = navigationStack.pop();
			System.out.println("Back from Question " + lastquestion);
		}
	}
	int evaluateScore() {
		int score=0;
		for(Map.Entry<Integer , String>entry :correctAnswers.entrySet()) {
			int qId = entry.getKey();
			String correct = entry.getValue();
			if(answerMap.containsKey(qId) && answerMap.get(qId).equals(correct)) {
				score++;
			}
		}
		return score;
	}
	void submitExam() {
        System.out.println("\nExam Submitted");
        int finalScore = evaluateScore();
        System.out.println("Final Score: " + finalScore);
    }
	public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "B");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.visitQuestion(4);
        exam.submitAnswer(4, "D");

        exam.goBack();   // stack pop example

        exam.submitExam();
    }

}

//ExamProctor – Online Exam Review System (Stack + HashMap +
//Functions)
//Story: During an online exam, each student’s question navigation is recorded using a Stack
//(last visited question). Answers are stored in a HashMap: questionID → answer.
//A function auto-calculates the score once the student submits.
//Requirements:
//● Track navigation with stack.
//● Store answers in a map.
//● Evaluate using functions for scoring logic.
