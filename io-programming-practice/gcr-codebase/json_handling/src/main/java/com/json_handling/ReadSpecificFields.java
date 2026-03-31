package com.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadSpecificFields {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper objectMapper=new ObjectMapper();
			
			//Read JSON file
			JsonNode rootNode=objectMapper.readTree(new File("user.json"));
			
			//Extract Specific fields
			String name=rootNode.get("name").asText();
			String email=rootNode.get("email").asText();
			
			System.out.println("Name: "+name);
			System.out.println("Email: "+email);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
