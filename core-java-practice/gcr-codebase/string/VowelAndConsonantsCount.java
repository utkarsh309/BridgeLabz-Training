//Create VowelAndConsonantsCount class to count the number of vowels and consonants in a given string.

import java.util.Scanner;
public class VowelAndConsonantsCount {
  
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Create a variable to hold the input text
        System.out.println("Enter a text:");
        String inputText = input.nextLine();

        //Method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputText);

        //Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }

    //Method to check if a character is vowel,consonant or neither
    public static String checkVowelConsonant(char character){
        
        if(character>='A' && character<='Z'){
            character=(char)(character+32);
        }

        if(character>='a' && character<='z'){

            if(character=='a'||character=='e'||character=='i'||
                character=='o'||character=='u'
            ){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    //Method to count vowel and consonant
    public static int[] countVowelsAndConsonants(String text){

        int vowelCount=0;
        int consonantCount=0;

        for(int index=0;index<text.length();index++){

            String result=checkVowelConsonant(text.charAt(index));

            if(result.equals("Vowel")){
                vowelCount++;
            }
            if(result.equals("Consonant")){
                consonantCount++;
            }
        }
        return new int[]{vowelCount,consonantCount};
    }
}
