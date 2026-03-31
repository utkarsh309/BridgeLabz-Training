package com.json_handling;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateStudentJson {

	public static void main(String[] args) {
	
		//Create JSON Array for subject
		JSONArray subjects=new JSONArray();
		
		subjects.put("Mathematics");
		subjects.put("Computer Science");
		subjects.put("Physics");
		
		
		//Create JSON object for student
		
		JSONObject student=new JSONObject();
		student.put("name","Utkarsh");
		student.put("age", 22);
		student.put("subjects", subjects);
		
		System.out.println(student.toString());
	}

}
