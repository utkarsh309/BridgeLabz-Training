package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// 1️⃣ Define @Todo annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {

    String task();                // description of task
    String assignedTo();          // developer name
    String priority() default "MEDIUM"; 
}

// 2️⃣ Apply annotation to methods
class ProjectService {

    @Todo(
        task = "Implement login feature",
        assignedTo = "Rahul",
        priority = "HIGH"
    )
    public void login() {
    }

    @Todo(
        task = "Add report download option",
        assignedTo = "Anita"
    )
    public void generateReport() {
    }

    public void helperMethod() {
        // not a pending task
    }
}

// Retrieve and print pending tasks using Reflection
public class TodoAnnotationDemo {

    public static void main(String[] args) {

        Class<ProjectService> cls = ProjectService.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method     : " + method.getName());
                System.out.println("Task       : " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority   : " + todo.priority());
              }
        }
    }
}
