package com.EduMentor;

public class Edumentor {
	public static void main(String[] args) {
		Learner l1 =new Learner("riya" , "riyachatur@gmail.com" ,"L101",true);
        String[] q = {"Java is OOP?", "Interface supports multiple inheritance?"};
        String[] a = {"Yes", "Yes"};
        Quiz quiz =new Quiz(q,a,"Medium");
        quiz.submitAnswers(new String[]{"Yes", "Yes"});
        quiz.showResult();

        l1.generateCertificate();

	}
}
