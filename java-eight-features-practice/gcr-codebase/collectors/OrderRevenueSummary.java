package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order{
	
	private String customerName;
    private double orderAmount;

    public Order(String customerName, double orderAmount) {
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}

public class OrderRevenueSummary {

	public static void main(String[] args) {
		
		List<Order> orderList=new ArrayList<>();
		orderList.add(new Order("Rahul", 2000));
        orderList.add(new Order("Anita", 1500));
        orderList.add(new Order("Rahul", 2500));
        orderList.add(new Order("Anita", 1700));
        orderList.add(new Order("Mohan", 3000));
        
        Map<String,Double> revenueByCustomer=
        		orderList.stream()
        			.collect(Collectors.groupingBy(
        					order->order.getCustomerName(),
        					Collectors.summingDouble(
        							order->order.getOrderAmount()
        							)
        					));
        
        revenueByCustomer.forEach((name,amount)->
        	System.out.println(name+ " → Total Revenue: "+amount)
        		);
	}
}
