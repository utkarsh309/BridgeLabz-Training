package csvdatahandling;

import java.io.*;
public class SearchCSVRecords {
	
	public static void searchRecords(String filePath,String name)
	{
		
		String line;
		try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
			
			//Skip heading
			reader.readLine();
			boolean found=false;
			
			while((line=reader.readLine())!=null) {
				
				String[] employeeData=line.split(",");
				
                String empName = employeeData[1];
                String department = employeeData[2];
                int salary = Integer.parseInt(employeeData[3]);
                
                if(empName.equalsIgnoreCase(name)) {
                	System.out.println("Department: "+department);
                	System.out.println("Salary: "+salary);
                	found=true;
                	break;
                }
			}
			
			if(!found) {
				System.out.println("No record found");
			}
			
			
		}catch(IOException e) {
			System.out.println("Error while reading csv file");
		}

	}
	public static void main(String[]args) {
		
		String filePath="employee.csv";
		
		String name="Aditya";
		searchRecords(filePath,name);
	}
}
