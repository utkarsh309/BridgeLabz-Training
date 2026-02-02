package annotations.repeatableannotation;

import java.lang.reflect.Method;

public class BugReportTest {

    public static void main(String[] args) throws Exception {

        BugTracker tracker = new BugTracker();
        Method method = tracker.getClass().getMethod("processData");

        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println("Bug: " + bug.description());
        }

        tracker.processData();
    }
}
