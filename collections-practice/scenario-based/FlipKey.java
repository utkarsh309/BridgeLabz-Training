package scenario;

import java.util.Scanner;

public class FlipKey {
	
	public static String cleanseAndInvert(String word) {
		
		if(word==null||word.length()<6) {
			return "";
		}
		if(!word.matches("^[a-zA-Z]+$")) {
			return "";
		}
		
		word=word.toLowerCase();
		StringBuilder generatedWord=new StringBuilder();

		for(int i=0;i<word.length();i++) {
			int ascii=(int)word.charAt(i);
			if(ascii%2!=0) {
				generatedWord.append((char)ascii);
			}
		}
		generatedWord=generatedWord.reverse();

		for(int i=0;i<generatedWord.length();i++) {

			char ch=generatedWord.charAt(i);

			if(i%2==0) {
				generatedWord.setCharAt(i,Character.toUpperCase(ch));
			}
		}

		return generatedWord.toString();
	
	}

	public static void main(String[] args) {
	
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String word=input.nextLine();
		
		String result=cleanseAndInvert(word);
		
		if(result.equals("")) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("The generated key is - "+result);
		}
		
		//Close Scanner
		input.close();
		
	}
}
