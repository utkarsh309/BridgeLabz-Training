package filehandlingandsearch;

public class ConcatenateUsingStringBuffer {

	
	public static String concatenate(String[]names) {
		
		//Create object of String Buffer
		StringBuffer sb=new StringBuffer();
		
		//Iterate through array
		for(String name:names) {
			
			sb.append(name);
			sb.append(" ");
		}
		return sb.toString();
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		String[]names= {"Utkarsh","Aditya","Rahul"};
		
		String concatenatedString=concatenate(names);
		
		//Display Result
		System.out.println("Concetenated String : "+concatenatedString);
	}

}
