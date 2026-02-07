package stream_api;

import java.util.List;

public class TransformCustomerNames {

	public static void main(String[] args) {
		
		List<String> customerNames=
				List.of("rahul","anita","mohan","utkarsh","vikas");
		
		customerNames.stream()
			.map(name ->name.toUpperCase())
			.sorted()
			.forEach(System.out::println);

	}

}
