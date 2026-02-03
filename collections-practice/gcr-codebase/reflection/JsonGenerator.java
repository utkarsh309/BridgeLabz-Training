package reflection;

import java.lang.reflect.Field;

class Student2 {

    private int id;
    private String name;
    private int age;

    Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class JsonGenerator {

    // Method to convert object to JSON-like string
    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"")
                .append(field.getName())
                .append("\":");

            Object value = field.get(obj);

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        Student2 student = new Student2(101, "Rahul", 20);
        System.out.println(toJson(student));
    }
}