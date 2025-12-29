//Create RemoveDuplicates class to remove all duplicate characters from a given string

import java.util.Scanner;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        
        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string ");
        String text = input.nextLine();

        //Call the method to modify the string
        String modifiedString=createModifiedString(text);

        //display the result
        System.out.println(modifiedString);

        //Close the scanner
        input.close();
    }

    public static String createModifiedString(String text){

        String modified="";

        boolean isDuplicate;
        //loop to find the duplicate
        for(int i=0;i<text.length();i++){
            isDuplicate=false;
             for(int j=0;j<modified.length();j++){
                
                if(i!=j&&text.charAt(i)==modified.charAt(j)){
                    isDuplicate=true;
                    break;
                }
             }
             if(!isDuplicate){
                modified+=text.charAt(i);
             }

        }
        return modified;
    }
}
