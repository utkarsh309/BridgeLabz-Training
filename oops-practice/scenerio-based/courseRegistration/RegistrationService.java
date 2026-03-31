package com.oops.courseRegistration;

abstract class RegistrationService {

	public abstract void enrollCourse(Student student,Course course) throws CourseLimitExceededException;
	
	public abstract void dropCourse(Student student, String courseCode);

    public abstract void assignGrade(Student student, String courseCode, String grade);
	
}
