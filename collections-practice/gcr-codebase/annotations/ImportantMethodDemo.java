package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

//  Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";   
}

// Class using the annotation
class Service {

    @ImportantMethod
    public void payment() {
        System.out.println("Payment processing");
    }

    @ImportantMethod(level = "MEDIUM")
    public void report() {
        System.out.println("Report generation");
    }

    public void helper() {
        System.out.println("Helper method");
    }
}

// 3️⃣ Main class (Reflection)
public class ImportantMethodDemo {

    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im =method.getAnnotation(ImportantMethod.class);

                System.out.println("Method: " + method.getName() +
                    " Level: " + im.level()
                );
            }
        }
    }
}
