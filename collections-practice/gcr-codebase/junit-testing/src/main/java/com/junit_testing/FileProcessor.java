package com.junit_testing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProcessor {

	
	public void writeToFile(String filename, String content)throws IOException{
		try(FileWriter writer=new FileWriter(filename)){
			writer.write(content);
		}
	}
	
	public String readFromFile(String filename)throws IOException{
		StringBuilder content=new StringBuilder();
		
		try(FileReader reader =new FileReader(filename)){
			int ch;
			while((ch=reader.read())!=-1) {
				content.append((char)ch);
			}
		}
		return content.toString();
	}
}
