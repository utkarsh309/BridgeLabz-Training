package Inheritance;

//Class Definition
class Course{

	//Attributes
	protected String courseName;
	protected String duration;
	
	//Constructor
	Course(String courseName,String duration){
		this.courseName=courseName;
		this.duration=duration;
	}
	
	//Display Method
	public void displayInfo() {
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration);
	}
	
}

//Class Definition
class OnlineCourse extends Course{
	
	//Attributes
	protected String platform;
	protected boolean isRecorded;
	
	//Constructor
	OnlineCourse(String courseName,String duration,String platform,boolean isRecorded){
		super(courseName,duration); //calls course class constructor
		this.platform=platform;
		this.isRecorded=isRecorded;
	}
	
	//Method overriding 
	@Override
	public void displayInfo() {
		super.displayInfo(); //calls course class method
		System.out.println("Platform: "+platform);
		System.out.println("Is Recorded: "+isRecorded);
	}
	
}

//Class Definition
class PaidOnlineCourse extends OnlineCourse{
	
	//Attributes
	private double fee;
	private double discount;
	
	//Constructor
	PaidOnlineCourse(String courseName,String duration,String platform,
			boolean isRecorded,double fee,double discount){
		super(courseName,duration,platform,isRecorded); //calls Online course class Constructor
		this.fee=fee;
		this.discount=discount;
	}
	
	//Method overriding 
		@Override
		public void displayInfo() {
			super.displayInfo(); //calls Online course class method
			System.out.println("Fee: "+fee);
			System.out.println("Discount: "+discount);
		}
	
	
}


public class EducationalCourse {

	public static void main(String[] args) {
		
		PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse("Mca","2 year","Zoom",true,250000,10);
		paidOnlineCourse.displayInfo();
	}

}
