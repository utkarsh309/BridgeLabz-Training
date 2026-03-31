//Create RemoveLeadingTrailingSpaces class to trim the leading and trailing spaces from a string using the charAt() method 
import java.util.Scanner;

public class RemoveLeadingTrailingSpaces {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Create a string with leading and trailing spaces
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        //Call the method to return startring and ending index without leading and trailing spaces
        int [] indices = findTrimmedIndices(input);

        //Extract the trimmed string using the indices
        String trimmedFromUserDefinedMethod=createSubstring(input, indices[0], indices[1]);

       //Remove leading and trailing spaces using built-in method
        String trimmedFromBuiltInMethod = input.trim();

       //Compare and display the results
       boolean result=compareTwoStrings(trimmedFromUserDefinedMethod, trimmedFromBuiltInMethod);
       System.out.println("Both methods comparision have the result "+ result);

        //Close the scanner
        scanner.close();

    }

    //Method to find starting and ending index without leading and trailing spaces
    public static int[] findTrimmedIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character from the start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 to make it exclusive
    }

    //Method to find the trimmed string
    public static String createSubstring(String text,int start,int end){

        StringBuilder trimmedString=new StringBuilder();

        for(int index=start;index<end;index++){

            trimmedString.append(text.charAt(index));
        }
        System.out.println(trimmedString.toString());
        return trimmedString.toString();

    }

    //Method to compare two strings

    public static boolean compareTwoStrings(String first,String second){

        if(first.length()!=second.length()){
            return false;
        }

        for(int index=0;index<first.length();index++){

            if(first.charAt(index)!=second.charAt(index)){
                return false;
            }
        }

        return true;
    }

}
