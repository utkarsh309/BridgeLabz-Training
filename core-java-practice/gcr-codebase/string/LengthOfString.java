//Create LengthOfString class to find the length of a given string 
// without using built-in length() method.

import java.util.Scanner;
public class LengthOfString {
    
    public static void main(String[] args) {
         
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        //Create a string variable to store user input
        String text = input.next();

        //Method to find length of string
        int length = findLength(text);

        System.out.println("Length of the string: " + length);

        //Build in method to verify the result
        int lengthBuiltIn = text.length();
        System.out.println("Length using built-in method: " + lengthBuiltIn);

        //Close the scanner
        input.close();

    }
    //Create a method to calculate length of the string
    public static int findLength(String text ){

        char character;
        int index = 0;
        while(true){

            try{
                character = text.charAt(index);
                index++;
            }catch(StringIndexOutOfBoundsException e){
                return index;
            }
        }

    }

}
