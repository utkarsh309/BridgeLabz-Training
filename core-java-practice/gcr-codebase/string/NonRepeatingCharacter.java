//Create NonRepeatingCharacter Class to find the  first non-repeating character in a string
import java.util.Scanner;
public class NonRepeatingCharacter {
    
    public static void main(String[] args) {
        
        //Create Scanner class object to take input from the keyboard
        Scanner input=new Scanner(System.in);

        //Create a variable to store the text
        String text=input.next();

        // call the Method to find the first non reapeating character
        Character unique=findNonRepeatingCharacter(text);

        //Display the result
        System.out.println("First non repeating character is :"+unique);

        //Close the scanner
        input.close();


    }

   //Method to find the first non reapeating character
    public static Character findNonRepeatingCharacter(String text){

        int []frequency=new int[26];

        text=text.toLowerCase();

        for(int index=0;index<text.length();index++){
            frequency[text.charAt(index)-'a']++;
        }

        for(int index=0;index<text.length();index++){

            if(frequency[text.charAt(index)-'a']==1){
                return text.charAt(index);
            }
        }
        return ' ';
    }
}
