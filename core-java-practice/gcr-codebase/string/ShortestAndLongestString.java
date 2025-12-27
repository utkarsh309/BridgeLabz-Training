//Create ShortestAndLongestString class to find the shortest and longest strings from the text
import java.util.Scanner;
public class ShortestAndLongestString {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Create a variable to hold the input text
        System.out.println("Enter a text:");
        String inputText = input.nextLine();

        //Split the input text into words
        String[] words=splitTextIntoWords(inputText);

        //create a 2d array to hold words and their lengths
        String[][] wordsAndLengths=create2dArray(words);

        //Find the shortest and longest words
        String[] shortestAndLongest=findShortestAndLongest(wordsAndLengths);

        //Display the results
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        //Close Scanner
        input.close();
    }

    //Method to find the length
    public static int findTheLength(String text){
        int count=0;
        char character;

        while(true){
        try{
            character=text.charAt(count);
            count++;
        }catch(StringIndexOutOfBoundsException exception){
                break;

        }
        }
    return count;
    }


    //Method to split text into words
    public static String[] splitTextIntoWords(String text){
       int lengthOfString=findTheLength(text);
        int wordsCount=1;

       //Calculate the total number of words
       for(int index=0;index<lengthOfString;index++){

        if(text.charAt(index)==' '){
            wordsCount++;
        }

       }
       //create a String array of size wordsCount
       String [] words=new String[wordsCount];

       String word="";
       int count=0;
       
       //loop to find the word 
       for(int index=0;index<lengthOfString;index++){
        if(text.charAt(index)==' '){
            words[count++]=word;
            word="";
        }else if(index==lengthOfString-1){
            word+=text.charAt(index);
            words[count]=word;
        }else{
            word+=text.charAt(index);

        }
        
       }
       return words;
    }

    //Method that returns 2d array with the word and length
    public static String[][] create2dArray(String[] array){

        String [][] wordsAndLength=new String[array.length][2];
        for(int index=0;index<array.length;index++){
             wordsAndLength[index][0]=array[index];
             wordsAndLength[index][1]=Integer.toString(findTheLength(array[index]));
        }

        return wordsAndLength;
    }

    //Method to find the shortest and longest string
    public static String[] findShortestAndLongest(String[][]wordsAndLength){

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength=Integer.MAX_VALUE;
        int longestLength=Integer.MIN_VALUE;

        for(int index=0;index<wordsAndLength.length;index++){

            int currentLength=Integer.parseInt(wordsAndLength[index][1]);

            if(currentLength<shortestLength){
                shortestLength=currentLength;
                shortestIndex=index;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = index;
            }

        }
        String shortestWord=wordsAndLength[shortestIndex][0];
        String largestWord=wordsAndLength[longestIndex][0];
        return new String[]{shortestWord,largestWord};

    }

}
