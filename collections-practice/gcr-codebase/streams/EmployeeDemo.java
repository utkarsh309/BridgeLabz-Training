package streams;

import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", "HR", 40000));
        list.add(new Employee(2, "Bob", "IT", 50000));

        // Save (Serialize)
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.dat"));
            out.writeObject(list);
            out.close();
            System.out.println("Data saved");
        } catch (IOException e) {
            System.out.println("Error while saving");
        }

        // Load (Deserialize)
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.dat"));
            ArrayList<Employee> data = (ArrayList<Employee>) in.readObject();
            in.close();

            System.out.println("Data from file:");
            for (Employee e : data) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading");
        }
    }
}
