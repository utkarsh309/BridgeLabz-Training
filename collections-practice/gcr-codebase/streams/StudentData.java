package streams;

import java.io.*;

public class StudentData {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // Writing data
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {

            out.writeInt(101);          // roll number
            out.writeUTF("Utkarsh");    // name
            out.writeDouble(8.7);       // GPA

            System.out.println("Student data saved.");

        } catch (IOException e) {
            System.out.println("Error while writing data.");
        }

        //Reading data
        try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {

            int roll = in.readInt();
            String name = in.readUTF();
            double gpa = in.readDouble();

            System.out.println("Student data from file:");
            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading data.");
        }
    }
}
