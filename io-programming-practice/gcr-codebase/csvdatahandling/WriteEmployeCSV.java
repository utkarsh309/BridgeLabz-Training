package csvdatahandling;

import java.io.*;

public class WriteEmployeCSV {
	
	//Method to write employee data to csv file
	public static void writeEmployeeData(String filePath) {
		
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))){
		
			 writer.write("ID,Name,Department,Salary");
	         writer.newLine();
	         writer.write("101,Rahul,IT,55000");
	         writer.newLine();
	         writer.write("102,Amit,HR,48000");
	         writer.newLine();
	         writer.write("103,Anita,HR,48000");
	         writer.newLine();
	         writer.write("104,Aditya,IT,48000");
	         writer.newLine();
	         writer.write("105,sumit,HR,48000");

	         System.out.println("CSV file written successfully.");
			
			
		}catch(IOException e) {
			System.out.println("Error occured while writing to the csv file ");
		}
		
	}

	public static void main(String[] args) {
		
		String filePath="employee.csv";
		writeEmployeeData(filePath);
		
	}

}
