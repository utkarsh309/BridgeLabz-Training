//Create class SubstringOccurences to find the number of occurrences of a substring in a given string
import java.util.Scanner;

public class SubstringOccurences {
    
    public static void main(String[] args) {
        
        //Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        //Take input string from the user
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();
        System.out.print("Enter the substring to search for: ");
        String subString = input.nextLine();

        int occurences=countSubstringOccurrences(mainString, subString);

        //Display the result
        System.out.println("The substring '" + subString + "' occurs " + occurences + " times in the main string.");

        //Close the scanner
        input.close();
    }

    public static int countSubstringOccurrences(String main,String sub){

        int mainLength=main.length();
        int subLength=sub.length();
        int count=0;

        for(int i=0;i<=mainLength-subLength;i++){

            String temp=main.substring(i,i+subLength);

            if(temp.equals(sub)){
                count++;
            }   

        }
        return count;
    }
}
