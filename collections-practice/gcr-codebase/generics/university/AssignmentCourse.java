package generics.university;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String name) {
        super(name);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Assignments";
    }
}
