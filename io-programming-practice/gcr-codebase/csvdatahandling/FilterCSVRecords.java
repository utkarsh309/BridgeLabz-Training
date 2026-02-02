package csvdatahandling;

import java.io.*;

public class FilterCSVRecords {
	
	//Method to filter the record
	public static void filterRecord(String filePath) {
		
		String line;
		
		try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
			
			//Skip heading
			reader.readLine();
			
			
			
			while((line=reader.readLine())!=null) {
				
				String[] studentData=line.split(",");
				
				int id = Integer.parseInt(studentData[0]);
                String name = studentData[1];
                int age = Integer.parseInt(studentData[2]);
                int marks = Integer.parseInt(studentData[3]);
				
				if(marks>80) {
					System.out.println("ID    : " + id);
	                System.out.println("Name  : " + name);
	                System.out.println("Age   : " + age);
	                System.out.println("Marks : " + marks);
	                System.out.println("------------------");
				}
			}
		}catch(IOException e) {
			System.out.println("Error while reading csv file.");
		}
		
		
	}

	public static void main(String[] args) {
		
		String filePath="students.csv";
		filterRecord(filePath);

	}

}
