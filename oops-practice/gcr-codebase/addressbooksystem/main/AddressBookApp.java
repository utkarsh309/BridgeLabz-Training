package addressbooksystem.main;

import addressbooksystem.controller.AddressBookController;

public class AddressBookApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book ");
		
		AddressBookController controller=new AddressBookController();
		
		controller.addContactFromUser(); //UC2
		controller.editContactFromUser(); //UC3
		controller.deleteContactFromUser();  // UC4
		
	}

}
