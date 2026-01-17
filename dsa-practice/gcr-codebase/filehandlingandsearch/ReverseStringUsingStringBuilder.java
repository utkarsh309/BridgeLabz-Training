package filehandlingandsearch;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		//Create a StringBuilder object
		StringBuilder sb=new StringBuilder();
		
		String name="Utkarsh";
		
		//appends name to the string builder
		sb.append(name);
		
		//reverse  the string
		sb.reverse();
		
		//Store reversed string
		String reversed=sb.toString();
		
		//Display result
		System.out.println("Original String: "+name);
		System.out.println("Reversed String: "+reversed);
		

	}

}
