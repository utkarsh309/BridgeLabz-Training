package com.oops.courseRegistration;

public class StudentCourseApp {

	public static void main(String[] args) {

        // Objects
        Student student = new Student("101", "Utkarsh");
        Course java = new Course("C101", "Java Programming");
        Course dbms = new Course("C102", "DBMS");
        Course cloud = new Course("C103", "Cloud Computing");
        Course dsa = new Course("C104", "Data Structures");

        RegistrationService service = new RegistrationServiceImplementation();

        try {
            service.enrollCourse(student, java);
            service.enrollCourse(student, dbms);
            service.enrollCourse(student, cloud);

            // This will throw exception
            service.enrollCourse(student, dsa);

        } catch (CourseLimitExceededException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        service.assignGrade(student, "C101", "A");

        service.dropCourse(student, "C102");

        System.out.println("\nFinal Enrolled Courses:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course.getCourseName());
        }
    }

}
