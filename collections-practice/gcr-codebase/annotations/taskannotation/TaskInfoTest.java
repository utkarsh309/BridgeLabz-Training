package annotations.taskannotation;

import java.lang.reflect.Method;

public class TaskInfoTest {

    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        Class<?> clazz = manager.getClass();
        Method method = clazz.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority   : " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }

        manager.completeTask();
    }
}
