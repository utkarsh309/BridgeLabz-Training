package filehandlingandsearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

    	String filePath = "src/filehandlingandsearch/data.txt";  // File name

        try {
        	
            // Create FileReader and wrap it with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String currentLine;

            // Read each line until end of file
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
            

        } catch (IOException exception) {
            
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
