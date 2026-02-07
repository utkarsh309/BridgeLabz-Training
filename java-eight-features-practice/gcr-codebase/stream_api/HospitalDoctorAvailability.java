package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Doctor {

    private String name;
    private String specialty;
    private boolean availableOnWeekend;

    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    @Override
    public String toString() {
        return name + " | " + specialty + " | Weekend Available: " + availableOnWeekend;
    }
}


public class HospitalDoctorAvailability {

	public static void main(String[] args) {
		
		List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor("Dr. Rahul", "Cardiology", true));
        doctorList.add(new Doctor("Dr. Anita", "Neurology", false));
        doctorList.add(new Doctor("Dr. Mohan", "Orthopedics", true));
        doctorList.add(new Doctor("Dr. Sneha", "Dermatology", true));
        doctorList.add(new Doctor("Dr. Arjun", "Cardiology", false));
        
        List<Doctor> availableWeekendDoctors =doctorList.stream()
        		.filter(doctor -> doctor.isAvailableOnWeekend())
        		.sorted(Comparator.comparing(doctor ->doctor.getSpecialty()))
        		.collect(Collectors.toList());
        
        System.out.println("Doctors available on weekends");
        availableWeekendDoctors.forEach(x -> System.out.println(x));
	}
}
