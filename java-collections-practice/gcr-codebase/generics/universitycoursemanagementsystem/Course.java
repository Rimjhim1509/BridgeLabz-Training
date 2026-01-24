package com.generics.universitycoursemanagementsystem;

class Course<T extends CourseType>{
	private String courseName;
	private T courseType;
	public Course(String courseName ,T courseType) {
		this.courseName = courseName;
		this.courseType = courseType;
		
	}
	public T getCourseType() {
		return courseType;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + this.courseName + ", CourseType=" + courseType.getEvaluation() + "]";
	}
}
//Every course has some evaluation style, but implementation differs.