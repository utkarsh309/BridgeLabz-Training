package Inheritance;

//Class Definition
class Order{
	
	//Attributes
	protected int orderId;
	protected String orderDate;
	
	//constructor
	Order(int orderId,String orderDate){
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	
	//display Method
	public void displayInfo() {
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
	}
	
}

//Class Definition
class ShippedOrder extends Order{
	
	//Attributes
	protected int trackingNumber;
	
	//Constructor
	ShippedOrder(int orderId,String orderDate,int trackingNumber){
		super(orderId,orderDate);//calls order class constructor
		this.trackingNumber=trackingNumber;
	}
	
	//Override display Method
	@Override
	public void displayInfo() {
		super.displayInfo(); //calls order class method
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
	}
	
}

//Class Definition
class DeliveredOrder extends ShippedOrder{
	
	//Attributes
	private String deliveryDate;
	
	//Constructor
	DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate){
		super(orderId,orderDate,trackingNumber);//call shipped order class constructor
		this.deliveryDate=deliveryDate;
	}
	
	//Override display Method
		@Override
		public void displayInfo() {
			super.displayInfo(); //call shipped order class method
			System.out.println("Delivery Date: "+deliveryDate);
		}

}


public class RetailOrderManagement {

	public static void main(String[] args) {
		
		DeliveredOrder order1=new DeliveredOrder(101,"01-01-2026",569856,"03-01-2026");
		
		order1.displayInfo();
	}

}
