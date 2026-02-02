package annotations.repeatableannotation;

public class BugTracker {

    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "UI not refreshing after save")
    public void processData() {
        System.out.println("Processing data...");
    }
}