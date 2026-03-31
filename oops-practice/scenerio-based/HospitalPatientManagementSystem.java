package oopsScenario;

import java.time.LocalDateTime;

//Interface
interface IPayable {
    void payBill(double amount);
}

//Abstract Patient
abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    private Doctor doctor;   // Patient linked to Doctor
    private Bill bill;       // Patient linked to Bill

    public Patient(int patientId, String name, int age, Doctor doctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    // Link Bill to Patient
    public void assignBill(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    // Abstract method
    public abstract void displayInfo();
}

//InPatient
class InPatient extends Patient {

    private int roomNumber;

    public InPatient(int patientId, String name, int age, int roomNumber, Doctor doctor) {
        super(patientId, name, age, doctor);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient Details:");
        System.out.println("ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Doctor: " + getDoctor().getName());
    }
}

//OutPatient
class OutPatient extends Patient {

    private String visitDate;

    public OutPatient(int patientId, String name, int age, String visitDate, Doctor doctor) {
        super(patientId, name, age, doctor);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient Details:");
        System.out.println("ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Doctor: " + getDoctor().getName());
    }
}

//Doctor
class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private double consultationFee;

    public Doctor(int doctorId, String name, String specialization, double consultationFee) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Doctor Details:");
        System.out.println("ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

//Bill
class Bill implements IPayable {

    private int billId;
    private double amount;
    private boolean isPaid;
    private LocalDateTime paidDateTime;

    private Patient patient;   // Bill linked to Patient

    public Bill(int billId, double amount, Patient patient) {
        this.billId = billId;
        this.amount = amount;
        this.patient = patient;
        this.isPaid = false;
    }

    @Override
    public void payBill(double amount) {
        if (amount >= this.amount) {
            isPaid = true;
            paidDateTime = LocalDateTime.now();
            System.out.println("Bill paid successfully for patient: " + patient.getName());
        } else {
            System.out.println("Insufficient amount.");
        }
    }

    public void displayBill() {
        System.out.println("Bill Details:");
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Amount: " + amount);
        System.out.println("Paid: " + (isPaid ? "Yes" : "No"));
        System.out.println("Paid On: " + (paidDateTime != null ? paidDateTime : "Not Paid Yet"));
    }
}

//Main Class
public class HospitalPatientManagementSystem {

    public static void main(String[] args) {

        // Doctor created
        Doctor doctor = new Doctor(51, "Dr. Nitish Naik", "Cardiology", 1000);

        // Patients linked to doctor
        Patient patient1 = new InPatient(11, "Amit", 24, 402, doctor);
        Patient patient2 = new OutPatient(12, "Rahul", 22, "12-10-2025", doctor);

        // Bills linked to patients
        Bill bill1 = new Bill(1001, 3500, patient1);
        patient1.assignBill(bill1);

        // Pay bill
        bill1.payBill(3500);
        System.out.println();

        // Display all details
        bill1.displayBill();
        System.out.println();

        patient1.displayInfo();
        System.out.println();

        patient2.displayInfo();
        System.out.println();

        doctor.displayInfo();
    }
}
