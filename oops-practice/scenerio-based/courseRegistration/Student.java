package com.oops.courseRegistration;

import java.util.List;
import java.util.ArrayList;

//Class Student
class Student extends Person{
	
	private List<Course> enrolledCourses=new ArrayList<>();
	private List<Grade> grades=new ArrayList<>();
	
	Student(String studentId,String studentName){
		super(studentId,studentName);
	}
	
	public List<Course> getEnrolledCourses(){
		return enrolledCourses;
	}
	
	public List<Grade> getGrades() {
        return grades;
    }
	
	
}
