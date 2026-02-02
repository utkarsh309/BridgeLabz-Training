package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodCall {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = input.nextLine();

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        MathOperations obj = new MathOperations();

        // Get Class object
        Class<?> cls = obj.getClass();

        // Get method dynamically
        Method method = cls.getMethod(methodName, int.class, int.class);

        // Invoke method
        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);
        
        //close scanner
        input.close();
        
    }
}
