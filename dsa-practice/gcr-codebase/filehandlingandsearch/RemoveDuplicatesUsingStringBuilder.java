package filehandlingandsearch;

import java.util.Scanner;
import java.util.HashSet;

//Create RemoveDuplicatesUsingStringBuilder class to remove duplicates
public class RemoveDuplicatesUsingStringBuilder {

	//Method to remove duplicates
	public static String removeDuplicate(String text) {
		
		//Create String builder object
		StringBuilder sb=new StringBuilder();
		
		//Create hashset object
		HashSet<Character> set=new HashSet<>();
		
		//Iterate over String
		for(int i=0;i<text.length();i++) {
			
			char character=text.charAt(i);
			
			if(!set.contains(character)) {
				set.add(character);
				sb.append(character);
			}
		}
		
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		//Create scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		String text=input.nextLine();
		
		//Call remove duplicate method
		String uniqueString=removeDuplicate(text);
		
		//display result
		System.out.println("String without duplicate: "+uniqueString);
		
		//Close Scanner
		input.close();
	}

}
