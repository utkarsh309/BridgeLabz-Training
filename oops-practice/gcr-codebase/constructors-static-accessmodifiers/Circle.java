package constructor;

//Class definition
public class Circle {

	//Attributes
	private double radius;
	
	//Default constructor
	Circle(){
		radius=5.5;	
	}
	
	//Parametrized Constructor
	Circle(double radius){
		this.radius=radius;
	}
	
	//Method to display
	void displayRadius() {
		System.out.println("Radius: "+radius);
	}
	
	
	public static void main(String[] args) {
		
		//Using default constructor
		Circle circle1=new Circle();
		circle1.displayRadius();
		
		//Using parametrized constructor
		Circle circle2=new Circle(5.0);
		circle2.displayRadius();
		
		

	}
	
	

}
