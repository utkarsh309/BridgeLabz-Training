package generics.university;


public class UniversityApp {

    public static void main(String[] args) {

        // Different course managers
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add courses
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Java Programming"));

        researchCourses.addCourse(new ResearchCourse("AI Research"));

        // Display using wildcard method
        Course.displayCourses(examCourses.getCourses());
        Course.displayCourses(assignmentCourses.getCourses());
        Course.displayCourses(researchCourses.getCourses());
    }
}

