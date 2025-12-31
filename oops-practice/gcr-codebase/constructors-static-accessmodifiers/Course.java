package constructor;

public class Course {

    // Instance variables
    private String courseName;
    private int duration;     // duration in months
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName = "ABC Institute";

    // Parameterized Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method
    public static void main(String[] args) {

        Course course1 = new Course("Core Java", 3, 15000);
        Course course2 = new Course("Full Stack", 6, 35000);

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
        System.out.println("\nUpdating Institute Name...\n");

        // Update institute name for all courses
        Course.updateInstituteName("BridgeLabz");

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
    }
}

