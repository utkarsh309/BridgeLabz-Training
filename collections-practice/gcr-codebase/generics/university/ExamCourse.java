package generics.university;

public class ExamCourse extends CourseType {

    public ExamCourse(String name) {
        super(name);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Written Exam";
    }
}
