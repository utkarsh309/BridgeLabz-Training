package com.oops.courseRegistration;

class Grade {

	private Course course;
	private String grade;
	
	Grade(Course course,String grade){
		this.course=course;
		this.grade=grade;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public String getGrade() {
		return grade;
	}
	
}
