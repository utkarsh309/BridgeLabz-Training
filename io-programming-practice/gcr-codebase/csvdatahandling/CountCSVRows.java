package csvdatahandling;

import java.io.*;

public class CountCSVRows {
	
	public static int countRows(String filePath) {
		
		try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
			
			//Skip heading
			reader.readLine();
			
			int count=0;//counts number of rows
			
			while(reader.readLine()!=null) {
				count++;
			}
			
			return count;
		}catch(IOException e) {
			System.out.println("Error while reading csv file");
			return -1;
		}
		
		
	}

	public static void main(String[] args) {
		
		String filePath="employee.csv";
		int rows=countRows(filePath);
		System.out.println("Number of rows "+rows);
		
	}

}
