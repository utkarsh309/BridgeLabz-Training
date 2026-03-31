package stream_api;

import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {
		
		List<Double> stockPrices=List.of(560.00,555.25,689.30);
		
		stockPrices.forEach(price ->
		    System.out.println("Stock Price: "+price));

	}

}
