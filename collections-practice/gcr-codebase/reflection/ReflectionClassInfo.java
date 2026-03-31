package reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionClassInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = input.nextLine();

        try {
            Class<?> cls = Class.forName(className);

            System.out.println("\nConstructors:");
            for (Constructor<?> c : cls.getDeclaredConstructors()) {
                System.out.println(c.getName());
            }

            System.out.println("\nMethods:");
            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(m.getName());
            }

            System.out.println("\nFields:");
            for (Field f : cls.getDeclaredFields()) {
                System.out.println(f.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        
        input.close();
    }
}
