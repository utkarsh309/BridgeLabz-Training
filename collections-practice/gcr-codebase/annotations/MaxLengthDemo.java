package annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

// Define @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// User class with validation in constructor
class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        // Validate using reflection
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                    "Username length exceeds maximum of " + maxLength.value()
                );
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

// Test class
public class MaxLengthDemo {

    public static void main(String[] args) {

        // Valid username
        User user1 = new User("Rahul");
        System.out.println("Username: " + user1.getUsername());

        // Invalid username (will throw exception)
        User user2 = new User("VeryLongUsername");
    }
}
