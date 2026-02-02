package reflection;

import java.lang.reflect.Constructor;

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

public class CreateObjectUsingReflection {

    public static void main(String[] args) throws Exception {

        // Load class dynamically
        Class<?> cls = Class.forName("Student");

        // Get constructor
        Constructor<?> constructor =cls.getDeclaredConstructor(int.class, String.class);

        // Create object dynamically (no new keyword)
        Object obj = constructor.newInstance(101, "Rahul");

        // Type cast
        Student student = (Student) obj;
        student.display();
    }
}