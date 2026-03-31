package csvdatahandling;

import java.io.*;
import java.util.*;

//Class Student
class Student{
	
	//Attributes
	private int id;
	private String name;
	private int age;
	private int marks;
	
	public Student(int id,String name,int age,int marks) {
		this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [ID="+id+", Name="+name+", Age="+age
				+", Marks="+marks+"]";
	}
}


public class CSVToStudentObject {

	public static void main(String[] args) {
		
		String filePath="students.csv";
		List<Student> students=readStudents(filePath);
		
		//Display Students
		for(Student student:students) {
			System.out.println(student);
		}

	}
	
	public static List<Student> readStudents(String filePath){
		
		List<Student> studentList=new ArrayList<>();
		String line;
		
		try(BufferedReader reader =new BufferedReader(new FileReader(filePath))){
			
			//Skip header
			reader.readLine();
			
			while((line=reader.readLine())!=null) {
				
				String[]data=line.split(",");
				
				int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int marks = Integer.parseInt(data[3].trim());
                
                Student student=new Student(id,name,age,marks);
                studentList.add(student);
			}
			
		}catch(IOException e) {
			System.out.println("Error reading CSV file.");
		}
		
		return studentList;
	}

}
