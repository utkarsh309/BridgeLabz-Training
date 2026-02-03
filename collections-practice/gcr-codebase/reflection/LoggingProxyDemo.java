package reflection;

import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class LoggingProxyDemo {

    public static void main(String[] args) {

        Greeting real = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (Object p, Method m, Object[] a) -> {
                    System.out.println("Calling: " + m.getName());
                    return m.invoke(real, a);
                }
        );

        proxy.sayHello();
    }
}