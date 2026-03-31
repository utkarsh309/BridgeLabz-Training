//Create StringComparision class to compare two string using charAt() and equals() method.
import java.util.Scanner;

public class StringComparision {
    
    public static void main(String[] args){

        //Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Take input of first string from user
        System.out.print("Enter the first string: ");   
        String firstString=input.next();

        //Take input of second string from user
        System.out.print("Enter the second string: ");  
        String secondString=input.next();

        //Compare two strings using charAt() method
        boolean charAtResult=stringComparisionUsingCharAt(firstString, secondString);

        //Compare two strings using equals() method
        boolean equalsResult=firstString.equals(secondString);

        //Display the results
        System.out.println("Comparison using charAt() method: " + charAtResult);
        System.out.println("Comparison using equals() method: " + equalsResult);

        //Close the scanner
        input.close();

    }

    //Method to compare two strings using charAt() method
    public static boolean stringComparisionUsingCharAt(String first,String second){
        //If lengths are not equal, return false
        if(first.length() != second.length()){
            return false;
        }

        //Compare each character of both strings
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return false;
            }
        }

        //If all characters are equal, return true
        return true;
    }
}
