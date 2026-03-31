package com.healthclinicapp.main;

import java.util.Scanner;

import com.healthclinicapp.exception.DuplicatePatientException;
import com.healthclinicapp.model.Patient;
import com.healthclinicapp.service.PatientService;

public class HealthAppUI {

	// Create Scanner class object for taking input form the user
	Scanner input = new Scanner(System.in);

	public void start() {
		
		boolean running=true;
		
		while(running) {
			
			System.out.println("1. Patient Management");
			System.out.println("2. Doctor Management");
			System.out.println("3. Appointment Scheduling");
			System.out.println("4. Visit Management & Medical Records");
			System.out.println("5. Billing & Payments");
			System.out.println("6. System Administration");
			System.out.println("7. Exit");
			
			System.out.println("Enter your choice: ");
			int choice=input.nextInt();
			
			switch(choice) {
			
			case 1:
				patientMenu();
				break;

			case 7:
				running=false;
				System.out.println("Thanks for using Health Clinic App");
				break;
			default:
				System.out.println("Invalid choice");
				continue;
			
			}
		}
	}
	
	
	public void patientMenu() {
		
		boolean running=true;
		
		while(running) {
		
		System.out.println("---------------------------------");
		System.out.println("Welcome to Patient Management");
		System.out.println("---------------------------------");
		System.out.println("1. Register New Patient");
		System.out.println("2. Update Patient Information");
		System.out.println("3. Search Patient Records");
		System.out.println("4. View Patient Visit History");
		System.out.println("5. back menu");
		
		
		System.out.println("Enter your choice: ");
		int choice=input.nextInt();
		input.nextLine();//captures new line
		
		switch(choice) {
		
		case 1:
			createNewPatient();
			break;

		case 5:
			running=false;
			System.out.println("Thanks for using Patient Management");
			break;
		default:
			System.out.println("Invalid choice");
			continue;
		
		}
		
		}
		
	}
	
	public void createNewPatient() {
	
		
		System.out.print("Enter Name: ");
		String name=input.nextLine();
		
		System.out.print("Enter DOB (yyyy-mm-dd): ");
		String DOB=input.nextLine();
		
		System.out.print("Enter Phone: ");
		String phone=input.nextLine();
		
		System.out.print("Enter Email: ");
		String email=input.nextLine();
		
		System.out.print("Enter Address: ");
		String address=input.nextLine();
		
		System.out.print("Enter Blood Group: ");
		String bloodGroup=input.nextLine();
		
		Patient patient=new Patient(name,DOB,phone,email,address,bloodGroup);
		
		PatientService service=new PatientService();
		
		try {
			
			int patientId=service.registerPatient(patient);
			 System.out.println("Patient registered successfully");
	         System.out.println("Generated Patient ID: " + patientId);
			
			
		}catch(DuplicatePatientException e) {
			System.out.println(e.getMessage());
		}
		
	
		
	}
}
