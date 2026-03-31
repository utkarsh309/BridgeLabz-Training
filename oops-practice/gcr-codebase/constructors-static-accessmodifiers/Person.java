package constructor;

//Class Definition
public class Person {

	//Attributes
	private String name;
	private int age;
	
	//Parametrized Constructor
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//copy constructor
	public Person(Person otherPerson) {
		this.name=otherPerson.name;
		this.age=otherPerson.age;
	}
	
	//Display details
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	
	public static void main(String[] args) {
		
		Person person1=new Person("Utkarsh",23);
		person1.display();
		
		//copy constructor
		Person person2=new Person(person1);
		person2.display();

	}

}
