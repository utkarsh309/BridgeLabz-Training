package string.level1;
//Create TextToUpperCase class to convert the complete text to uppercase and compare the results
import java.util.Scanner;
public class TextToUpperCase {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store text and take input from the user
		String sentence=input.nextLine();
		
		//Call the method to  convert each character to uppercase
		String upperCaseUserDefinedResult=upperCaseUserDefined(sentence);
		
		//Display result of userDefined
		System.out.println(upperCaseUserDefinedResult);
		
		//Convert using buildin method
		String upperCaseBuiltInResult=sentence.toUpperCase();
		
		//Display result of built in method
		System.out.println(upperCaseBuiltInResult);
		
		//Call the method to compare the uppercase results
		boolean result=compareString(upperCaseUserDefinedResult,upperCaseBuiltInResult);
		
		//Display the result
		System.out.println("Comparision of both the methods are "+result);
		
		//Close Scanner
		input.close();
	}
	
	//user defined method to convert to uppercase
	public static String upperCaseUserDefined(String sentence) {
		
		//Use StringBuilder to store the string
		StringBuilder uppercase=new StringBuilder();
		
		//loop through the sentence to find and convert to uppercase
		for(int index=0;index<sentence.length();index++) {
			
			char currentChar=sentence.charAt(index);
			if(currentChar>='a' && currentChar<='z') {
				
				uppercase.append((char)(currentChar-32));
				
			}else {
				uppercase.append(currentChar);
			}
		}
		return uppercase.toString();
	}
	
	//method to compare two strings
	public static boolean compareString(String first,String second) {
		
		if(first.length()!=second.length()) {
			return false;
		}
		
		//loop through the string
		for(int index=0;index<first.length();index++) {
			
			if(first.charAt(index)!=second.charAt(index)) {
				return false;
			}
			
		}
		return true;
	}

}
