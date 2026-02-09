package com.healthclinicapp.model;

public class Patient {
	
	private int patientId;
	private String name;
	private String DOB;
	private String phone;
	private String email;
	private String address;
	private String bloodGroup;
	public Patient(String name, String dOB, String phone,
			String email,String address, String bloodGroup) {
		this.name = name;
		DOB = dOB;
		this.phone = phone;
		this.email=email;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}
	
	public Patient() {
		
	}
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	
	
	

}
