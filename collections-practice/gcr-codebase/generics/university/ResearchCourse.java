package generics.university;

public class ResearchCourse extends CourseType {

    public ResearchCourse(String name) {
        super(name);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Research Work";
    }
}
