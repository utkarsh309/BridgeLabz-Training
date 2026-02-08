package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {

    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}


public class StudentResultGrouping {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rahul", "A"));
        studentList.add(new Student("Anita", "B"));
        studentList.add(new Student("Mohan", "A"));
        studentList.add(new Student("Sneha", "B"));
        studentList.add(new Student("Vikas", "A"));
        
        Map<String, List<String>> studentsByGrade = studentList.stream().collect(
        		Collectors.groupingBy(Student::getGrade, 
        				Collectors.mapping(Student::getName, Collectors.toList())

        				));
		
        studentsByGrade.forEach((grade,names)->
        		System.out.println(grade + " -> " + names)
        		);
	}
}
