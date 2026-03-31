package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

// Class with methods to measure
class TaskService {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            // small work
        }
    }

    @LogExecutionTime
    public void slowTask() {
        try {
            Thread.sleep(200); // simulate delay
        } catch (Exception e) {
        }
    }

    public void helperTask() {
        // not logged
    }
}

// Main class using Reflection
public class LogExecutionTimeDemo {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();
        Class<?> cls = service.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();   // start time
                method.invoke(service);           // call method
                long end = System.nanoTime();     // end time

                System.out.println("Method: " + method.getName() +
                    " | Time: " + (end - start) + " ns"
                );
            }
        }
    }
}
