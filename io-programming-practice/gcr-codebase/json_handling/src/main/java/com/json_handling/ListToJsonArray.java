package com.json_handling;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;


class Student {

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ListToJsonArray {

    public static void main(String[] args) {
        try {
            // Create list of Java objects
            List<Student> students = new ArrayList<>();
            students.add(new Student(1, "Utkarsh"));
            students.add(new Student(2, "Aman"));
            students.add(new Student(3, "Riya"));

            // Convert list to JSON array
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(students);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.getMessage();
        }
    }
}