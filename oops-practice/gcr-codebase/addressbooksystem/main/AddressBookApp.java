package addressbooksystem.main;

import addressbooksystem.controller.AddressBookController;

public class AddressBookApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book ");
		
		AddressBookController controller=new AddressBookController();
		
		controller.startApplication();
		
	}

}
