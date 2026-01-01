package keywords;

public class Patient {
	
		//Static variable
		private static String hospitalName="City Hospital";
		private static int totalPatient=0;
		
		//Instance variable
		private String name;
		private int age;
		private String ailment;
		
		
		//final variable
		private final String patientID;
		
		public Patient(String name,int age,String ailment,String patientID) {
			this.name=name;
			this.age=age;
			this.ailment=ailment;
			this.patientID=patientID;
			totalPatient++;
		}
		
		//Static method to display totalPatient
		public static void displayTotalPatient() {
			System.out.println("Total Patient: "+totalPatient);
		}
		
		//Static method to display Hospital name
		public static void displayHospitalName() {
			System.out.println("Hospital Name: "+hospitalName);
		}
		
		
		//display details
		public void displayPatientDetails() {
			if(this instanceof Patient) {
			System.out.println("Hospital Name: "+hospitalName);
			System.out.println("Patient ID: "+patientID);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Ailment: "+ailment);
			}else {
				System.out.println("Invalid Object");
			}
		}
		
		
		public static void main(String[] args) {
			
			Patient patient1=new Patient("Lathika",30,"Flu","P001");
			Patient patient2=new Patient("Lidiya",45,"Fracture","P002");
			
			Patient.displayTotalPatient();
			patient1.displayPatientDetails();
			patient2.displayPatientDetails();
			
		
	}

}
