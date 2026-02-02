package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {

	public static void readStudentData(String filePath) {
		
		String line;
		
		try(BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath))) {
			
			
			//Skip header
			bufferedReader.readLine();
			
			System.out.println("Student records: ");
			System.out.println("------------------");
			
			while((line=bufferedReader.readLine())!=null) {
				
				String[] studentData=line.split(",");
				
				int id = Integer.parseInt(studentData[0]);
                String name = studentData[1];
                int age = Integer.parseInt(studentData[2]);
                int marks = Integer.parseInt(studentData[3]);
                
                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println("------------------");
                
			}
			
		}catch(IOException e) {
			System.out.println("Error reading the csv file. ");
		}catch(NumberFormatException e) {
			System.out.println("Invalid number format in csv file. ");
		}
	}
	
	public static void main(String[] args) {
		
		String filePath="students.csv";
		readStudentData(filePath);
		
	}

}
