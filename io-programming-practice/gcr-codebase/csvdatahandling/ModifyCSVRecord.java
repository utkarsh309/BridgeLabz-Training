package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ModifyCSVRecord {
	
	public static void modifyRecords(String inputFile,String outputFile)
	{
		
		String line;
		try(BufferedReader reader=new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile))	
			)
		{
			
			
			String heading=reader.readLine();
			writer.write(heading);
			writer.newLine();
			
			while((line=reader.readLine())!=null) {
				
				String[] employeeData=line.split(",");
				
				int id=Integer.parseInt(employeeData[0]);
                String empName = employeeData[1];
                String department = employeeData[2];
                double salary = Double.parseDouble(employeeData[3]);
                
                if(department.equalsIgnoreCase("IT")) {
                	salary=salary+(salary*0.10);
                }
                writer.write(id+","+empName+","+department+","+salary);
                writer.newLine();
			}
			
			
		}catch(IOException e) {
			System.out.println("Error while reading csv file");
		}

	}

	public static void main(String[]args) {
		
		String inputFile="employee.csv";
		String outputFile="updatedEmployee.csv";
		
		modifyRecords(inputFile,outputFile);
		
		
	}
}
