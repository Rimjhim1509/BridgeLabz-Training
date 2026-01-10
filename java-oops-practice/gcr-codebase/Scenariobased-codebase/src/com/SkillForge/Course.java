package com.SkillForge;
import java.util.*;
public class Course implements ICertifiable {
	private String title ;
	private Instructor instructor ;
	private double rating;
	private List<String>modules;
	private List<String>reviews;
	private String level ;	
	public Course(String title ,Instructor instructor,String level) {
		this.title = title ;
		this.instructor =instructor;
		this.level = level;
		this.modules =new ArrayList<>();
		this.reviews = new ArrayList<>();
	}
	public Course(String title ,Instructor instructor,String level,List<String>modules) {
		this.title = title ;
		this.instructor =instructor;
		this.level = level;
		this.modules =modules;
		this.reviews = new ArrayList<>();
	}
	protected void addReview(String review) {
		reviews.add(review);
	}
	protected void calculateRating(int stars ,double  totalReview) {
		rating =(double)stars /totalReview;
	}
	public double getRating() {
		return rating;
	}
	public void generateCertificate() {
		if(level.equalsIgnoreCase("Beginner")) {
			System.out.println("Certificate: Course Completion Certificate");
		} else {
            System.out.println("Certificate: Professional Skill Certification");
        }
	}
	
}
 