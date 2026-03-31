package reflection;

import java.lang.reflect.Method;

class SampleService {

    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            int count=i+1;
        }
    }

    public void slowMethod() {
        try {
            Thread.sleep(200); // simulate delay
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

public class MethodExecutionTime {

    public static void main(String[] args) throws Exception {

        SampleService service = new SampleService();
        Class<?> cls = service.getClass();

        // Get all methods
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            // Measure time
            long startTime = System.nanoTime();

            method.invoke(service);   // dynamic call

            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println("Method: " + method.getName() +
                "  Time taken: " + duration + " ns");
        }
    }
}
