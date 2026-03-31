package oopsPillars;

//Abstract Class
abstract class Product{
	//Attributes
	private int productId;
	private String name;
	private double price;
	
	//abstract method
	abstract double calculateDiscount();
	
	//Setter method
	public void setDetails(int productId,String name,double price) {
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	
	//getter methods
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	// Concrete method
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

//Interface
interface Taxable{
	//Abstract methods
	public double calculateTax();
	public String getTaxDetails();
	
}

//Sub Class
class Electronics extends Product implements Taxable{
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.10; //10% discount
	}
	
	@Override
	public double calculateTax() {
		return getPrice()*0.18; //18% tax
	}
	
	@Override
	public String getTaxDetails() {
		return "Electronics 18% tax";
	}
	
	
}

//Sub Class
class Clothing extends Product implements Taxable{
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.15; //15% discount
	}
	
	@Override
	public double calculateTax() {
		return getPrice()*0.12; //12% tax
	}
	
	@Override
	public String getTaxDetails() {
		return "Clothing 12% tax";
	}
}

//Sub Class
class Groceries extends Product{
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.05; //5% discount
	}
}


//Main Method
public class ECommercePlatform {

	public static void calculateFinalPrice(Product[] products) {
		
		for(Product product:products) {
			
			double discount=product.calculateDiscount();
			double tax=0;
			
			if(product instanceof Taxable) {
				tax=((Taxable)product).calculateTax();
				System.out.println(((Taxable)product).getTaxDetails());
			}
			
			double finalPrice=product.getPrice()+tax-discount;
			
			product.displayProductDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Product product1=new Electronics();
		Product product2=new Clothing();
		Product product3=new Groceries();
		
		product1.setDetails(101, "Laptop", 60000);
		product2.setDetails(102, "Shirt", 2000);
		product3.setDetails(103, "Rice", 200);
		
		Product[] products= {product1,product2,product3};
		
		calculateFinalPrice(products);
		
		
	}

}
