//Create SplitTextIntoWords class to split a given text into individual words
//Without using built-in split() method.

import java.util.Scanner;
public class SplitTextIntoWords {
    
    public static void main(String[] args) {
        
        //Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        //Create a string variable to store user input
        String text = input.nextLine();

        //Method to split text into words user-defined method
        String[] words = splitTextIntoWords(text);

        //Display the words
        for(String word:words){
            System.out.println(word);
        }

        //Method to split text into words using built-in method for verification
        String[] wordsBuiltIn = text.split(" ");

        //display the words using built-in method
        for(String word:wordsBuiltIn){
            System.out.println(word);
        }

        //Comapare the results
        boolean result=compareTwoArrays(words, wordsBuiltIn);

        //Display the results
        System.out.println("Both methods have the same result "+result);

        //Close the scanner
        input.close();
    }

    //Create a method to count the length of string
    public static int findLength(String text ){

        char character;
        int index = 0;
        while(true){

            try{
                character = text.charAt(index);
                index++;
            }catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        return index;
    }

    //Create a method to split text into words
    public static String[] splitTextIntoWords(String text ){

        int LengthOfText=findLength(text);
        int wordCount=1;
        for(int index=0;index<LengthOfText;index++){
            if(text.charAt(index)==' '){
                wordCount++;
            }
        }
        String[] words=new String[wordCount];
        
        //Create a string builder to build each word
        String word="";
        int wordIndex=0;
        for(int index=0;index<LengthOfText;index++){
            
            char character=text.charAt(index);
            if(character==' '){
                words[wordIndex]=word.toString();
                wordIndex++;
                word=""; //Clear the string 
            }else if(index==LengthOfText-1){
                word=word+character;
                words[wordIndex]=word.toString();
            }else{
                word=word+character;
            } 
            
            
        }
        return words;
    }

    public static boolean compareTwoArrays(String[] arrayOne, String[] arrayTwo){
        if(arrayOne.length != arrayTwo.length){
            return false;
        }
        for(int index=0;index<arrayOne.length;index++){

            if(!arrayOne[index].equals(arrayTwo[index])){
                return false;
            }
        }
        return true;
    }
}
