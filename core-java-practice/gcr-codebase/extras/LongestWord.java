//Create class LongestWord to find the longest word in a given string
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        
        //Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        //Take input string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Split the string into words using space 
        String[] words = text.split(" ");

        String longestWord=findLongestWord(words);

        //Display the result
        System.out.println("The longest word is: " + longestWord);

        //Close the scanner
        input.close();
    }

    public static String findLongestWord(String[]words){

        int longestWordIndex=0;
        int longestLength=Integer.MIN_VALUE;
        
        //loop to find the longest word
        for(int i=0;i<words.length;i++){

            if(words[i].length()>longestLength){

                longestWordIndex=i;
                longestLength=words[i].length();
            }

        }

        return words[longestWordIndex];
    }
}
