package reflection;

import java.lang.reflect.Field;

class Person {

    private int age = 20;
}

public class AccessPrivateField {

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        // Get Class object
        Class<?> cls = person.getClass();

        // Get private field
        Field field = cls.getDeclaredField("age");

        // Allow access to private field
        field.setAccessible(true);

        // Read old value
        System.out.println("Old age: " + field.get(person));

        // Modify value
        field.set(person, 30);

        // Read new value
        System.out.println("New age: " + field.get(person));
    }
}
