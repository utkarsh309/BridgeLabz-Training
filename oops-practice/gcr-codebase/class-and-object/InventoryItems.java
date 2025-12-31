package oopsPractice;
//Class definition
public class InventoryItems {

	//Attributes
	private String itemCode;
	private int price;
	private String itemName;
	
	//Constructor
	public InventoryItems(String itemCode,int price,String itemName) {
		this.itemCode=itemCode;
		this.price=price;
		this.itemName=itemName;
		
	}
	
	//Display method 
	public void display() {
		System.out.println("itemCode: "+itemCode);
		System.out.println("itemPrice: "+price);
		System.out.println("itemName: "+itemName);
		
	}
	
	
	//Main Method
	public static void main(String[] args) {
		
		InventoryItems items1=new InventoryItems("01AA",500,"Water bottle");
		InventoryItems items2=new InventoryItems("01BB",700,"Rice");
		InventoryItems items3=new InventoryItems("02AA",400,"blackboard");
		
		items1.display();
		System.out.println("==================");
		items2.display();
		System.out.println("==================");
		items3.display();
		System.out.println("==================");
		

	}

}
