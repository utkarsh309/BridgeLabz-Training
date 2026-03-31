package oopsPractice;

//Create AreaOfCircle class to calculate area of circle
public class AreaOfCircle {
	
	//Attributes
	double radius;
	
	//Constructor
	public AreaOfCircle(double radius) {
		this.radius=radius;
	}
	
	//Method to calculate area 
	public double area() {
		
		return Math.PI*radius*radius;
	}
	
	//Method to calculate Circumference
		public double circumference() {
			
			return 2*Math.PI*radius;
		}
	
	
	//Main Method 
	public static void main(String[] args) {
		
		AreaOfCircle area1=new AreaOfCircle(5.8);
		
		System.out.println("Area of the circle is :"+area1.area());
		System.out.println("Area of the circle is :"+area1.circumference());

	}

}
