package reflection;

import java.lang.reflect.Method;

class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        // Get Class object
        Class<?> cls = calculator.getClass();

        // Get private method
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        // Allow access to private method
        method.setAccessible(true);

        // Invoke method
        int result = (int) method.invoke(calculator, 5, 4);

        System.out.println("Result: " + result);
    }
}
