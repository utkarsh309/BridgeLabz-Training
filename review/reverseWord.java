package review;
//Create reverseWord class to reverse the word
import java.util.Scanner;
public class reverseWord {

	//wordReverse method
	public static String wordReverse(String word) {
		
		String newWord="";
		//loop in reverse order
		for(int i=word.length()-1;i>=0;i--) {
			
			newWord=newWord+word.charAt(i);
		}
		return newWord;
	}
	
	public static String[] reverseText(String [] words) {
		
		for(int i=0;i<words.length;i++) {
			String w1=words[i];
			words[i]=wordReverse(w1);
		}
		
		return words;
	}
	
	
	public static void main(String[] args) {
		
		//Create Scanner object to take input
		Scanner input=new Scanner(System.in);
		
		//Take input in a variable
		System.out.println("Enter a word: ");
		String text=input.nextLine();
		
		//Split the word in to array
		String [] words=text.split(" ");
		
		//call method to reverse text
		String[] reverseText=reverseText(words);
		
		
		
		for(int i=0;i<reverseText.length;i++) {
			System.out.print(reverseText[i]);
			System.out.print(" ");
		}
		
		
		
		//close Scanner
		input.close();
	}

}
