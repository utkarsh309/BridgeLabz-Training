package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Employee class
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupEmployees {

    public static void main(String[] args) {

        //Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        // Map to group by department
        Map<String, List<Employee>> map = new HashMap<>();

        // Grouping 
        for (int i = 0; i < employees.size(); i++) {

            Employee emp = employees.get(i);
            String dept = emp.department;

            // If department not present, create new list
            if (!map.containsKey(dept)) {
                map.put(dept, new ArrayList<>());
            }

            // Add employee to that department list
            map.get(dept).add(emp);
        }

        // Print result
        for (String dept : map.keySet()) {
            System.out.print(dept + ": ");
            List<Employee> list = map.get(dept);

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).name + " ");
            }
            System.out.println();
        }
    }
}
