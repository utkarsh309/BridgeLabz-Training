//Create VowelAndConsonantsCount class to count the number of vowels and consonants in a given string.
//and return the vowel and consonant in a table format.

import java.util.Scanner;
public class VowelAndConsonantsCountTable {
  
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Create a variable to hold the input text
        System.out.println("Enter a text:");
        String inputText = input.nextLine();

        //Call the method to store vowels and consonants in a table format
        String[][] vowelAndConsonant = findCharacterType(inputText);

        //Display the results
        displayTable(vowelAndConsonant);

        //Close Scanner
        input.close();
        
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

    //Method to store vowel and consonant
    public static String[][] findCharacterType(String text){

        String[][]table=new String[text.length()][2];

        for(int index=0;index<text.length();index++){

            String result=checkVowelConsonant(text.charAt(index));

            if(result.equals("Vowel")){
                table[index][0]=String.valueOf(text.charAt(index));
                table[index][1]="Vowel";
            }
            else if(result.equals("Consonant")){
                table[index][0]=String.valueOf(text.charAt(index));
                table[index][1]="Consonant";
            }
            else{
                table[index][0]=String.valueOf(text.charAt(index));
                table[index][1]="Not a Letter";
            }
            
        }
        return table;
    }
    //Method to display the table
    public static void displayTable(String[][] table){

        System.out.println("Character\tType");
        for(int i=0;i<table.length;i++){
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
}

}
