package csvdatahandling;

import java.io.*;
import java.util.*;

class StudentData {
    String name;
    int age;
    Integer marks;
    String grade;

    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = null;
        this.grade = null;
    }
}


public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        mergeCSVFiles(file1, file2, outputFile);
    }

    public static void mergeCSVFiles(String file1, String file2, String outputFile) {

        Map<Integer, StudentData> studentMap = new LinkedHashMap<>();

        // Read students1.csv
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {

            String line = reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());

                studentMap.put(id, new StudentData(name, age));
            }

        } catch (IOException e) {
            System.out.println("Error reading students1.csv");
        }

        // Read students2.csv
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {

            String line = reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                int marks = Integer.parseInt(data[1].trim());
                String grade = data[2].trim();

                if (studentMap.containsKey(id)) {
                    StudentData student = studentMap.get(id);
                    student.marks = marks;
                    student.grade = grade;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading students2.csv");
        }

        // Write merged CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            writer.write("ID,Name,Age,Marks,Grade");
            writer.newLine();

            for (Map.Entry<Integer, StudentData> entry : studentMap.entrySet()) {

                int id = entry.getKey();
                StudentData s = entry.getValue();

                String marks = (s.marks == null) ? "NA" : s.marks.toString();
                String grade = (s.grade == null) ? "NA" : s.grade;

                writer.write(id + "," + s.name + "," + s.age + "," + marks + "," + grade);
                writer.newLine();
            }

            System.out.println("CSV files merged successfully.");

        } catch (IOException e) {
            System.out.println("Error writing merged CSV file");
        }
    }
}