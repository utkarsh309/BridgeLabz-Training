//Create SubstringComparision class to compare two substrings using substring() and userdefined method.
import java.util.Scanner;
public class SubstringComparision {
    
    public static void main(String[] args){
        //Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Take input of first string from user
        System.out.print("Enter the string: ");   
        String firstString=input.next();

        //Take input of start and end indices for substring from user
        System.out.print("Enter the start index for substring: ");  
        int startIndex=input.nextInt();
        System.out.print("Enter the end index for substring: ");  
        int endIndex=input.nextInt();

        //Extract substrings using substring() method
        String substringUsingBuildInMethod=firstString.substring(startIndex, endIndex);
        
        //Extract substrings using userdefined method
        String substringUsingUserDefinedMethod=stringSubstringUsingUserDefinedMethod(firstString, startIndex, endIndex);

        //Compare the two substrings
        boolean comparisionResult=stringComparision(substringUsingBuildInMethod, substringUsingUserDefinedMethod);

        //Display the result
        System.out.println("Comparison of substrings: " + comparisionResult);

        //Close the scanner
        input.close();
    }

    //Method to extract substring using userdefined method
    public static String stringSubstringUsingUserDefinedMethod(String str, int start, int end){
        String result="";
        for(int i=start; i<end; i++){
            result+=str.charAt(i);
        }
        return result;
    }
    //Method to compare two substrings
    public static boolean stringComparision(String first, String second){
        //If lengths are not equal, return false
        if(first.length() != second.length()){
            return false;
        }

        //Compare each character of both substrings
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return false;
            }
        }

        //If all characters are equal, return true
        return true;
    }
}
