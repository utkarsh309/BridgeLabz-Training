package reflection;

import java.lang.reflect.Field;

class Configuration {

    private static String API_KEY = "OLD_KEY";
}

public class ModifyStaticField {

    public static void main(String[] args) throws Exception {

        // Get Class object
        Class<?> cls = Configuration.class;

        // Get private static field
        Field field = cls.getDeclaredField("API_KEY");

        // Allow access to private field
        field.setAccessible(true);

        // Read old value (static → pass null)
        System.out.println("Old API_KEY: " + field.get(null));

        // Modify value (static → pass null)
        field.set(null, "NEW_SECRET_KEY");

        // Read new value
        System.out.println("New API_KEY: " + field.get(null));
    }
}
