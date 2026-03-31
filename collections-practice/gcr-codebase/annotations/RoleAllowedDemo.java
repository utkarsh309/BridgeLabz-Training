package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Define class-level annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RoleAllowed {
    String value();   // required role
}

// Secure class using annotation
@RoleAllowed("ADMIN")
class AdminService {

    public void deleteUser() {
        System.out.println("User deleted successfully");
    }
}

// Main class
public class RoleAllowedDemo {

    // Simulate current user role
    static String currentUserRole = "USER"; // try "ADMIN"

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();
        Class<?> cls = service.getClass();

        // Check if class has RoleAllowed annotation
        if (cls.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();

            if (!currentUserRole.equals(requiredRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        // Access granted → invoke method
        Method method = cls.getMethod("deleteUser");
        method.invoke(service);
    }
}
