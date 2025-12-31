package constructor;

//Class Definition
public class Product {

	// Instance variables
	private String productName;
	private double price;
	
	// Class variable 
	private static int totalProducts;
	
	// Parameterized Constructor
	public Product(String productName,double price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
		
	}
	
	//instance method
	public void displayProductDetails() {
		 System.out.println("Product Name : " + productName);
	     System.out.println("Price : " + price);
	}
	
	//class methods
	public static void displayTotalProducts() {
		System.out.println("Total Products: "+totalProducts);
	}
	
	public static void main(String[]args) {
		
		Product product1=new Product("Phone",14500.0);
		product1.displayProductDetails();
		
		Product product2=new Product("Watch",2500.0);
		product2.displayProductDetails();
		
		displayTotalProducts();
		
		
	}
	
	
	
}
