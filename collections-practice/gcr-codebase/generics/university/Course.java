package generics.university;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
        System.out.println("Added: " + course.getName());
    }

    public List<T> getCourses() {
        return courses;
    }

    // Wildcard method: 
    public static void displayCourses(List<? extends CourseType> list) {

        System.out.println("\nCourse List:");

        for (CourseType course : list) {
            System.out.println(course.getName() + "  " + course.getEvaluationMethod());
        }
    }
}
