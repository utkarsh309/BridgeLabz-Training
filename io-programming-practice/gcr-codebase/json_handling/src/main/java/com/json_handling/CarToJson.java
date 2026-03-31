package com.json_handling;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
	
	private String brand;
    private String model;
    private int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
}

public class CarToJson {

	public static void main(String[] args) {
		
		try {
		ObjectMapper objectMapper=new ObjectMapper();
		
		//Create car object
		Car car=new Car("Toyota","Innova",2023);
		
		//convert java object to json string
		String jsonString=objectMapper.writeValueAsString(car);
		
		System.out.println(jsonString);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
