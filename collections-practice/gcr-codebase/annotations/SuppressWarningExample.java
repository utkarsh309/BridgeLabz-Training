package annotations;

import java.util.ArrayList;

public class SuppressWarningExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(100);
        list.add(true);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
