package com.oops.courseRegistration;

public class RegistrationServiceImplementation extends RegistrationService {

    private static final int MAX_COURSE_LIMIT = 3;

    @Override
    public void enrollCourse(Student student, Course course) throws CourseLimitExceededException {

        if (student.getEnrolledCourses().size() >= MAX_COURSE_LIMIT) {
            throw new CourseLimitExceededException("Course limit exceeded. Max allowed: " + MAX_COURSE_LIMIT);
        }

        student.getEnrolledCourses().add(course);
        System.out.println("Enrolled in: " + course.getCourseName());
    }

    @Override
    public void dropCourse(Student student, String courseCode) {

        boolean removed = false;

        for (int i = 0; i < student.getEnrolledCourses().size(); i++) {

            Course course = student.getEnrolledCourses().get(i);

            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                student.getEnrolledCourses().remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Course dropped successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }


    @Override
    public void assignGrade(Student student, String courseCode, String grade) {

        for (Course course : student.getEnrolledCourses()) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                student.getGrades().add(new Grade(course, grade));
                System.out.println("Grade assigned successfully.");
                return;
            }
        }

        System.out.println("Student not enrolled in this course.");
    }
}
