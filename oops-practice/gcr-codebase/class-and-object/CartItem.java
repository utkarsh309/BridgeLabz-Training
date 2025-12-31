package oopsPractice;

//Class definition
public class CartItem {
	
	//Attributes
	private String itemName;
	private double price;
	private int quantity;
	
	//Constructor
	public CartItem(String itemName,double price,int quantity) {
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	
	//Method to display the item details
	public void displayItem() {
		System.out.println("Item: "+this.itemName+",Price: "+this.price+",Quantity: "+this.quantity);
		
	}
	
	//Method to Add item
	public void addItem(int number) {
		this.quantity=this.quantity+number;
		System.out.println("Added "+number+" of "+this.itemName+" to the cart.");
	}
	
	//Method to Add item
	public void removeItem(int number) {
		this.quantity=this.quantity-number;
		System.out.println("Removed "+number+" of "+this.itemName+" to the cart.");
	}
	
	//Method to display total cost
	public void displayCost() {
		System.out.println("Total Cost: "+this.quantity*this.price);
	}
		
	public static void main(String[] args) {
		
		CartItem cart1=new CartItem("Laptop",999,1);
		
		cart1.displayItem();
		cart1.addItem(3);
		cart1.removeItem(1);
		cart1.displayCost();

	}

}
