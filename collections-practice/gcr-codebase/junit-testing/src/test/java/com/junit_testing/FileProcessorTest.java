package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {

	private FileProcessor fileProcessor;
	private File testFile;
	
	@BeforeEach
	void setUp() {
		fileProcessor=new FileProcessor();
		testFile=new File("test-file.txt");
	}
	
	@AfterEach
	void tearDown() {
		if(testFile.exists()) {
			testFile.delete();
		}
	}
	
	@Test
	void testWriteAndReadFile()throws IOException{
		
		String content="My name is Utkarsh";
		
		fileProcessor.writeToFile(testFile.getName(),content);
		String result=fileProcessor.readFromFile(testFile.getName());

		assertEquals(content,result);
	}
	
	@Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(testFile.getName(), "File existence test");

        assertTrue(testFile.exists());
    }
	
	@Test
    void testReadNonExistingFileThrowsException() {
        assertThrows(IOException.class, () ->
                fileProcessor.readFromFile("non_existing_file.txt")
        );
    }
}
