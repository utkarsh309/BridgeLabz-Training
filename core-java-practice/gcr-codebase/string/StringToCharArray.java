package string.level1;

//Create StringToCharArray class to compare build-in and user defined to Char Array methods
import java.util.Scanner;
public class StringToCharArray {

	public static void main(String[] args) {

		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store string and take input from the user
		System.out.println("Enter a string ");
		String text=input.next();
		
		//Store the returned char array of built in method
		char [] stringCharactersBuildInResult=text.toCharArray();
		
		//Store the returned char array of user defined  method
		char [] stringCharactersUserDefinedResult=stringUserDefined(text);
		
		//Compares the result of two method
		boolean result=stringCharactersComparision(stringCharactersBuildInResult,stringCharactersUserDefinedResult);
		
		//Display the result
		System.out.println("Comparision of both the methods are "+result);
		
		//close the scanner
		input.close();
		
	}
	
	//Method to return characters of string
	public static char[] stringUserDefined(String str) {
		
		//Define a char array to store characters in array
		char [] characterArray=new char[str.length()];
		
		for(int index=0;index<str.length();index++) {
			
			characterArray[index]=str.charAt(index);
		}
		
		return characterArray;
	}
	
	//Method to compare the two char array
	public static boolean stringCharactersComparision(char[] arrayFirst,char[]arraySecond) {
		
		//length check of two array
		if(arrayFirst.length!=arraySecond.length) {
			return false;
		}
		
		for(int index=0;index<arrayFirst.length;index++) {
			
			if(arrayFirst[index]!=arraySecond[index]) {
				return false;
			}
		}
		return true;
	}
	

}
