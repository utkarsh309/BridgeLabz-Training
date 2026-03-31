package reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Students {

    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class CustomObjectMapper {

    // Generic method to map properties to object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties)
            throws Exception {

        // Create object using reflection
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Loop through map entries
        for (Map.Entry<String, Object> entry : properties.entrySet()) {

            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            // Get field from class
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true); // allow private access

            // Set value
            field.set(obj, fieldValue);
        }

        return obj;
    }

    public static void main(String[] args) throws Exception {

        // Create map with values
        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Rahul");
        data.put("age", 20);

        // Convert map to object
        Students student = toObject(Students.class, data);

        // Print result
        System.out.println(student);
    }
}