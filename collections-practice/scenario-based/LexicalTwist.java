package scenario;

import java.util.*;
public class LexicalTwist {

	//Method to reverse the word
	public static String reverseWord(String word) {
		
		StringBuilder reversedWord=new StringBuilder();
		
		for(int i=word.length()-1;i>=0;i--) {
			reversedWord.append(word.charAt(i));
		}
		
		return reversedWord.toString();
	}
	public static boolean isReversed(String first,String second) {
		
		return first.equalsIgnoreCase(second);
	}
	
	//Method to count vowel and consonant and further operations
	public static String vowelConsonantOperations(String word) {
		
		int vowel=0;
		int consonant=0;
		for(int i=0;i<word.length();i++) {
			
			char ch=word.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowel++;
			}else {
				consonant++;
			}
		}
		
		if(vowel>consonant) {
			char[]vowels=new char[2];
			int count=0;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					if(count==0||vowels[count-1]!=ch) {
						vowels[count]=ch;
						count++;
					}
				}
				if(count==2) {
					break;
				}
			}
			
			return new String(vowels, 0, count);
			
		}else if(consonant>vowel) {
			
			char[]consonants=new char[2];
			int count=0;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if("AEIOU".indexOf(ch)==-1) {
					if(count==0||consonants[count-1]!=ch) {
						consonants[count]=ch;
						count++;
					}
				}
				if(count==2) {
					break;
				}
			}
			return new String(consonants,0,count);
			
		}else {
			
			return "Vowels and consonants are equal";
			
		}	
	}
	
	public static void solvePuzzle(String first,String second) {
		
		//reverse the second word
		String secondReversedWord=reverseWord(second);
		
		if(isReversed(first,secondReversedWord)) {
			
			String firstReversedWord=reverseWord(first).toLowerCase();
			
			StringBuilder transformedWord=new StringBuilder();
			for(int i=0;i<firstReversedWord.length();i++) {
				char ch=firstReversedWord.charAt(i);
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					transformedWord.append('@');
				}else {
					transformedWord.append(ch);
				}
			}
			System.out.println(transformedWord);
			
		}else {
			String combined=(first+second).toUpperCase();
			String result=vowelConsonantOperations(combined);
			System.out.println(result);
				
		}
	}
	
	//Main method
	public static void main(String[] args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the First word: ");
		String firstWord=input.nextLine();
		firstWord=firstWord.trim();
		
		//Validation
		if(firstWord.contains(" ")) {
			System.out.println(firstWord+" Is an Invalid word");
			return;
		}
		
		System.out.println("Enter the Second word");
		String secondWord=input.nextLine();
		secondWord=secondWord.trim();
		
		//Validation
		if(secondWord.contains(" ")) {
			System.out.println(secondWord+" Is an Invalid word");
			return;
		}
		
		//Calls the solvePuzzle method 
		solvePuzzle(firstWord,secondWord);
		
		//Close Scanner
		input.close();
	}

}
