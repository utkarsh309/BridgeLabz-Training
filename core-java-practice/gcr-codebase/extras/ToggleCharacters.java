//Create class ToggleCharacters to toggle the case of each character in a string
import java.util.Scanner;

public class ToggleCharacters {
    
    public static void main(String[] args) {
        //Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        //Take input string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String toggledString=toggleCase(text);

        //Display the result
        System.out.println("Toggled string: " + toggledString);

        //Close the scanner
        input.close();
    }
    //method to toggleCharacters
    public static String toggleCase(String text){

        String toggle="";

        for(int i=0;i<text.length();i++){

            Character ch=text.charAt(i);
            if(ch>='a'&&ch<='z'){
                toggle+=(char)(ch-32);
            }else if(ch>='A'&&ch<='Z'){
                toggle+=(char)(ch+32);
            }else{
                toggle+=ch;
            }
        }
        return toggle;
    }  
}
