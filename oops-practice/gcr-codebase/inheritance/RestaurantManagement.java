package Inheritance;

//SuperClass
class Person{
	
	//Attributes
	protected String name;
	protected int id;
	
	//Constructor
	Person(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	// Common method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

//Interface
interface Worker{
	
	//Method
	public void performDuties();
	
}

//subclasses
class Chef extends Person implements Worker{
	
	//constructor
	Chef(String name,int id){
		super(name,id); //calls parent constructor
	}
	
	//Overriding method
	@Override
	public void performDuties() {
		System.out.println("Duty: Cooking");
	}
	
}

//subclasses
class Waiter extends Person implements Worker{
	
	//constructor
	Waiter(String name,int id){
		super(name,id); //calls parent constructor
	}
	//Overriding method
	@Override
	public void performDuties() {
		System.out.println("Duty: Serving");
	}
}


public class RestaurantManagement {

	public static void main(String[] args) {
		
		Chef chef1=new Chef("Sumit",101);
		Waiter waiter1=new Waiter("Rohan",102);
		
		chef1.displayInfo();
		chef1.performDuties();
		System.out.println();
		waiter1.displayInfo();
		waiter1.performDuties();
	}

}
