package scenerioBased2;

//Create CafeteriaMenu class to display menu and get item by index
import java.util.Scanner;
public class CafeteriaMenu {

	public static void main(String[] args) {
		
		//Create Scanner  object to take input form the keyboard
		Scanner input=new Scanner(System.in);
		
		String[] menu= {"momos","chai","coffee","bread","coke","pasta","paratha","maggie","roll","curd"};
		
		//call  method
		displayMenu(menu);
		
		System.out.println("Enter the Index to get order: ");
		int index=input.nextInt();
		
		//call method
		getItemByIndex(index-1,menu);
		
		//Close Scanner
		input.close();

	}
	
	//Method to display the menu
	public static void displayMenu(String []menu) {
		
		for(int index=0;index<menu.length;index++) {
			
			System.out.println("Index "+(index+1)+" "+menu[index]);
		}
		
	}
	
	//Method to get item by index
	public static void getItemByIndex(int index,String[] menu) {
		
		System.out.println("Your Item is : "+menu[index]);
	}

}
