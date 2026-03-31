//Create DisplayWordsUsing2dArray class to display words of a given string
//using a 2D array along with the length of each word.

import java.util.Scanner;

public class DisplayWordsUsing2dArray {
    
    public static void main(String[] args) {
        
         //Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        //Create a string variable to store user input
        String text = input.nextLine();

        //Method to split text into words user-defined method
        String[] words = splitTextIntoWords(text);

        //Method to split text into words using built-in method for verification
        String[] wordsBuiltIn = text.split(" ");

        
        //Display the 2d array
        String [][] words2DArray = create2dArray(words);

        //Display the results
        System.out.println("Words and their lengths using 2D array:");
        for(int i=0;i<words2DArray.length;i++){
            System.out.println(words2DArray[i][0] + " : " + words2DArray[i][1]);
        }

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

    //Create a method to create 2D array from words
    public static String[][] create2dArray(String[] words){
        int numberOfWords=words.length;
        String[][] words2DArray=new String[numberOfWords][2];
        for(int i=0;i<numberOfWords;i++){
            words2DArray[i][0]=words[i];
            words2DArray[i][1]=Integer.toString(findLength(words[i]));
        }   
        return words2DArray;
}

}
